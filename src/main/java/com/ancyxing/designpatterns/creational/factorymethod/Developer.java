package com.ancyxing.designpatterns.creational.factorymethod;

public class Developer implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("提问开发相关问题");
    }
}
