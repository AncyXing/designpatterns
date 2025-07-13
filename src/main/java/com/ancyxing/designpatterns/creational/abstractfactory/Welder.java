package com.ancyxing.designpatterns.creational.abstractfactory;

public class Welder implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("我只会修铁门");
    }
}
