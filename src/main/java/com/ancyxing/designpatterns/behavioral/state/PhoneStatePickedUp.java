package com.ancyxing.designpatterns.behavioral.state;

public class PhoneStatePickedUp implements PhoneState {
    @Override
    public PhoneState pickUp() {
        throw new RuntimeException("already picked up");
    }

    @Override
    public PhoneState hangUp() {
        return new PhoneStateIdle();
    }

    @Override
    public PhoneState dial() {
        return new PhoneStateCalling();
    }
}
