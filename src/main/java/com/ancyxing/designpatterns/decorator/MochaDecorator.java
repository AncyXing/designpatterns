package com.ancyxing.designpatterns.decorator;

/**
 * @author yangxing
 * @date 2023/9/10
 */ // 摩卡装饰器
class MochaDecorator extends CoffeeDecorator {
    public MochaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        // 在原始咖啡的价格基础上加上摩卡价格
        return super.cost() + 1.0;
    }

    @Override
    public String description() {
        // 添加摩卡的描述
        return super.description() + ", 摩卡";
    }
}
