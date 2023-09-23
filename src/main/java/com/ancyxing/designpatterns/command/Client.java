package com.ancyxing.designpatterns.command;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 创建接收者对象
        Light light = new Light();

        // 创建命令对象并关联接收者
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // 创建调用者对象并设置命令
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOn);

        // 按下按钮执行命令
        remoteControl.pressButton();

        // 设置不同的命令并再次按下按钮
        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();
    }
}
