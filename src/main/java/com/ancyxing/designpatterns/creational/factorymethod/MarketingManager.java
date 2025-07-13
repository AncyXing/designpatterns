package com.ancyxing.designpatterns.creational.factorymethod;

public class MarketingManager extends HiringManager {
    @Override
    Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
