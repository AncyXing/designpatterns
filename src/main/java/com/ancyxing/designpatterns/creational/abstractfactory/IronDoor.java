package com.ancyxing.designpatterns.creational.abstractfactory;

public class IronDoor implements Door {
    @Override
    public void getDescription() {
        System.out.println("我是铁门");
    }
}
