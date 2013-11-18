package com.dandelion.membership.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CalendarEventExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public CalendarEventExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("ID =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("ID <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("ID >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("ID >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("ID <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("ID <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("ID in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("ID not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("ID between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("ID not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andCssclassIsNull() {
			addCriterion("cssClass is null");
			return (Criteria) this;
		}

		public Criteria andCssclassIsNotNull() {
			addCriterion("cssClass is not null");
			return (Criteria) this;
		}

		public Criteria andCssclassEqualTo(String value) {
			addCriterion("cssClass =", value, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassNotEqualTo(String value) {
			addCriterion("cssClass <>", value, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassGreaterThan(String value) {
			addCriterion("cssClass >", value, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassGreaterThanOrEqualTo(String value) {
			addCriterion("cssClass >=", value, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassLessThan(String value) {
			addCriterion("cssClass <", value, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassLessThanOrEqualTo(String value) {
			addCriterion("cssClass <=", value, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassLike(String value) {
			addCriterion("cssClass like", value, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassNotLike(String value) {
			addCriterion("cssClass not like", value, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassIn(List<String> values) {
			addCriterion("cssClass in", values, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassNotIn(List<String> values) {
			addCriterion("cssClass not in", values, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassBetween(String value1, String value2) {
			addCriterion("cssClass between", value1, value2, "cssclass");
			return (Criteria) this;
		}

		public Criteria andCssclassNotBetween(String value1, String value2) {
			addCriterion("cssClass not between", value1, value2, "cssclass");
			return (Criteria) this;
		}

		public Criteria andStartIsNull() {
			addCriterion("start is null");
			return (Criteria) this;
		}

		public Criteria andStartIsNotNull() {
			addCriterion("start is not null");
			return (Criteria) this;
		}

		public Criteria andStartEqualTo(Date value) {
			addCriterionForJDBCDate("start =", value, "start");
			return (Criteria) this;
		}

		public Criteria andStartNotEqualTo(Date value) {
			addCriterionForJDBCDate("start <>", value, "start");
			return (Criteria) this;
		}

		public Criteria andStartGreaterThan(Date value) {
			addCriterionForJDBCDate("start >", value, "start");
			return (Criteria) this;
		}

		public Criteria andStartGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start >=", value, "start");
			return (Criteria) this;
		}

		public Criteria andStartLessThan(Date value) {
			addCriterionForJDBCDate("start <", value, "start");
			return (Criteria) this;
		}

		public Criteria andStartLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("start <=", value, "start");
			return (Criteria) this;
		}

		public Criteria andStartIn(List<Date> values) {
			addCriterionForJDBCDate("start in", values, "start");
			return (Criteria) this;
		}

		public Criteria andStartNotIn(List<Date> values) {
			addCriterionForJDBCDate("start not in", values, "start");
			return (Criteria) this;
		}

		public Criteria andStartBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start between", value1, value2, "start");
			return (Criteria) this;
		}

		public Criteria andStartNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("start not between", value1, value2,
					"start");
			return (Criteria) this;
		}

		public Criteria andEndIsNull() {
			addCriterion("end is null");
			return (Criteria) this;
		}

		public Criteria andEndIsNotNull() {
			addCriterion("end is not null");
			return (Criteria) this;
		}

		public Criteria andEndEqualTo(Date value) {
			addCriterionForJDBCDate("end =", value, "end");
			return (Criteria) this;
		}

		public Criteria andEndNotEqualTo(Date value) {
			addCriterionForJDBCDate("end <>", value, "end");
			return (Criteria) this;
		}

		public Criteria andEndGreaterThan(Date value) {
			addCriterionForJDBCDate("end >", value, "end");
			return (Criteria) this;
		}

		public Criteria andEndGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("end >=", value, "end");
			return (Criteria) this;
		}

		public Criteria andEndLessThan(Date value) {
			addCriterionForJDBCDate("end <", value, "end");
			return (Criteria) this;
		}

		public Criteria andEndLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("end <=", value, "end");
			return (Criteria) this;
		}

		public Criteria andEndIn(List<Date> values) {
			addCriterionForJDBCDate("end in", values, "end");
			return (Criteria) this;
		}

		public Criteria andEndNotIn(List<Date> values) {
			addCriterionForJDBCDate("end not in", values, "end");
			return (Criteria) this;
		}

		public Criteria andEndBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("end between", value1, value2, "end");
			return (Criteria) this;
		}

		public Criteria andEndNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("end not between", value1, value2, "end");
			return (Criteria) this;
		}

		public Criteria andUrlIsNull() {
			addCriterion("url is null");
			return (Criteria) this;
		}

		public Criteria andUrlIsNotNull() {
			addCriterion("url is not null");
			return (Criteria) this;
		}

		public Criteria andUrlEqualTo(String value) {
			addCriterion("url =", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotEqualTo(String value) {
			addCriterion("url <>", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThan(String value) {
			addCriterion("url >", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlGreaterThanOrEqualTo(String value) {
			addCriterion("url >=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThan(String value) {
			addCriterion("url <", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLessThanOrEqualTo(String value) {
			addCriterion("url <=", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlLike(String value) {
			addCriterion("url like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotLike(String value) {
			addCriterion("url not like", value, "url");
			return (Criteria) this;
		}

		public Criteria andUrlIn(List<String> values) {
			addCriterion("url in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotIn(List<String> values) {
			addCriterion("url not in", values, "url");
			return (Criteria) this;
		}

		public Criteria andUrlBetween(String value1, String value2) {
			addCriterion("url between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andUrlNotBetween(String value1, String value2) {
			addCriterion("url not between", value1, value2, "url");
			return (Criteria) this;
		}

		public Criteria andCreateddateIsNull() {
			addCriterion("CreatedDate is null");
			return (Criteria) this;
		}

		public Criteria andCreateddateIsNotNull() {
			addCriterion("CreatedDate is not null");
			return (Criteria) this;
		}

		public Criteria andCreateddateEqualTo(Date value) {
			addCriterion("CreatedDate =", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateNotEqualTo(Date value) {
			addCriterion("CreatedDate <>", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateGreaterThan(Date value) {
			addCriterion("CreatedDate >", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
			addCriterion("CreatedDate >=", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateLessThan(Date value) {
			addCriterion("CreatedDate <", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateLessThanOrEqualTo(Date value) {
			addCriterion("CreatedDate <=", value, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateIn(List<Date> values) {
			addCriterion("CreatedDate in", values, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateNotIn(List<Date> values) {
			addCriterion("CreatedDate not in", values, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateBetween(Date value1, Date value2) {
			addCriterion("CreatedDate between", value1, value2, "createddate");
			return (Criteria) this;
		}

		public Criteria andCreateddateNotBetween(Date value1, Date value2) {
			addCriterion("CreatedDate not between", value1, value2,
					"createddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateIsNull() {
			addCriterion("ModifiedDate is null");
			return (Criteria) this;
		}

		public Criteria andModifieddateIsNotNull() {
			addCriterion("ModifiedDate is not null");
			return (Criteria) this;
		}

		public Criteria andModifieddateEqualTo(Date value) {
			addCriterion("ModifiedDate =", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateNotEqualTo(Date value) {
			addCriterion("ModifiedDate <>", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateGreaterThan(Date value) {
			addCriterion("ModifiedDate >", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
			addCriterion("ModifiedDate >=", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateLessThan(Date value) {
			addCriterion("ModifiedDate <", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateLessThanOrEqualTo(Date value) {
			addCriterion("ModifiedDate <=", value, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateIn(List<Date> values) {
			addCriterion("ModifiedDate in", values, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateNotIn(List<Date> values) {
			addCriterion("ModifiedDate not in", values, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateBetween(Date value1, Date value2) {
			addCriterion("ModifiedDate between", value1, value2, "modifieddate");
			return (Criteria) this;
		}

		public Criteria andModifieddateNotBetween(Date value1, Date value2) {
			addCriterion("ModifiedDate not between", value1, value2,
					"modifieddate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tb_event
	 * @mbggenerated  Mon Nov 18 15:00:22 CST 2013
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_event
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 18 11:05:18 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}