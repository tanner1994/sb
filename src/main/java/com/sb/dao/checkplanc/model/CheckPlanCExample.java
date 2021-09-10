package com.sb.dao.checkplanc.model;

import java.util.ArrayList;
import java.util.List;

public class CheckPlanCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckPlanCExample() {
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

        public Criteria andCheckPlanIdIsNull() {
            addCriterion("check_plan_id is null");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdIsNotNull() {
            addCriterion("check_plan_id is not null");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdEqualTo(Integer value) {
            addCriterion("check_plan_id =", value, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdNotEqualTo(Integer value) {
            addCriterion("check_plan_id <>", value, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdGreaterThan(Integer value) {
            addCriterion("check_plan_id >", value, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_plan_id >=", value, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdLessThan(Integer value) {
            addCriterion("check_plan_id <", value, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdLessThanOrEqualTo(Integer value) {
            addCriterion("check_plan_id <=", value, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdIn(List<Integer> values) {
            addCriterion("check_plan_id in", values, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdNotIn(List<Integer> values) {
            addCriterion("check_plan_id not in", values, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdBetween(Integer value1, Integer value2) {
            addCriterion("check_plan_id between", value1, value2, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andCheckPlanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("check_plan_id not between", value1, value2, "checkPlanId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdIsNull() {
            addCriterion("bill_type_id is null");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdIsNotNull() {
            addCriterion("bill_type_id is not null");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdEqualTo(Integer value) {
            addCriterion("bill_type_id =", value, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdNotEqualTo(Integer value) {
            addCriterion("bill_type_id <>", value, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdGreaterThan(Integer value) {
            addCriterion("bill_type_id >", value, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bill_type_id >=", value, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdLessThan(Integer value) {
            addCriterion("bill_type_id <", value, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("bill_type_id <=", value, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdIn(List<Integer> values) {
            addCriterion("bill_type_id in", values, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdNotIn(List<Integer> values) {
            addCriterion("bill_type_id not in", values, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("bill_type_id between", value1, value2, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andBillTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bill_type_id not between", value1, value2, "billTypeId");
            return (Criteria)this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria)this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria)this;
        }

        public Criteria andIsCheckEqualTo(Boolean value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckNotEqualTo(Boolean value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckGreaterThan(Boolean value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckLessThan(Boolean value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckIn(List<Boolean> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckNotIn(List<Boolean> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria)this;
        }

        public Criteria andIsCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
            return (Criteria)this;
        }

        public Criteria andCheckOrderIsNull() {
            addCriterion("check_order is null");
            return (Criteria)this;
        }

        public Criteria andCheckOrderIsNotNull() {
            addCriterion("check_order is not null");
            return (Criteria)this;
        }

        public Criteria andCheckOrderEqualTo(Integer value) {
            addCriterion("check_order =", value, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderNotEqualTo(Integer value) {
            addCriterion("check_order <>", value, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderGreaterThan(Integer value) {
            addCriterion("check_order >", value, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_order >=", value, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderLessThan(Integer value) {
            addCriterion("check_order <", value, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderLessThanOrEqualTo(Integer value) {
            addCriterion("check_order <=", value, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderIn(List<Integer> values) {
            addCriterion("check_order in", values, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderNotIn(List<Integer> values) {
            addCriterion("check_order not in", values, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderBetween(Integer value1, Integer value2) {
            addCriterion("check_order between", value1, value2, "checkOrder");
            return (Criteria)this;
        }

        public Criteria andCheckOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("check_order not between", value1, value2, "checkOrder");
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
