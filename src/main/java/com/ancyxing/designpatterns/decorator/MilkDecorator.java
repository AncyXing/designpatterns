package com.ancyxing.designpatterns.decorator;

// 牛奶装饰器
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        // 在原始咖啡的价格基础上加上牛奶价格
        return super.cost() + 0.5;
    }

    @Override
    public String description() {
        // 添加牛奶的描述
        return super.description() + ", 牛奶";
    }
}

