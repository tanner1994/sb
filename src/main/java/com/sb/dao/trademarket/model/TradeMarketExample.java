package com.sb.dao.trademarket.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TradeMarketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TradeMarketExample() {
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

        public Criteria andOpenPriceIsNull() {
            addCriterion("open_price is null");
            return (Criteria)this;
        }

        public Criteria andOpenPriceIsNotNull() {
            addCriterion("open_price is not null");
            return (Criteria)this;
        }

        public Criteria andOpenPriceEqualTo(Date value) {
            addCriterion("open_price =", value, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceNotEqualTo(Date value) {
            addCriterion("open_price <>", value, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceGreaterThan(Date value) {
            addCriterion("open_price >", value, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceGreaterThanOrEqualTo(Date value) {
            addCriterion("open_price >=", value, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceLessThan(Date value) {
            addCriterion("open_price <", value, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceLessThanOrEqualTo(Date value) {
            addCriterion("open_price <=", value, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceIn(List<Date> values) {
            addCriterion("open_price in", values, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceNotIn(List<Date> values) {
            addCriterion("open_price not in", values, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceBetween(Date value1, Date value2) {
            addCriterion("open_price between", value1, value2, "openPrice");
            return (Criteria)this;
        }

        public Criteria andOpenPriceNotBetween(Date value1, Date value2) {
            addCriterion("open_price not between", value1, value2, "openPrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceIsNull() {
            addCriterion("close_price is null");
            return (Criteria)this;
        }

        public Criteria andClosePriceIsNotNull() {
            addCriterion("close_price is not null");
            return (Criteria)this;
        }

        public Criteria andClosePriceEqualTo(BigDecimal value) {
            addCriterion("close_price =", value, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceNotEqualTo(BigDecimal value) {
            addCriterion("close_price <>", value, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceGreaterThan(BigDecimal value) {
            addCriterion("close_price >", value, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("close_price >=", value, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceLessThan(BigDecimal value) {
            addCriterion("close_price <", value, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("close_price <=", value, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceIn(List<BigDecimal> values) {
            addCriterion("close_price in", values, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceNotIn(List<BigDecimal> values) {
            addCriterion("close_price not in", values, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("close_price between", value1, value2, "closePrice");
            return (Criteria)this;
        }

        public Criteria andClosePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("close_price not between", value1, value2, "closePrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("min_price is null");
            return (Criteria)this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("min_price is not null");
            return (Criteria)this;
        }

        public Criteria andMinPriceEqualTo(BigDecimal value) {
            addCriterion("min_price =", value, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("min_price <>", value, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceGreaterThan(BigDecimal value) {
            addCriterion("min_price >", value, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price >=", value, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceLessThan(BigDecimal value) {
            addCriterion("min_price <", value, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price <=", value, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceIn(List<BigDecimal> values) {
            addCriterion("min_price in", values, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("min_price not in", values, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price between", value1, value2, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price not between", value1, value2, "minPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceIsNull() {
            addCriterion("max_price is null");
            return (Criteria)this;
        }

        public Criteria andMaxPriceIsNotNull() {
            addCriterion("max_price is not null");
            return (Criteria)this;
        }

        public Criteria andMaxPriceEqualTo(BigDecimal value) {
            addCriterion("max_price =", value, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceNotEqualTo(BigDecimal value) {
            addCriterion("max_price <>", value, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceGreaterThan(BigDecimal value) {
            addCriterion("max_price >", value, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_price >=", value, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceLessThan(BigDecimal value) {
            addCriterion("max_price <", value, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_price <=", value, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceIn(List<BigDecimal> values) {
            addCriterion("max_price in", values, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceNotIn(List<BigDecimal> values) {
            addCriterion("max_price not in", values, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_price between", value1, value2, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andMaxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_price not between", value1, value2, "maxPrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceIsNull() {
            addCriterion("average_price is null");
            return (Criteria)this;
        }

        public Criteria andAveragePriceIsNotNull() {
            addCriterion("average_price is not null");
            return (Criteria)this;
        }

        public Criteria andAveragePriceEqualTo(BigDecimal value) {
            addCriterion("average_price =", value, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceNotEqualTo(BigDecimal value) {
            addCriterion("average_price <>", value, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceGreaterThan(BigDecimal value) {
            addCriterion("average_price >", value, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("average_price >=", value, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceLessThan(BigDecimal value) {
            addCriterion("average_price <", value, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("average_price <=", value, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceIn(List<BigDecimal> values) {
            addCriterion("average_price in", values, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceNotIn(List<BigDecimal> values) {
            addCriterion("average_price not in", values, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_price between", value1, value2, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andAveragePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("average_price not between", value1, value2, "averagePrice");
            return (Criteria)this;
        }

        public Criteria andQRiceIsNull() {
            addCriterion("q_rice is null");
            return (Criteria)this;
        }

        public Criteria andQRiceIsNotNull() {
            addCriterion("q_rice is not null");
            return (Criteria)this;
        }

        public Criteria andQRiceEqualTo(BigDecimal value) {
            addCriterion("q_rice =", value, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceNotEqualTo(BigDecimal value) {
            addCriterion("q_rice <>", value, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceGreaterThan(BigDecimal value) {
            addCriterion("q_rice >", value, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("q_rice >=", value, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceLessThan(BigDecimal value) {
            addCriterion("q_rice <", value, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("q_rice <=", value, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceIn(List<BigDecimal> values) {
            addCriterion("q_rice in", values, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceNotIn(List<BigDecimal> values) {
            addCriterion("q_rice not in", values, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("q_rice between", value1, value2, "qRice");
            return (Criteria)this;
        }

        public Criteria andQRiceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("q_rice not between", value1, value2, "qRice");
            return (Criteria)this;
        }

        public Criteria andJRiceIsNull() {
            addCriterion("j_rice is null");
            return (Criteria)this;
        }

        public Criteria andJRiceIsNotNull() {
            addCriterion("j_rice is not null");
            return (Criteria)this;
        }

        public Criteria andJRiceEqualTo(BigDecimal value) {
            addCriterion("j_rice =", value, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceNotEqualTo(BigDecimal value) {
            addCriterion("j_rice <>", value, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceGreaterThan(BigDecimal value) {
            addCriterion("j_rice >", value, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("j_rice >=", value, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceLessThan(BigDecimal value) {
            addCriterion("j_rice <", value, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("j_rice <=", value, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceIn(List<BigDecimal> values) {
            addCriterion("j_rice in", values, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceNotIn(List<BigDecimal> values) {
            addCriterion("j_rice not in", values, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("j_rice between", value1, value2, "jRice");
            return (Criteria)this;
        }

        public Criteria andJRiceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("j_rice not between", value1, value2, "jRice");
            return (Criteria)this;
        }

        public Criteria andYjlxIsNull() {
            addCriterion("yjlx is null");
            return (Criteria)this;
        }

        public Criteria andYjlxIsNotNull() {
            addCriterion("yjlx is not null");
            return (Criteria)this;
        }

        public Criteria andYjlxEqualTo(BigDecimal value) {
            addCriterion("yjlx =", value, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxNotEqualTo(BigDecimal value) {
            addCriterion("yjlx <>", value, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxGreaterThan(BigDecimal value) {
            addCriterion("yjlx >", value, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yjlx >=", value, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxLessThan(BigDecimal value) {
            addCriterion("yjlx <", value, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yjlx <=", value, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxIn(List<BigDecimal> values) {
            addCriterion("yjlx in", values, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxNotIn(List<BigDecimal> values) {
            addCriterion("yjlx not in", values, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yjlx between", value1, value2, "yjlx");
            return (Criteria)this;
        }

        public Criteria andYjlxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yjlx not between", value1, value2, "yjlx");
            return (Criteria)this;
        }

        public Criteria andWfsyIsNull() {
            addCriterion("wfsy is null");
            return (Criteria)this;
        }

        public Criteria andWfsyIsNotNull() {
            addCriterion("wfsy is not null");
            return (Criteria)this;
        }

        public Criteria andWfsyEqualTo(BigDecimal value) {
            addCriterion("wfsy =", value, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyNotEqualTo(BigDecimal value) {
            addCriterion("wfsy <>", value, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyGreaterThan(BigDecimal value) {
            addCriterion("wfsy >", value, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("wfsy >=", value, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyLessThan(BigDecimal value) {
            addCriterion("wfsy <", value, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("wfsy <=", value, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyIn(List<BigDecimal> values) {
            addCriterion("wfsy in", values, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyNotIn(List<BigDecimal> values) {
            addCriterion("wfsy not in", values, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wfsy between", value1, value2, "wfsy");
            return (Criteria)this;
        }

        public Criteria andWfsyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("wfsy not between", value1, value2, "wfsy");
            return (Criteria)this;
        }

        public Criteria andRjlxIsNull() {
            addCriterion("rjlx is null");
            return (Criteria)this;
        }

        public Criteria andRjlxIsNotNull() {
            addCriterion("rjlx is not null");
            return (Criteria)this;
        }

        public Criteria andRjlxEqualTo(BigDecimal value) {
            addCriterion("rjlx =", value, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxNotEqualTo(BigDecimal value) {
            addCriterion("rjlx <>", value, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxGreaterThan(BigDecimal value) {
            addCriterion("rjlx >", value, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rjlx >=", value, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxLessThan(BigDecimal value) {
            addCriterion("rjlx <", value, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rjlx <=", value, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxIn(List<BigDecimal> values) {
            addCriterion("rjlx in", values, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxNotIn(List<BigDecimal> values) {
            addCriterion("rjlx not in", values, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rjlx between", value1, value2, "rjlx");
            return (Criteria)this;
        }

        public Criteria andRjlxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rjlx not between", value1, value2, "rjlx");
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
