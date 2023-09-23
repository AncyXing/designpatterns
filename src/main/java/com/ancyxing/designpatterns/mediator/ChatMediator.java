package com.ancyxing.designpatterns.mediator;

// 中介者接口
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}

// 用户接口
interface User {
    void receiveMessage(String message);
    void sendMessage(String message);
}
