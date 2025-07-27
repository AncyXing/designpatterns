package com.ancyxing.designpatterns.behavioral.state;

public class PhoneStateCalling implements PhoneState{
    @Override
    public PhoneState pickUp() {
        System.out.println("already picked up");
        throw new RuntimeException("already picked up");
    }

    @Override
    public PhoneState hangUp() {
        return new PhoneStateIdle();
    }

    @Override
    public PhoneState dial() {
        System.out.println("already calling");
        throw new RuntimeException("already calling");
    }
}
