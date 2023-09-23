package com.ancyxing.designpatterns.visitor;

// 具体元素A
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void operation() {
        System.out.println("具体元素A的操作A");
    }
}


