package com.dandelion.membership.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.dandelion.membership.util.JSONUtilities;



public class WebserviceErrorResolver implements HandlerExceptionResolver {

	private static final int Internal_Server_Error_CODE = 500;

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) {
		if (!enable) {
			return null;
		}
		MembershipException exception;
		if (arg3.getClass() == MembershipException.class) {
			exception = (MembershipException) arg3;
		} else if(arg3.getClass().equals(JSONException.class)){
			exception = new MembershipException(WebserviceErrors.ILLEGAL_PARAMETER_ERROR_CODE, 
					WebserviceErrors.ILLEGAL_PARAMETER_ERROR_MESSAGE, arg3);
		}else {
			exception = new MembershipException(
					WebserviceErrors.SERVER_INTERNAL_ERROR_CODE,
					WebserviceErrors.SERVER_INTERNAL_ERROR_MESSAGE, arg3);
		}
		logger.error("Error catched by OoPassErrorResolver: ", exception);
		JSONObject json = JSONUtilities.getErrorJSON(exception);
		arg1.setStatus(Internal_Server_Error_CODE);
		return new ModelAndView("json", "j", json.toString());
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	private boolean enable;
	private Logger logger = LoggerFactory.getLogger(WebserviceErrorResolver.class);
}
