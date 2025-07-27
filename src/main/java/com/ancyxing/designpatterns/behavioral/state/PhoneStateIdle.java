package com.ancyxing.designpatterns.behavioral.state;

public class PhoneStateIdle implements PhoneState{
    @Override
    public PhoneState pickUp() {
        return new PhoneStatePickedUp();
    }

    @Override
    public PhoneState hangUp() {
        throw new RuntimeException("already idle");
    }

    @Override
    public PhoneState dial() {
        throw new RuntimeException("unable to dial in idle state");
    }
}
