package com.ancyxing.designpatterns.creational.abstractfactory;

public class WoodenDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("我是木门");
    }
}
