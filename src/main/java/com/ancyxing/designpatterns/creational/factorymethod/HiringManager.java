package com.ancyxing.designpatterns.creational.factorymethod;

public abstract class HiringManager {
    abstract Interviewer makeInterviewer();

    void takeInterview() {
        makeInterviewer().askQuestions();
    }
}
