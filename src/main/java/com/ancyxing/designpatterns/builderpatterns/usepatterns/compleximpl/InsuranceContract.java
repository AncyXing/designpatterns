package com.ancyxing.designpatterns.builderpatterns.usepatterns.compleximpl;

import com.ancyxing.designpatterns.builderpatterns.usepatterns.simpleimpl.Builder;

/**
 * 保险合同对象
 *
 * @author yangxing
 * @date 2019/7/18
 */
public class InsuranceContract {
    private String contractId;
    private String personName;
    private long beginDate;
    private long endDate;
    private String otherData;

    /**
     * 构造方法
     * @param builder 生成器
     */
    public InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
    }

    public void doSomething() {
        System.out.println("do something");
    }
}
