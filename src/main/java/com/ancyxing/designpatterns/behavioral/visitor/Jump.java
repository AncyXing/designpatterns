package com.ancyxing.designpatterns.behavioral.visitor;

public class Jump implements AnimalOperation{
    @Override
    public void visitMonkey(Monkey monkey) {
        System.out.println("Jumped 20 feet high! on to the tree!");
    }

    @Override
    public void visitLion() {

    }

    @Override
    public void visitDolphin() {

    }
}
