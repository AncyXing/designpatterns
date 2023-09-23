package com.ancyxing.designpatterns.command;

/**
 * 接收者类 - 电灯
 */
public class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}
