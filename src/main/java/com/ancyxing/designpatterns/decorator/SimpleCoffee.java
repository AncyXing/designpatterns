package com.ancyxing.designpatterns.decorator;

// 基本的咖啡类
class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        // 基本咖啡的价格
        return 2.0;
    }

    @Override
    public String description() {
        return "普通咖啡";
    }
}
