package com.ancyxing.designpatterns.bridge;

// 形状抽象类
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void applyColor();
}

