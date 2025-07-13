package com.ancyxing.designpatterns.creational.factorymethod;

public class DevelopmentManager extends HiringManager {
    @Override
    Interviewer makeInterviewer() {
        return new Developer();
    }
}
