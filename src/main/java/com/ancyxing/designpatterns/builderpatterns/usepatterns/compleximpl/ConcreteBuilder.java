package com.ancyxing.designpatterns.builderpatterns.usepatterns.compleximpl;

/**
 * 生成器
 * @author yangxing
 * @date 2019/7/18
 */
public class ConcreteBuilder {
    private String contractId;
    private String personName;
    private long beginDate;
    private long endDate;
    private String otherData;

    /**
     * 必填对象
     * @param contractId 合同id
     * @param beginDate 生效时间
     * @param endDate 失效时间
     */
    public ConcreteBuilder(String contractId, long beginDate, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public ConcreteBuilder setOtherData(String otherData) {
        this.otherData = otherData;
        return this;
    }

    public InsuranceContract build() {
        return new InsuranceContract(this);
    }

    public String getContractId() {
        return contractId;
    }

    public String getPersonName() {
        return personName;
    }

    public long getBeginDate() {
        return beginDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public String getOtherData() {
        return otherData;
    }
}
