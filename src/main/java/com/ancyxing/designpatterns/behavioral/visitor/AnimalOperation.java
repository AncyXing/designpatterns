package com.ancyxing.designpatterns.behavioral.visitor;

public interface AnimalOperation {
    void visitMonkey(Monkey monkey);

    void visitLion();

    void visitDolphin();
}
