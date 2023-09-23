package com.ancyxing.designpatterns.visitor;

// 具体元素B
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void operation() {
        System.out.println("具体元素B的操作B");
    }
}