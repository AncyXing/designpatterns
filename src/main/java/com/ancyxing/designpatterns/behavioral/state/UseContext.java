package com.ancyxing.designpatterns.behavioral.state;

/**
 * 可以被解释为一种策略模式，不同的状态对应不同的处理逻辑
 */
public class UseContext {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.pickUp();
        phone.dial();
    }
}
