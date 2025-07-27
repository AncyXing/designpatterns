package com.ancyxing.designpatterns.behavioral.visitor;

public class Speak implements AnimalOperation{
    @Override
    public void visitMonkey(Monkey monkey) {
        monkey.shout();
    }

    @Override
    public void visitLion() {

    }

    @Override
    public void visitDolphin() {

    }
}
