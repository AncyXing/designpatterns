package com.ancyxing.designpatterns.behavioral.visitor;

public class UseContext {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Speak speak = new Speak();
        Jump jump = new Jump();
        monkey.accept(speak);
        monkey.accept(jump);
    }
}
