package com.ancyxing.designpatterns.bridge;

public class Client {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color green = new GreenColor();

        Shape redCircle = new Circle(red);
        Shape greenSquare = new Square(green);

        redCircle.applyColor();
        greenSquare.applyColor();
    }
}
