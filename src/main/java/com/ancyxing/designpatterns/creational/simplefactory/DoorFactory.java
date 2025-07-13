package com.ancyxing.designpatterns.creational.simplefactory;

public class DoorFactory {
    public static Door getDoor(float width, float height){
        return new WoodenDor(width, height);
    }
}
