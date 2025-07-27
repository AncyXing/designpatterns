package com.ancyxing.designpatterns.behavioral.state;

public class Phone {
    private PhoneState phoneState;

    public Phone() {
        this.phoneState = new PhoneStateIdle();
    }

    void pickUp() {
        this.phoneState.pickUp();
    }

    void hangUp() {
        this.phoneState.hangUp();
    }

    void dial() {
        this.phoneState.dial();
    }
}
