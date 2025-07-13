package com.ancyxing.designpatterns.creational.simplefactory;

/**
 * 何时使用：当创建对象不只是简单的赋值且要涉及部分逻辑时，
 * 可以将对象的创建放到专门的创建工厂中，减少重复代码
 */
public class UseContext {
    public static void main(String[] args) {
        Door door = DoorFactory.getDoor(100, 200);
        System.out.println(door);
    }
}
