package com.ancyxing.designpatterns.creational.factorymethod;

/**
 * 包含通用处理逻辑，且不同子类的实现不同
 * 将实例化的逻辑分派给子类
 */
public class UseContext {
    public static void main(String[] args) {
        HiringManager devManager = new DevelopmentManager();
        devManager.takeInterview();
        HiringManager marketingManager = new MarketingManager();
        marketingManager.takeInterview();
    }
}
