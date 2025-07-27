package com.ancyxing.designpatterns.behavioral.state;

public interface PhoneState {
    /**
     * 接听
     * @return
     */
    PhoneState pickUp();

    /**
     * 挂断
     * @return
     */
    PhoneState hangUp();

    /**
     * 拨号
     * @return
     */
    PhoneState dial();
}
