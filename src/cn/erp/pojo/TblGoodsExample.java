package cn.erp.pojo;

import java.util.ArrayList;
import java.util.List;

public class TblGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Long value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Long value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Long value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Long value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Long value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Long value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Long> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Long> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Long value1, Long value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Long value1, Long value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOriginIsNull() {
            addCriterion("origin is null");
            return (Criteria) this;
        }

        public Criteria andOriginIsNotNull() {
            addCriterion("origin is not null");
            return (Criteria) this;
        }

        public Criteria andOriginEqualTo(String value) {
            addCriterion("origin =", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotEqualTo(String value) {
            addCriterion("origin <>", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThan(String value) {
            addCriterion("origin >", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginGreaterThanOrEqualTo(String value) {
            addCriterion("origin >=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThan(String value) {
            addCriterion("origin <", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLessThanOrEqualTo(String value) {
            addCriterion("origin <=", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginLike(String value) {
            addCriterion("origin like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotLike(String value) {
            addCriterion("origin not like", value, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginIn(List<String> values) {
            addCriterion("origin in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotIn(List<String> values) {
            addCriterion("origin not in", values, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginBetween(String value1, String value2) {
            addCriterion("origin between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andOriginNotBetween(String value1, String value2) {
            addCriterion("origin not between", value1, value2, "origin");
            return (Criteria) this;
        }

        public Criteria andProducerIsNull() {
            addCriterion("producer is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("producer is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("producer =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("producer <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("producer >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("producer >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("producer <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("producer <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLike(String value) {
            addCriterion("producer like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotLike(String value) {
            addCriterion("producer not like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("producer in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("producer not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("producer between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("producer not between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNull() {
            addCriterion("inPrice is null");
            return (Criteria) this;
        }

        public Criteria andInpriceIsNotNull() {
            addCriterion("inPrice is not null");
            return (Criteria) this;
        }

        public Criteria andInpriceEqualTo(Double value) {
            addCriterion("inPrice =", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotEqualTo(Double value) {
            addCriterion("inPrice <>", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThan(Double value) {
            addCriterion("inPrice >", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("inPrice >=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThan(Double value) {
            addCriterion("inPrice <", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceLessThanOrEqualTo(Double value) {
            addCriterion("inPrice <=", value, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceIn(List<Double> values) {
            addCriterion("inPrice in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotIn(List<Double> values) {
            addCriterion("inPrice not in", values, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceBetween(Double value1, Double value2) {
            addCriterion("inPrice between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andInpriceNotBetween(Double value1, Double value2) {
            addCriterion("inPrice not between", value1, value2, "inprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceIsNull() {
            addCriterion("outPrice is null");
            return (Criteria) this;
        }

        public Criteria andOutpriceIsNotNull() {
            addCriterion("outPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOutpriceEqualTo(Double value) {
            addCriterion("outPrice =", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotEqualTo(Double value) {
            addCriterion("outPrice <>", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceGreaterThan(Double value) {
            addCriterion("outPrice >", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("outPrice >=", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceLessThan(Double value) {
            addCriterion("outPrice <", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceLessThanOrEqualTo(Double value) {
            addCriterion("outPrice <=", value, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceIn(List<Double> values) {
            addCriterion("outPrice in", values, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotIn(List<Double> values) {
            addCriterion("outPrice not in", values, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceBetween(Double value1, Double value2) {
            addCriterion("outPrice between", value1, value2, "outprice");
            return (Criteria) this;
        }

        public Criteria andOutpriceNotBetween(Double value1, Double value2) {
            addCriterion("outPrice not between", value1, value2, "outprice");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidIsNull() {
            addCriterion("goodsTypeUuid is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidIsNotNull() {
            addCriterion("goodsTypeUuid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidEqualTo(Long value) {
            addCriterion("goodsTypeUuid =", value, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidNotEqualTo(Long value) {
            addCriterion("goodsTypeUuid <>", value, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidGreaterThan(Long value) {
            addCriterion("goodsTypeUuid >", value, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidGreaterThanOrEqualTo(Long value) {
            addCriterion("goodsTypeUuid >=", value, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidLessThan(Long value) {
            addCriterion("goodsTypeUuid <", value, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidLessThanOrEqualTo(Long value) {
            addCriterion("goodsTypeUuid <=", value, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidIn(List<Long> values) {
            addCriterion("goodsTypeUuid in", values, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidNotIn(List<Long> values) {
            addCriterion("goodsTypeUuid not in", values, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidBetween(Long value1, Long value2) {
            addCriterion("goodsTypeUuid between", value1, value2, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeuuidNotBetween(Long value1, Long value2) {
            addCriterion("goodsTypeUuid not between", value1, value2, "goodstypeuuid");
            return (Criteria) this;
        }

        public Criteria andUsenumIsNull() {
            addCriterion("useNum is null");
            return (Criteria) this;
        }

        public Criteria andUsenumIsNotNull() {
            addCriterion("useNum is not null");
            return (Criteria) this;
        }

        public Criteria andUsenumEqualTo(Integer value) {
            addCriterion("useNum =", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotEqualTo(Integer value) {
            addCriterion("useNum <>", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumGreaterThan(Integer value) {
            addCriterion("useNum >", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("useNum >=", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumLessThan(Integer value) {
            addCriterion("useNum <", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumLessThanOrEqualTo(Integer value) {
            addCriterion("useNum <=", value, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumIn(List<Integer> values) {
            addCriterion("useNum in", values, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotIn(List<Integer> values) {
            addCriterion("useNum not in", values, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumBetween(Integer value1, Integer value2) {
            addCriterion("useNum between", value1, value2, "usenum");
            return (Criteria) this;
        }

        public Criteria andUsenumNotBetween(Integer value1, Integer value2) {
            addCriterion("useNum not between", value1, value2, "usenum");
            return (Criteria) this;
        }

        public Criteria andMinnumIsNull() {
            addCriterion("minNum is null");
            return (Criteria) this;
        }

        public Criteria andMinnumIsNotNull() {
            addCriterion("minNum is not null");
            return (Criteria) this;
        }

        public Criteria andMinnumEqualTo(Integer value) {
            addCriterion("minNum =", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotEqualTo(Integer value) {
            addCriterion("minNum <>", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumGreaterThan(Integer value) {
            addCriterion("minNum >", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("minNum >=", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumLessThan(Integer value) {
            addCriterion("minNum <", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumLessThanOrEqualTo(Integer value) {
            addCriterion("minNum <=", value, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumIn(List<Integer> values) {
            addCriterion("minNum in", values, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotIn(List<Integer> values) {
            addCriterion("minNum not in", values, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumBetween(Integer value1, Integer value2) {
            addCriterion("minNum between", value1, value2, "minnum");
            return (Criteria) this;
        }

        public Criteria andMinnumNotBetween(Integer value1, Integer value2) {
            addCriterion("minNum not between", value1, value2, "minnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNull() {
            addCriterion("maxNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNotNull() {
            addCriterion("maxNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxnumEqualTo(Integer value) {
            addCriterion("maxNum =", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotEqualTo(Integer value) {
            addCriterion("maxNum <>", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThan(Integer value) {
            addCriterion("maxNum >", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxNum >=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThan(Integer value) {
            addCriterion("maxNum <", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("maxNum <=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumIn(List<Integer> values) {
            addCriterion("maxNum in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotIn(List<Integer> values) {
            addCriterion("maxNum not in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumBetween(Integer value1, Integer value2) {
            addCriterion("maxNum between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxNum not between", value1, value2, "maxnum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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