package com.ancyxing.designpatterns.bridge;

/**
  * @author yangxing
  * @date 2023/9/9
  */ // 具体形状类：正方形
class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Square filled with ");
        color.applyColor();
    }
}
