package com.ancyxing.designpatterns.command;

/**
 * 具体命令类 - 开灯命令
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}