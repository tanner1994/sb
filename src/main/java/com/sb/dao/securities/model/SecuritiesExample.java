package com.sb.dao.securities.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecuritiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SecuritiesExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria)this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria)this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria)this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria)this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria)this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria)this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria)this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria)this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria)this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria)this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria)this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria)this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria)this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria)this;
        }

        public Criteria andHelpCodeIsNull() {
            addCriterion("help_code is null");
            return (Criteria)this;
        }

        public Criteria andHelpCodeIsNotNull() {
            addCriterion("help_code is not null");
            return (Criteria)this;
        }

        public Criteria andHelpCodeEqualTo(String value) {
            addCriterion("help_code =", value, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeNotEqualTo(String value) {
            addCriterion("help_code <>", value, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeGreaterThan(String value) {
            addCriterion("help_code >", value, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("help_code >=", value, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeLessThan(String value) {
            addCriterion("help_code <", value, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeLessThanOrEqualTo(String value) {
            addCriterion("help_code <=", value, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeLike(String value) {
            addCriterion("help_code like", value, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeNotLike(String value) {
            addCriterion("help_code not like", value, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeIn(List<String> values) {
            addCriterion("help_code in", values, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeNotIn(List<String> values) {
            addCriterion("help_code not in", values, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeBetween(String value1, String value2) {
            addCriterion("help_code between", value1, value2, "helpCode");
            return (Criteria)this;
        }

        public Criteria andHelpCodeNotBetween(String value1, String value2) {
            addCriterion("help_code not between", value1, value2, "helpCode");
            return (Criteria)this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria)this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria)this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria)this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria)this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria)this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria)this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria)this;
        }

        public Criteria andBourseIdIsNull() {
            addCriterion("bourse_id is null");
            return (Criteria)this;
        }

        public Criteria andBourseIdIsNotNull() {
            addCriterion("bourse_id is not null");
            return (Criteria)this;
        }

        public Criteria andBourseIdEqualTo(Integer value) {
            addCriterion("bourse_id =", value, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdNotEqualTo(Integer value) {
            addCriterion("bourse_id <>", value, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdGreaterThan(Integer value) {
            addCriterion("bourse_id >", value, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bourse_id >=", value, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdLessThan(Integer value) {
            addCriterion("bourse_id <", value, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("bourse_id <=", value, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdIn(List<Integer> values) {
            addCriterion("bourse_id in", values, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdNotIn(List<Integer> values) {
            addCriterion("bourse_id not in", values, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdBetween(Integer value1, Integer value2) {
            addCriterion("bourse_id between", value1, value2, "bourseId");
            return (Criteria)this;
        }

        public Criteria andBourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bourse_id not between", value1, value2, "bourseId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdIsNull() {
            addCriterion("sclassify_id is null");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdIsNotNull() {
            addCriterion("sclassify_id is not null");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdEqualTo(Integer value) {
            addCriterion("sclassify_id =", value, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdNotEqualTo(Integer value) {
            addCriterion("sclassify_id <>", value, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdGreaterThan(Integer value) {
            addCriterion("sclassify_id >", value, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sclassify_id >=", value, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdLessThan(Integer value) {
            addCriterion("sclassify_id <", value, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdLessThanOrEqualTo(Integer value) {
            addCriterion("sclassify_id <=", value, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdIn(List<Integer> values) {
            addCriterion("sclassify_id in", values, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdNotIn(List<Integer> values) {
            addCriterion("sclassify_id not in", values, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdBetween(Integer value1, Integer value2) {
            addCriterion("sclassify_id between", value1, value2, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andSclassifyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sclassify_id not between", value1, value2, "sclassifyId");
            return (Criteria)this;
        }

        public Criteria andExerciseDateIsNull() {
            addCriterion("exercise_date is null");
            return (Criteria)this;
        }

        public Criteria andExerciseDateIsNotNull() {
            addCriterion("exercise_date is not null");
            return (Criteria)this;
        }

        public Criteria andExerciseDateEqualTo(Date value) {
            addCriterion("exercise_date =", value, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateNotEqualTo(Date value) {
            addCriterion("exercise_date <>", value, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateGreaterThan(Date value) {
            addCriterion("exercise_date >", value, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateGreaterThanOrEqualTo(Date value) {
            addCriterion("exercise_date >=", value, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateLessThan(Date value) {
            addCriterion("exercise_date <", value, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateLessThanOrEqualTo(Date value) {
            addCriterion("exercise_date <=", value, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateIn(List<Date> values) {
            addCriterion("exercise_date in", values, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateNotIn(List<Date> values) {
            addCriterion("exercise_date not in", values, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateBetween(Date value1, Date value2) {
            addCriterion("exercise_date between", value1, value2, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExerciseDateNotBetween(Date value1, Date value2) {
            addCriterion("exercise_date not between", value1, value2, "exerciseDate");
            return (Criteria)this;
        }

        public Criteria andExercisePriceIsNull() {
            addCriterion("exercise_price is null");
            return (Criteria)this;
        }

        public Criteria andExercisePriceIsNotNull() {
            addCriterion("exercise_price is not null");
            return (Criteria)this;
        }

        public Criteria andExercisePriceEqualTo(BigDecimal value) {
            addCriterion("exercise_price =", value, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceNotEqualTo(BigDecimal value) {
            addCriterion("exercise_price <>", value, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceGreaterThan(BigDecimal value) {
            addCriterion("exercise_price >", value, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exercise_price >=", value, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceLessThan(BigDecimal value) {
            addCriterion("exercise_price <", value, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exercise_price <=", value, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceIn(List<BigDecimal> values) {
            addCriterion("exercise_price in", values, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceNotIn(List<BigDecimal> values) {
            addCriterion("exercise_price not in", values, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exercise_price between", value1, value2, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andExercisePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exercise_price not between", value1, value2, "exercisePrice");
            return (Criteria)this;
        }

        public Criteria andIfAccrualIsNull() {
            addCriterion("if_accrual is null");
            return (Criteria)this;
        }

        public Criteria andIfAccrualIsNotNull() {
            addCriterion("if_accrual is not null");
            return (Criteria)this;
        }

        public Criteria andIfAccrualEqualTo(Boolean value) {
            addCriterion("if_accrual =", value, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualNotEqualTo(Boolean value) {
            addCriterion("if_accrual <>", value, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualGreaterThan(Boolean value) {
            addCriterion("if_accrual >", value, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_accrual >=", value, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualLessThan(Boolean value) {
            addCriterion("if_accrual <", value, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualLessThanOrEqualTo(Boolean value) {
            addCriterion("if_accrual <=", value, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualIn(List<Boolean> values) {
            addCriterion("if_accrual in", values, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualNotIn(List<Boolean> values) {
            addCriterion("if_accrual not in", values, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualBetween(Boolean value1, Boolean value2) {
            addCriterion("if_accrual between", value1, value2, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfAccrualNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_accrual not between", value1, value2, "ifAccrual");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillIsNull() {
            addCriterion("if_fairdistill is null");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillIsNotNull() {
            addCriterion("if_fairdistill is not null");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillEqualTo(Boolean value) {
            addCriterion("if_fairdistill =", value, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillNotEqualTo(Boolean value) {
            addCriterion("if_fairdistill <>", value, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillGreaterThan(Boolean value) {
            addCriterion("if_fairdistill >", value, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_fairdistill >=", value, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillLessThan(Boolean value) {
            addCriterion("if_fairdistill <", value, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillLessThanOrEqualTo(Boolean value) {
            addCriterion("if_fairdistill <=", value, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillIn(List<Boolean> values) {
            addCriterion("if_fairdistill in", values, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillNotIn(List<Boolean> values) {
            addCriterion("if_fairdistill not in", values, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillBetween(Boolean value1, Boolean value2) {
            addCriterion("if_fairdistill between", value1, value2, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfFairdistillNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_fairdistill not between", value1, value2, "ifFairdistill");
            return (Criteria)this;
        }

        public Criteria andIfWfsyIsNull() {
            addCriterion("if_wfsy is null");
            return (Criteria)this;
        }

        public Criteria andIfWfsyIsNotNull() {
            addCriterion("if_wfsy is not null");
            return (Criteria)this;
        }

        public Criteria andIfWfsyEqualTo(Boolean value) {
            addCriterion("if_wfsy =", value, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyNotEqualTo(Boolean value) {
            addCriterion("if_wfsy <>", value, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyGreaterThan(Boolean value) {
            addCriterion("if_wfsy >", value, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_wfsy >=", value, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyLessThan(Boolean value) {
            addCriterion("if_wfsy <", value, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyLessThanOrEqualTo(Boolean value) {
            addCriterion("if_wfsy <=", value, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyIn(List<Boolean> values) {
            addCriterion("if_wfsy in", values, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyNotIn(List<Boolean> values) {
            addCriterion("if_wfsy not in", values, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyBetween(Boolean value1, Boolean value2) {
            addCriterion("if_wfsy between", value1, value2, "ifWfsy");
            return (Criteria)this;
        }

        public Criteria andIfWfsyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_wfsy not between", value1, value2, "ifWfsy");
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
