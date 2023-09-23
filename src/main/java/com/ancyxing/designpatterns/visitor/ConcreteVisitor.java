package com.ancyxing.designpatterns.visitor;

// 具体访问者
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Element elementA) {
        System.out.println("具体访问者访问具体元素");
        elementA.operation();
    }
}
