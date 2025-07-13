package com.ancyxing.designpatterns.creational.factorymethod;

public class CommunityExecutive implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("社区构建相关问题");
    }
}
