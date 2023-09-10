package com.ancyxing.designpatterns.facade;

/**
 * @author yangxing
 * @date 2023/9/9
 */ // 具体灯光控制类
class ConcreteLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("灯光已开启");
    }
    @Override
    public void turnOff() {
        System.out.println("灯光已关闭");
    }
}
