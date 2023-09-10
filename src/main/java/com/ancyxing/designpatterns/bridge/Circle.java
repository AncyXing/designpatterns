package com.ancyxing.designpatterns.bridge;

/**
 * @author yangxing
 * @date 2023/9/9
 */ // 具体形状类：圆形
class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Circle filled with ");
        color.applyColor();
    }
}
