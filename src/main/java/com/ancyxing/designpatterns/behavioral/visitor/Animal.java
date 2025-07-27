package com.ancyxing.designpatterns.behavioral.visitor;

public interface Animal {
    void accept(AnimalOperation operation);
}
