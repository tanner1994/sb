package com.sb.dao.costplan.model;

import java.util.ArrayList;
import java.util.List;

public class CostPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostPlanExample() {
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

        public Criteria andCostTypeIsNull() {
            addCriterion("cost_type is null");
            return (Criteria)this;
        }

        public Criteria andCostTypeIsNotNull() {
            addCriterion("cost_type is not null");
            return (Criteria)this;
        }

        public Criteria andCostTypeEqualTo(Integer value) {
            addCriterion("cost_type =", value, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeNotEqualTo(Integer value) {
            addCriterion("cost_type <>", value, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeGreaterThan(Integer value) {
            addCriterion("cost_type >", value, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cost_type >=", value, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeLessThan(Integer value) {
            addCriterion("cost_type <", value, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cost_type <=", value, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeIn(List<Integer> values) {
            addCriterion("cost_type in", values, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeNotIn(List<Integer> values) {
            addCriterion("cost_type not in", values, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeBetween(Integer value1, Integer value2) {
            addCriterion("cost_type between", value1, value2, "costType");
            return (Criteria)this;
        }

        public Criteria andCostTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cost_type not between", value1, value2, "costType");
            return (Criteria)this;
        }

        public Criteria andIsOrgIsNull() {
            addCriterion("is_org is null");
            return (Criteria)this;
        }

        public Criteria andIsOrgIsNotNull() {
            addCriterion("is_org is not null");
            return (Criteria)this;
        }

        public Criteria andIsOrgEqualTo(Boolean value) {
            addCriterion("is_org =", value, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgNotEqualTo(Boolean value) {
            addCriterion("is_org <>", value, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgGreaterThan(Boolean value) {
            addCriterion("is_org >", value, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_org >=", value, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgLessThan(Boolean value) {
            addCriterion("is_org <", value, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgLessThanOrEqualTo(Boolean value) {
            addCriterion("is_org <=", value, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgIn(List<Boolean> values) {
            addCriterion("is_org in", values, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgNotIn(List<Boolean> values) {
            addCriterion("is_org not in", values, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgBetween(Boolean value1, Boolean value2) {
            addCriterion("is_org between", value1, value2, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsOrgNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_org not between", value1, value2, "isOrg");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountIsNull() {
            addCriterion("is_cap_account is null");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountIsNotNull() {
            addCriterion("is_cap_account is not null");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountEqualTo(Boolean value) {
            addCriterion("is_cap_account =", value, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountNotEqualTo(Boolean value) {
            addCriterion("is_cap_account <>", value, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountGreaterThan(Boolean value) {
            addCriterion("is_cap_account >", value, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_cap_account >=", value, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountLessThan(Boolean value) {
            addCriterion("is_cap_account <", value, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountLessThanOrEqualTo(Boolean value) {
            addCriterion("is_cap_account <=", value, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountIn(List<Boolean> values) {
            addCriterion("is_cap_account in", values, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountNotIn(List<Boolean> values) {
            addCriterion("is_cap_account not in", values, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cap_account between", value1, value2, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsCapAccountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_cap_account not between", value1, value2, "isCapAccount");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupIsNull() {
            addCriterion("is_selfs_group is null");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupIsNotNull() {
            addCriterion("is_selfs_group is not null");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupEqualTo(Boolean value) {
            addCriterion("is_selfs_group =", value, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupNotEqualTo(Boolean value) {
            addCriterion("is_selfs_group <>", value, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupGreaterThan(Boolean value) {
            addCriterion("is_selfs_group >", value, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_selfs_group >=", value, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupLessThan(Boolean value) {
            addCriterion("is_selfs_group <", value, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupLessThanOrEqualTo(Boolean value) {
            addCriterion("is_selfs_group <=", value, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupIn(List<Boolean> values) {
            addCriterion("is_selfs_group in", values, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupNotIn(List<Boolean> values) {
            addCriterion("is_selfs_group not in", values, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupBetween(Boolean value1, Boolean value2) {
            addCriterion("is_selfs_group between", value1, value2, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsSelfsGroupNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_selfs_group not between", value1, value2, "isSelfsGroup");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountIsNull() {
            addCriterion("is_partn_account is null");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountIsNotNull() {
            addCriterion("is_partn_account is not null");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountEqualTo(Boolean value) {
            addCriterion("is_partn_account =", value, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountNotEqualTo(Boolean value) {
            addCriterion("is_partn_account <>", value, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountGreaterThan(Boolean value) {
            addCriterion("is_partn_account >", value, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_partn_account >=", value, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountLessThan(Boolean value) {
            addCriterion("is_partn_account <", value, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountLessThanOrEqualTo(Boolean value) {
            addCriterion("is_partn_account <=", value, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountIn(List<Boolean> values) {
            addCriterion("is_partn_account in", values, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountNotIn(List<Boolean> values) {
            addCriterion("is_partn_account not in", values, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountBetween(Boolean value1, Boolean value2) {
            addCriterion("is_partn_account between", value1, value2, "isPartnAccount");
            return (Criteria)this;
        }

        public Criteria andIsPartnAccountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_partn_account not between", value1, value2, "isPartnAccount");
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
