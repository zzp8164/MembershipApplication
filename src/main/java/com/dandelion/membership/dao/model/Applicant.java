package com.dandelion.membership.dao.model;

import java.util.Date;

public class Applicant {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.ID
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.applicantName
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private String applicantname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.applyDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private Date applydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.referrerName
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private String referrername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.creditCardNumber
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private String creditcardnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.memberType
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private String membertype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.CreatedDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private Date createddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.ModifiedDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private Date modifieddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_applicant.IsDeleted
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    private Boolean isdeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.ID
     *
     * @return the value of tb_applicant.ID
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.ID
     *
     * @param id the value for tb_applicant.ID
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.applicantName
     *
     * @return the value of tb_applicant.applicantName
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public String getApplicantname() {
        return applicantname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.applicantName
     *
     * @param applicantname the value for tb_applicant.applicantName
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.applyDate
     *
     * @return the value of tb_applicant.applyDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public Date getApplydate() {
        return applydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.applyDate
     *
     * @param applydate the value for tb_applicant.applyDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.referrerName
     *
     * @return the value of tb_applicant.referrerName
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public String getReferrername() {
        return referrername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.referrerName
     *
     * @param referrername the value for tb_applicant.referrerName
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setReferrername(String referrername) {
        this.referrername = referrername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.creditCardNumber
     *
     * @return the value of tb_applicant.creditCardNumber
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public String getCreditcardnumber() {
        return creditcardnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.creditCardNumber
     *
     * @param creditcardnumber the value for tb_applicant.creditCardNumber
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setCreditcardnumber(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.memberType
     *
     * @return the value of tb_applicant.memberType
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public String getMembertype() {
        return membertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.memberType
     *
     * @param membertype the value for tb_applicant.memberType
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setMembertype(String membertype) {
        this.membertype = membertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.CreatedDate
     *
     * @return the value of tb_applicant.CreatedDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public Date getCreateddate() {
        return createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.CreatedDate
     *
     * @param createddate the value for tb_applicant.CreatedDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.ModifiedDate
     *
     * @return the value of tb_applicant.ModifiedDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public Date getModifieddate() {
        return modifieddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.ModifiedDate
     *
     * @param modifieddate the value for tb_applicant.ModifiedDate
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_applicant.IsDeleted
     *
     * @return the value of tb_applicant.IsDeleted
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public Boolean getIsdeleted() {
        return isdeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_applicant.IsDeleted
     *
     * @param isdeleted the value for tb_applicant.IsDeleted
     *
     * @mbggenerated Fri Nov 08 21:20:31 CST 2013
     */
    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }
}