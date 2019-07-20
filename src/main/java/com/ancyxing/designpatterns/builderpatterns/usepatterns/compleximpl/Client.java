package com.ancyxing.designpatterns.builderpatterns.usepatterns.compleximpl;

/**
 * 用于构造复杂对象
 * @author yangxing
 * @date 2019/7/18
 */
public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder("001", 135L, 67890L);
        InsuranceContract contract = builder.setPersonName("test").setOtherData("hello builder").build();
        contract.doSomething();

    }
}
