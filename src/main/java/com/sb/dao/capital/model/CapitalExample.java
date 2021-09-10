package com.sb.dao.capital.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CapitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapitalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria)this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria)this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria)this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria)this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdIsNull() {
            addCriterion("securities_id is null");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdIsNotNull() {
            addCriterion("securities_id is not null");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdEqualTo(Integer value) {
            addCriterion("securities_id =", value, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdNotEqualTo(Integer value) {
            addCriterion("securities_id <>", value, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdGreaterThan(Integer value) {
            addCriterion("securities_id >", value, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("securities_id >=", value, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdLessThan(Integer value) {
            addCriterion("securities_id <", value, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdLessThanOrEqualTo(Integer value) {
            addCriterion("securities_id <=", value, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdIn(List<Integer> values) {
            addCriterion("securities_id in", values, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdNotIn(List<Integer> values) {
            addCriterion("securities_id not in", values, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdBetween(Integer value1, Integer value2) {
            addCriterion("securities_id between", value1, value2, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andSecuritiesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("securities_id not between", value1, value2, "securitiesId");
            return (Criteria)this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria)this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDateEqualTo(Date value) {
            addCriterion("trade_date =", value, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateNotEqualTo(Date value) {
            addCriterion("trade_date <>", value, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateGreaterThan(Date value) {
            addCriterion("trade_date >", value, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date >=", value, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateLessThan(Date value) {
            addCriterion("trade_date <", value, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(Date value) {
            addCriterion("trade_date <=", value, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateIn(List<Date> values) {
            addCriterion("trade_date in", values, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateNotIn(List<Date> values) {
            addCriterion("trade_date not in", values, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateBetween(Date value1, Date value2) {
            addCriterion("trade_date between", value1, value2, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andTradeDateNotBetween(Date value1, Date value2) {
            addCriterion("trade_date not between", value1, value2, "tradeDate");
            return (Criteria)this;
        }

        public Criteria andPassNumIsNull() {
            addCriterion("pass_num is null");
            return (Criteria)this;
        }

        public Criteria andPassNumIsNotNull() {
            addCriterion("pass_num is not null");
            return (Criteria)this;
        }

        public Criteria andPassNumEqualTo(BigDecimal value) {
            addCriterion("pass_num =", value, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumNotEqualTo(BigDecimal value) {
            addCriterion("pass_num <>", value, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumGreaterThan(BigDecimal value) {
            addCriterion("pass_num >", value, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pass_num >=", value, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumLessThan(BigDecimal value) {
            addCriterion("pass_num <", value, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pass_num <=", value, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumIn(List<BigDecimal> values) {
            addCriterion("pass_num in", values, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumNotIn(List<BigDecimal> values) {
            addCriterion("pass_num not in", values, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pass_num between", value1, value2, "passNum");
            return (Criteria)this;
        }

        public Criteria andPassNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pass_num not between", value1, value2, "passNum");
            return (Criteria)this;
        }

        public Criteria andCapitalIsNull() {
            addCriterion("capital is null");
            return (Criteria)this;
        }

        public Criteria andCapitalIsNotNull() {
            addCriterion("capital is not null");
            return (Criteria)this;
        }

        public Criteria andCapitalEqualTo(BigDecimal value) {
            addCriterion("capital =", value, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalNotEqualTo(BigDecimal value) {
            addCriterion("capital <>", value, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalGreaterThan(BigDecimal value) {
            addCriterion("capital >", value, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("capital >=", value, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalLessThan(BigDecimal value) {
            addCriterion("capital <", value, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("capital <=", value, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalIn(List<BigDecimal> values) {
            addCriterion("capital in", values, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalNotIn(List<BigDecimal> values) {
            addCriterion("capital not in", values, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital between", value1, value2, "capital");
            return (Criteria)this;
        }

        public Criteria andCapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("capital not between", value1, value2, "capital");
            return (Criteria)this;
        }

    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;
        private final String typeHandler;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;

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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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
    }
}
