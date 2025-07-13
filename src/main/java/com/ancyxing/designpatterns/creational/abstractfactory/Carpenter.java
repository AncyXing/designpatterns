package com.ancyxing.designpatterns.creational.abstractfactory;

public class Carpenter implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("我只会修木门");
    }
}
