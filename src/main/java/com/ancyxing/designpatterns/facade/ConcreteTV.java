package com.ancyxing.designpatterns.facade;

/**
 * @author yangxing
 * @date 2023/9/9
 */ // 具体电视类
class ConcreteTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("电视已开启");
    }

    @Override
    public void turnOff() {
        System.out.println("电视已关闭");
    }
}
