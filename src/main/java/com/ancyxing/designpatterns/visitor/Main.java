package com.ancyxing.designpatterns.visitor;

public class Main {
    public static void main(String[] args) {
        // 创建具体元素对象
        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();
        
        // 创建具体访问者对象
        ConcreteVisitor visitor = new ConcreteVisitor();
        
        // 在对象结构中接受访问者的访问
        elementA.accept(visitor);
        elementB.accept(visitor);
    }
}
