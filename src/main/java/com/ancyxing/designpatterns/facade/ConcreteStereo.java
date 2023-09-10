package com.ancyxing.designpatterns.facade;

/**
 * @author yangxing
 * @date 2023/9/9
 */ // 具体音响类
class ConcreteStereo implements Stereo {
    @Override
    public void turnOn() {
        System.out.println("音响已开启");
    }
    @Override
    public void turnOff() {
        System.out.println("音响已关闭");
    }
}
