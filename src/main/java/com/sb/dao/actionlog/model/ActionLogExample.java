package com.sb.dao.actionlog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActionLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActionLogExample() {
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

        public Criteria andBusinessTypeIdIsNull() {
            addCriterion("business_type_id is null");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdIsNotNull() {
            addCriterion("business_type_id is not null");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdEqualTo(Integer value) {
            addCriterion("business_type_id =", value, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdNotEqualTo(Integer value) {
            addCriterion("business_type_id <>", value, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdGreaterThan(Integer value) {
            addCriterion("business_type_id >", value, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_type_id >=", value, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdLessThan(Integer value) {
            addCriterion("business_type_id <", value, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_type_id <=", value, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdIn(List<Integer> values) {
            addCriterion("business_type_id in", values, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdNotIn(List<Integer> values) {
            addCriterion("business_type_id not in", values, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("business_type_id between", value1, value2, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andBusinessTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_type_id not between", value1, value2, "businessTypeId");
            return (Criteria)this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("org_id is null");
            return (Criteria)this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("org_id is not null");
            return (Criteria)this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("org_id =", value, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("org_id <>", value, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("org_id >", value, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("org_id >=", value, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("org_id <", value, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("org_id <=", value, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("org_id in", values, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("org_id not in", values, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("org_id between", value1, value2, "orgId");
            return (Criteria)this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("org_id not between", value1, value2, "orgId");
            return (Criteria)this;
        }

        public Criteria andTradeDate1IsNull() {
            addCriterion("trade_date1 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate1IsNotNull() {
            addCriterion("trade_date1 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate1EqualTo(Date value) {
            addCriterion("trade_date1 =", value, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1NotEqualTo(Date value) {
            addCriterion("trade_date1 <>", value, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1GreaterThan(Date value) {
            addCriterion("trade_date1 >", value, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date1 >=", value, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1LessThan(Date value) {
            addCriterion("trade_date1 <", value, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1LessThanOrEqualTo(Date value) {
            addCriterion("trade_date1 <=", value, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1In(List<Date> values) {
            addCriterion("trade_date1 in", values, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1NotIn(List<Date> values) {
            addCriterion("trade_date1 not in", values, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1Between(Date value1, Date value2) {
            addCriterion("trade_date1 between", value1, value2, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate1NotBetween(Date value1, Date value2) {
            addCriterion("trade_date1 not between", value1, value2, "tradeDate1");
            return (Criteria)this;
        }

        public Criteria andTradeDate2IsNull() {
            addCriterion("trade_date2 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate2IsNotNull() {
            addCriterion("trade_date2 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate2EqualTo(Date value) {
            addCriterion("trade_date2 =", value, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2NotEqualTo(Date value) {
            addCriterion("trade_date2 <>", value, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2GreaterThan(Date value) {
            addCriterion("trade_date2 >", value, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date2 >=", value, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2LessThan(Date value) {
            addCriterion("trade_date2 <", value, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2LessThanOrEqualTo(Date value) {
            addCriterion("trade_date2 <=", value, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2In(List<Date> values) {
            addCriterion("trade_date2 in", values, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2NotIn(List<Date> values) {
            addCriterion("trade_date2 not in", values, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2Between(Date value1, Date value2) {
            addCriterion("trade_date2 between", value1, value2, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate2NotBetween(Date value1, Date value2) {
            addCriterion("trade_date2 not between", value1, value2, "tradeDate2");
            return (Criteria)this;
        }

        public Criteria andTradeDate3IsNull() {
            addCriterion("trade_date3 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate3IsNotNull() {
            addCriterion("trade_date3 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate3EqualTo(Date value) {
            addCriterion("trade_date3 =", value, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3NotEqualTo(Date value) {
            addCriterion("trade_date3 <>", value, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3GreaterThan(Date value) {
            addCriterion("trade_date3 >", value, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date3 >=", value, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3LessThan(Date value) {
            addCriterion("trade_date3 <", value, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3LessThanOrEqualTo(Date value) {
            addCriterion("trade_date3 <=", value, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3In(List<Date> values) {
            addCriterion("trade_date3 in", values, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3NotIn(List<Date> values) {
            addCriterion("trade_date3 not in", values, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3Between(Date value1, Date value2) {
            addCriterion("trade_date3 between", value1, value2, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate3NotBetween(Date value1, Date value2) {
            addCriterion("trade_date3 not between", value1, value2, "tradeDate3");
            return (Criteria)this;
        }

        public Criteria andTradeDate4IsNull() {
            addCriterion("trade_date4 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate4IsNotNull() {
            addCriterion("trade_date4 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate4EqualTo(Date value) {
            addCriterion("trade_date4 =", value, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4NotEqualTo(Date value) {
            addCriterion("trade_date4 <>", value, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4GreaterThan(Date value) {
            addCriterion("trade_date4 >", value, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date4 >=", value, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4LessThan(Date value) {
            addCriterion("trade_date4 <", value, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4LessThanOrEqualTo(Date value) {
            addCriterion("trade_date4 <=", value, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4In(List<Date> values) {
            addCriterion("trade_date4 in", values, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4NotIn(List<Date> values) {
            addCriterion("trade_date4 not in", values, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4Between(Date value1, Date value2) {
            addCriterion("trade_date4 between", value1, value2, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate4NotBetween(Date value1, Date value2) {
            addCriterion("trade_date4 not between", value1, value2, "tradeDate4");
            return (Criteria)this;
        }

        public Criteria andTradeDate5IsNull() {
            addCriterion("trade_date5 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate5IsNotNull() {
            addCriterion("trade_date5 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate5EqualTo(Date value) {
            addCriterion("trade_date5 =", value, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5NotEqualTo(Date value) {
            addCriterion("trade_date5 <>", value, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5GreaterThan(Date value) {
            addCriterion("trade_date5 >", value, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date5 >=", value, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5LessThan(Date value) {
            addCriterion("trade_date5 <", value, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5LessThanOrEqualTo(Date value) {
            addCriterion("trade_date5 <=", value, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5In(List<Date> values) {
            addCriterion("trade_date5 in", values, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5NotIn(List<Date> values) {
            addCriterion("trade_date5 not in", values, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5Between(Date value1, Date value2) {
            addCriterion("trade_date5 between", value1, value2, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate5NotBetween(Date value1, Date value2) {
            addCriterion("trade_date5 not between", value1, value2, "tradeDate5");
            return (Criteria)this;
        }

        public Criteria andTradeDate6IsNull() {
            addCriterion("trade_date6 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate6IsNotNull() {
            addCriterion("trade_date6 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate6EqualTo(Date value) {
            addCriterion("trade_date6 =", value, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6NotEqualTo(Date value) {
            addCriterion("trade_date6 <>", value, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6GreaterThan(Date value) {
            addCriterion("trade_date6 >", value, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date6 >=", value, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6LessThan(Date value) {
            addCriterion("trade_date6 <", value, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6LessThanOrEqualTo(Date value) {
            addCriterion("trade_date6 <=", value, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6In(List<Date> values) {
            addCriterion("trade_date6 in", values, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6NotIn(List<Date> values) {
            addCriterion("trade_date6 not in", values, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6Between(Date value1, Date value2) {
            addCriterion("trade_date6 between", value1, value2, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate6NotBetween(Date value1, Date value2) {
            addCriterion("trade_date6 not between", value1, value2, "tradeDate6");
            return (Criteria)this;
        }

        public Criteria andTradeDate7IsNull() {
            addCriterion("trade_date7 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate7IsNotNull() {
            addCriterion("trade_date7 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate7EqualTo(Date value) {
            addCriterion("trade_date7 =", value, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7NotEqualTo(Date value) {
            addCriterion("trade_date7 <>", value, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7GreaterThan(Date value) {
            addCriterion("trade_date7 >", value, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date7 >=", value, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7LessThan(Date value) {
            addCriterion("trade_date7 <", value, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7LessThanOrEqualTo(Date value) {
            addCriterion("trade_date7 <=", value, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7In(List<Date> values) {
            addCriterion("trade_date7 in", values, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7NotIn(List<Date> values) {
            addCriterion("trade_date7 not in", values, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7Between(Date value1, Date value2) {
            addCriterion("trade_date7 between", value1, value2, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate7NotBetween(Date value1, Date value2) {
            addCriterion("trade_date7 not between", value1, value2, "tradeDate7");
            return (Criteria)this;
        }

        public Criteria andTradeDate8IsNull() {
            addCriterion("trade_date8 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate8IsNotNull() {
            addCriterion("trade_date8 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate8EqualTo(Date value) {
            addCriterion("trade_date8 =", value, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8NotEqualTo(Date value) {
            addCriterion("trade_date8 <>", value, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8GreaterThan(Date value) {
            addCriterion("trade_date8 >", value, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date8 >=", value, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8LessThan(Date value) {
            addCriterion("trade_date8 <", value, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8LessThanOrEqualTo(Date value) {
            addCriterion("trade_date8 <=", value, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8In(List<Date> values) {
            addCriterion("trade_date8 in", values, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8NotIn(List<Date> values) {
            addCriterion("trade_date8 not in", values, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8Between(Date value1, Date value2) {
            addCriterion("trade_date8 between", value1, value2, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate8NotBetween(Date value1, Date value2) {
            addCriterion("trade_date8 not between", value1, value2, "tradeDate8");
            return (Criteria)this;
        }

        public Criteria andTradeDate9IsNull() {
            addCriterion("trade_date9 is null");
            return (Criteria)this;
        }

        public Criteria andTradeDate9IsNotNull() {
            addCriterion("trade_date9 is not null");
            return (Criteria)this;
        }

        public Criteria andTradeDate9EqualTo(Date value) {
            addCriterion("trade_date9 =", value, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9NotEqualTo(Date value) {
            addCriterion("trade_date9 <>", value, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9GreaterThan(Date value) {
            addCriterion("trade_date9 >", value, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9GreaterThanOrEqualTo(Date value) {
            addCriterion("trade_date9 >=", value, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9LessThan(Date value) {
            addCriterion("trade_date9 <", value, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9LessThanOrEqualTo(Date value) {
            addCriterion("trade_date9 <=", value, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9In(List<Date> values) {
            addCriterion("trade_date9 in", values, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9NotIn(List<Date> values) {
            addCriterion("trade_date9 not in", values, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9Between(Date value1, Date value2) {
            addCriterion("trade_date9 between", value1, value2, "tradeDate9");
            return (Criteria)this;
        }

        public Criteria andTradeDate9NotBetween(Date value1, Date value2) {
            addCriterion("trade_date9 not between", value1, value2, "tradeDate9");
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
