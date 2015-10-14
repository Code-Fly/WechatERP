package com.flycode.amount.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public AmountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
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

        public Criteria andSjIdIsNull() {
            addCriterion("sj_id is null");
            return (Criteria) this;
        }

        public Criteria andSjIdIsNotNull() {
            addCriterion("sj_id is not null");
            return (Criteria) this;
        }

        public Criteria andSjIdEqualTo(String value) {
            addCriterion("sj_id =", value, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdNotEqualTo(String value) {
            addCriterion("sj_id <>", value, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdGreaterThan(String value) {
            addCriterion("sj_id >", value, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdGreaterThanOrEqualTo(String value) {
            addCriterion("sj_id >=", value, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdLessThan(String value) {
            addCriterion("sj_id <", value, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdLessThanOrEqualTo(String value) {
            addCriterion("sj_id <=", value, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdLike(String value) {
            addCriterion("sj_id like", value, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdNotLike(String value) {
            addCriterion("sj_id not like", value, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdIn(List<String> values) {
            addCriterion("sj_id in", values, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdNotIn(List<String> values) {
            addCriterion("sj_id not in", values, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdBetween(String value1, String value2) {
            addCriterion("sj_id between", value1, value2, "sjId");
            return (Criteria) this;
        }

        public Criteria andSjIdNotBetween(String value1, String value2) {
            addCriterion("sj_id not between", value1, value2, "sjId");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitIsNull() {
            addCriterion("owner_unit is null");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitIsNotNull() {
            addCriterion("owner_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitEqualTo(String value) {
            addCriterion("owner_unit =", value, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitNotEqualTo(String value) {
            addCriterion("owner_unit <>", value, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitGreaterThan(String value) {
            addCriterion("owner_unit >", value, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitGreaterThanOrEqualTo(String value) {
            addCriterion("owner_unit >=", value, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitLessThan(String value) {
            addCriterion("owner_unit <", value, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitLessThanOrEqualTo(String value) {
            addCriterion("owner_unit <=", value, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitLike(String value) {
            addCriterion("owner_unit like", value, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitNotLike(String value) {
            addCriterion("owner_unit not like", value, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitIn(List<String> values) {
            addCriterion("owner_unit in", values, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitNotIn(List<String> values) {
            addCriterion("owner_unit not in", values, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitBetween(String value1, String value2) {
            addCriterion("owner_unit between", value1, value2, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andOwnerUnitNotBetween(String value1, String value2) {
            addCriterion("owner_unit not between", value1, value2, "ownerUnit");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolIsNull() {
            addCriterion("design_school is null");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolIsNotNull() {
            addCriterion("design_school is not null");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolEqualTo(String value) {
            addCriterion("design_school =", value, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolNotEqualTo(String value) {
            addCriterion("design_school <>", value, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolGreaterThan(String value) {
            addCriterion("design_school >", value, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("design_school >=", value, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolLessThan(String value) {
            addCriterion("design_school <", value, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolLessThanOrEqualTo(String value) {
            addCriterion("design_school <=", value, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolLike(String value) {
            addCriterion("design_school like", value, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolNotLike(String value) {
            addCriterion("design_school not like", value, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolIn(List<String> values) {
            addCriterion("design_school in", values, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolNotIn(List<String> values) {
            addCriterion("design_school not in", values, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolBetween(String value1, String value2) {
            addCriterion("design_school between", value1, value2, "designSchool");
            return (Criteria) this;
        }

        public Criteria andDesignSchoolNotBetween(String value1, String value2) {
            addCriterion("design_school not between", value1, value2, "designSchool");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitIsNull() {
            addCriterion("construction_unit is null");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitIsNotNull() {
            addCriterion("construction_unit is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitEqualTo(String value) {
            addCriterion("construction_unit =", value, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitNotEqualTo(String value) {
            addCriterion("construction_unit <>", value, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitGreaterThan(String value) {
            addCriterion("construction_unit >", value, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitGreaterThanOrEqualTo(String value) {
            addCriterion("construction_unit >=", value, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitLessThan(String value) {
            addCriterion("construction_unit <", value, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitLessThanOrEqualTo(String value) {
            addCriterion("construction_unit <=", value, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitLike(String value) {
            addCriterion("construction_unit like", value, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitNotLike(String value) {
            addCriterion("construction_unit not like", value, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitIn(List<String> values) {
            addCriterion("construction_unit in", values, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitNotIn(List<String> values) {
            addCriterion("construction_unit not in", values, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitBetween(String value1, String value2) {
            addCriterion("construction_unit between", value1, value2, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andConstructionUnitNotBetween(String value1, String value2) {
            addCriterion("construction_unit not between", value1, value2, "constructionUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitIsNull() {
            addCriterion("bid_unit is null");
            return (Criteria) this;
        }

        public Criteria andBidUnitIsNotNull() {
            addCriterion("bid_unit is not null");
            return (Criteria) this;
        }

        public Criteria andBidUnitEqualTo(String value) {
            addCriterion("bid_unit =", value, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitNotEqualTo(String value) {
            addCriterion("bid_unit <>", value, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitGreaterThan(String value) {
            addCriterion("bid_unit >", value, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitGreaterThanOrEqualTo(String value) {
            addCriterion("bid_unit >=", value, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitLessThan(String value) {
            addCriterion("bid_unit <", value, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitLessThanOrEqualTo(String value) {
            addCriterion("bid_unit <=", value, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitLike(String value) {
            addCriterion("bid_unit like", value, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitNotLike(String value) {
            addCriterion("bid_unit not like", value, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitIn(List<String> values) {
            addCriterion("bid_unit in", values, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitNotIn(List<String> values) {
            addCriterion("bid_unit not in", values, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitBetween(String value1, String value2) {
            addCriterion("bid_unit between", value1, value2, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andBidUnitNotBetween(String value1, String value2) {
            addCriterion("bid_unit not between", value1, value2, "bidUnit");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNull() {
            addCriterion("leader is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIsNotNull() {
            addCriterion("leader is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderEqualTo(String value) {
            addCriterion("leader =", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotEqualTo(String value) {
            addCriterion("leader <>", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThan(String value) {
            addCriterion("leader >", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("leader >=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThan(String value) {
            addCriterion("leader <", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLessThanOrEqualTo(String value) {
            addCriterion("leader <=", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderLike(String value) {
            addCriterion("leader like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotLike(String value) {
            addCriterion("leader not like", value, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderIn(List<String> values) {
            addCriterion("leader in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotIn(List<String> values) {
            addCriterion("leader not in", values, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderBetween(String value1, String value2) {
            addCriterion("leader between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andLeaderNotBetween(String value1, String value2) {
            addCriterion("leader not between", value1, value2, "leader");
            return (Criteria) this;
        }

        public Criteria andHelpPersonIsNull() {
            addCriterion("help_person is null");
            return (Criteria) this;
        }

        public Criteria andHelpPersonIsNotNull() {
            addCriterion("help_person is not null");
            return (Criteria) this;
        }

        public Criteria andHelpPersonEqualTo(String value) {
            addCriterion("help_person =", value, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonNotEqualTo(String value) {
            addCriterion("help_person <>", value, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonGreaterThan(String value) {
            addCriterion("help_person >", value, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonGreaterThanOrEqualTo(String value) {
            addCriterion("help_person >=", value, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonLessThan(String value) {
            addCriterion("help_person <", value, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonLessThanOrEqualTo(String value) {
            addCriterion("help_person <=", value, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonLike(String value) {
            addCriterion("help_person like", value, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonNotLike(String value) {
            addCriterion("help_person not like", value, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonIn(List<String> values) {
            addCriterion("help_person in", values, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonNotIn(List<String> values) {
            addCriterion("help_person not in", values, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonBetween(String value1, String value2) {
            addCriterion("help_person between", value1, value2, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andHelpPersonNotBetween(String value1, String value2) {
            addCriterion("help_person not between", value1, value2, "helpPerson");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyIsNull() {
            addCriterion("project_property is null");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyIsNotNull() {
            addCriterion("project_property is not null");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyEqualTo(String value) {
            addCriterion("project_property =", value, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyNotEqualTo(String value) {
            addCriterion("project_property <>", value, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyGreaterThan(String value) {
            addCriterion("project_property >", value, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("project_property >=", value, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyLessThan(String value) {
            addCriterion("project_property <", value, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyLessThanOrEqualTo(String value) {
            addCriterion("project_property <=", value, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyLike(String value) {
            addCriterion("project_property like", value, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyNotLike(String value) {
            addCriterion("project_property not like", value, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyIn(List<String> values) {
            addCriterion("project_property in", values, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyNotIn(List<String> values) {
            addCriterion("project_property not in", values, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyBetween(String value1, String value2) {
            addCriterion("project_property between", value1, value2, "projectProperty");
            return (Criteria) this;
        }

        public Criteria andProjectPropertyNotBetween(String value1, String value2) {
            addCriterion("project_property not between", value1, value2, "projectProperty");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SCM_project_1
     *
     * @mbggenerated do_not_delete_during_merge Wed Oct 14 21:58:23 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SCM_project_1
     *
     * @mbggenerated Wed Oct 14 21:58:23 CST 2015
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
    }
}