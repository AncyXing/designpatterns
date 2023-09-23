package com.ancyxing.designpatterns.facade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        // 打开家庭影院
        homeTheater.turnOn();

        // 关闭家庭影院
        homeTheater.turnOff();
    }
}
