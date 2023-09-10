package com.ancyxing.designpatterns.facade;

// 家庭影院外观类
class HomeTheaterFacade {
    private TV tv;
    private Stereo stereo;
    private Light light;

    public HomeTheaterFacade() {
        this.tv = new ConcreteTV();
        this.stereo = new ConcreteStereo();
        this.light = new ConcreteLight();
    }

    // 打开家庭影院
    public void turnOn() {
        System.out.println("=== 打开家庭影院 ===");
        tv.turnOn();
        stereo.turnOn();
        light.turnOn();
    }

    // 关闭家庭影院
    public void turnOff() {
        System.out.println("\n=== 关闭家庭影院 ===");
        light.turnOff();
        stereo.turnOff();
        tv.turnOff();
    }
}
