package com.ancyxing.designpatterns.decorator;

public class Client {
    public static void main(String[] args) {
        // 创建基本咖啡
        Coffee coffee = new SimpleCoffee();
        System.out.println("描述：" + coffee.description());
        System.out.println("价格：" + coffee.cost() + "元");

        // 添加牛奶装饰器
        coffee = new MilkDecorator(coffee);
        System.out.println("描述：" + coffee.description());
        System.out.println("价格：" + coffee.cost() + "元");

        // 再添加摩卡装饰器
        coffee = new MochaDecorator(coffee);
        System.out.println("描述：" + coffee.description());
        System.out.println("价格：" + coffee.cost() + "元");
    }
}
