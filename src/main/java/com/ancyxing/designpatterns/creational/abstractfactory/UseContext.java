package com.ancyxing.designpatterns.creational.abstractfactory;

/**
 * 什么时候使用：当存在相互关联的依赖项且涉及较复杂的创建逻辑时
 */
public class UseContext {
    public static void main(String[] args) {
        DoorFactory doorFactory = new WoodenDoorFactory();
        doorFactory.makeDoor().getDescription();
        doorFactory.makeFittingExpert().getDescription();
    }
}
