package com.ancyxing.designpatterns.command;

/**
 * 具体命令类 - 关灯命令
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}