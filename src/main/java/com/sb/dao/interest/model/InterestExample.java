package com.sb.dao.interest.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterestExample() {
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

        public Criteria andBondPayTypeIdIsNull() {
            addCriterion("bond_pay_type_id is null");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdIsNotNull() {
            addCriterion("bond_pay_type_id is not null");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdEqualTo(Integer value) {
            addCriterion("bond_pay_type_id =", value, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdNotEqualTo(Integer value) {
            addCriterion("bond_pay_type_id <>", value, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdGreaterThan(Integer value) {
            addCriterion("bond_pay_type_id >", value, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bond_pay_type_id >=", value, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdLessThan(Integer value) {
            addCriterion("bond_pay_type_id <", value, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("bond_pay_type_id <=", value, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdIn(List<Integer> values) {
            addCriterion("bond_pay_type_id in", values, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdNotIn(List<Integer> values) {
            addCriterion("bond_pay_type_id not in", values, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("bond_pay_type_id between", value1, value2, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPayTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bond_pay_type_id not between", value1, value2, "bondPayTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdIsNull() {
            addCriterion("bond_period_type_id is null");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdIsNotNull() {
            addCriterion("bond_period_type_id is not null");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdEqualTo(Integer value) {
            addCriterion("bond_period_type_id =", value, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdNotEqualTo(Integer value) {
            addCriterion("bond_period_type_id <>", value, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdGreaterThan(Integer value) {
            addCriterion("bond_period_type_id >", value, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bond_period_type_id >=", value, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdLessThan(Integer value) {
            addCriterion("bond_period_type_id <", value, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("bond_period_type_id <=", value, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdIn(List<Integer> values) {
            addCriterion("bond_period_type_id in", values, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdNotIn(List<Integer> values) {
            addCriterion("bond_period_type_id not in", values, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("bond_period_type_id between", value1, value2, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondPeriodTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bond_period_type_id not between", value1, value2, "bondPeriodTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdIsNull() {
            addCriterion("bond_profit_type_id is null");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdIsNotNull() {
            addCriterion("bond_profit_type_id is not null");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdEqualTo(Integer value) {
            addCriterion("bond_profit_type_id =", value, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdNotEqualTo(Integer value) {
            addCriterion("bond_profit_type_id <>", value, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdGreaterThan(Integer value) {
            addCriterion("bond_profit_type_id >", value, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bond_profit_type_id >=", value, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdLessThan(Integer value) {
            addCriterion("bond_profit_type_id <", value, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("bond_profit_type_id <=", value, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdIn(List<Integer> values) {
            addCriterion("bond_profit_type_id in", values, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdNotIn(List<Integer> values) {
            addCriterion("bond_profit_type_id not in", values, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("bond_profit_type_id between", value1, value2, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andBondProfitTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bond_profit_type_id not between", value1, value2, "bondProfitTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdIsNull() {
            addCriterion("rate_type_id is null");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdIsNotNull() {
            addCriterion("rate_type_id is not null");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdEqualTo(Integer value) {
            addCriterion("rate_type_id =", value, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdNotEqualTo(Integer value) {
            addCriterion("rate_type_id <>", value, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdGreaterThan(Integer value) {
            addCriterion("rate_type_id >", value, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rate_type_id >=", value, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdLessThan(Integer value) {
            addCriterion("rate_type_id <", value, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("rate_type_id <=", value, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdIn(List<Integer> values) {
            addCriterion("rate_type_id in", values, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdNotIn(List<Integer> values) {
            addCriterion("rate_type_id not in", values, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("rate_type_id between", value1, value2, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andRateTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rate_type_id not between", value1, value2, "rateTypeId");
            return (Criteria)this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria)this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria)this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria)this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
            return (Criteria)this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria)this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria)this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria)this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria)this;
        }

        public Criteria andPeriodSumIsNull() {
            addCriterion("period_sum is null");
            return (Criteria)this;
        }

        public Criteria andPeriodSumIsNotNull() {
            addCriterion("period_sum is not null");
            return (Criteria)this;
        }

        public Criteria andPeriodSumEqualTo(Integer value) {
            addCriterion("period_sum =", value, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumNotEqualTo(Integer value) {
            addCriterion("period_sum <>", value, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumGreaterThan(Integer value) {
            addCriterion("period_sum >", value, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_sum >=", value, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumLessThan(Integer value) {
            addCriterion("period_sum <", value, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumLessThanOrEqualTo(Integer value) {
            addCriterion("period_sum <=", value, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumIn(List<Integer> values) {
            addCriterion("period_sum in", values, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumNotIn(List<Integer> values) {
            addCriterion("period_sum not in", values, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumBetween(Integer value1, Integer value2) {
            addCriterion("period_sum between", value1, value2, "periodSum");
            return (Criteria)this;
        }

        public Criteria andPeriodSumNotBetween(Integer value1, Integer value2) {
            addCriterion("period_sum not between", value1, value2, "periodSum");
            return (Criteria)this;
        }

        public Criteria andYearRateIsNull() {
            addCriterion("year_rate is null");
            return (Criteria)this;
        }

        public Criteria andYearRateIsNotNull() {
            addCriterion("year_rate is not null");
            return (Criteria)this;
        }

        public Criteria andYearRateEqualTo(BigDecimal value) {
            addCriterion("year_rate =", value, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateNotEqualTo(BigDecimal value) {
            addCriterion("year_rate <>", value, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateGreaterThan(BigDecimal value) {
            addCriterion("year_rate >", value, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("year_rate >=", value, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateLessThan(BigDecimal value) {
            addCriterion("year_rate <", value, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("year_rate <=", value, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateIn(List<BigDecimal> values) {
            addCriterion("year_rate in", values, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateNotIn(List<BigDecimal> values) {
            addCriterion("year_rate not in", values, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_rate between", value1, value2, "yearRate");
            return (Criteria)this;
        }

        public Criteria andYearRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("year_rate not between", value1, value2, "yearRate");
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

        public Criteria andIssuePriceIsNull() {
            addCriterion("issue_price is null");
            return (Criteria)this;
        }

        public Criteria andIssuePriceIsNotNull() {
            addCriterion("issue_price is not null");
            return (Criteria)this;
        }

        public Criteria andIssuePriceEqualTo(BigDecimal value) {
            addCriterion("issue_price =", value, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceNotEqualTo(BigDecimal value) {
            addCriterion("issue_price <>", value, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceGreaterThan(BigDecimal value) {
            addCriterion("issue_price >", value, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_price >=", value, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceLessThan(BigDecimal value) {
            addCriterion("issue_price <", value, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("issue_price <=", value, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceIn(List<BigDecimal> values) {
            addCriterion("issue_price in", values, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceNotIn(List<BigDecimal> values) {
            addCriterion("issue_price not in", values, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_price between", value1, value2, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andIssuePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("issue_price not between", value1, value2, "issuePrice");
            return (Criteria)this;
        }

        public Criteria andParValueIsNull() {
            addCriterion("par_value is null");
            return (Criteria)this;
        }

        public Criteria andParValueIsNotNull() {
            addCriterion("par_value is not null");
            return (Criteria)this;
        }

        public Criteria andParValueEqualTo(BigDecimal value) {
            addCriterion("par_value =", value, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueNotEqualTo(BigDecimal value) {
            addCriterion("par_value <>", value, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueGreaterThan(BigDecimal value) {
            addCriterion("par_value >", value, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("par_value >=", value, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueLessThan(BigDecimal value) {
            addCriterion("par_value <", value, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("par_value <=", value, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueIn(List<BigDecimal> values) {
            addCriterion("par_value in", values, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueNotIn(List<BigDecimal> values) {
            addCriterion("par_value not in", values, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("par_value between", value1, value2, "parValue");
            return (Criteria)this;
        }

        public Criteria andParValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("par_value not between", value1, value2, "parValue");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearIsNull() {
            addCriterion("days_per_year is null");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearIsNotNull() {
            addCriterion("days_per_year is not null");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearEqualTo(Integer value) {
            addCriterion("days_per_year =", value, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearNotEqualTo(Integer value) {
            addCriterion("days_per_year <>", value, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearGreaterThan(Integer value) {
            addCriterion("days_per_year >", value, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("days_per_year >=", value, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearLessThan(Integer value) {
            addCriterion("days_per_year <", value, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearLessThanOrEqualTo(Integer value) {
            addCriterion("days_per_year <=", value, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearIn(List<Integer> values) {
            addCriterion("days_per_year in", values, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearNotIn(List<Integer> values) {
            addCriterion("days_per_year not in", values, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearBetween(Integer value1, Integer value2) {
            addCriterion("days_per_year between", value1, value2, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andDaysPerYearNotBetween(Integer value1, Integer value2) {
            addCriterion("days_per_year not between", value1, value2, "daysPerYear");
            return (Criteria)this;
        }

        public Criteria andIsGenIsNull() {
            addCriterion("is_gen is null");
            return (Criteria)this;
        }

        public Criteria andIsGenIsNotNull() {
            addCriterion("is_gen is not null");
            return (Criteria)this;
        }

        public Criteria andIsGenEqualTo(Boolean value) {
            addCriterion("is_gen =", value, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenNotEqualTo(Boolean value) {
            addCriterion("is_gen <>", value, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenGreaterThan(Boolean value) {
            addCriterion("is_gen >", value, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_gen >=", value, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenLessThan(Boolean value) {
            addCriterion("is_gen <", value, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenLessThanOrEqualTo(Boolean value) {
            addCriterion("is_gen <=", value, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenIn(List<Boolean> values) {
            addCriterion("is_gen in", values, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenNotIn(List<Boolean> values) {
            addCriterion("is_gen not in", values, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gen between", value1, value2, "isGen");
            return (Criteria)this;
        }

        public Criteria andIsGenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_gen not between", value1, value2, "isGen");
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
