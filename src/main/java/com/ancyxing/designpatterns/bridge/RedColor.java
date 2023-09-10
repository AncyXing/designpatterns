package com.ancyxing.designpatterns.bridge;

/**
 * @author yangxing
 * @date 2023/9/9
 */ // 具体颜色类：红色
class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
