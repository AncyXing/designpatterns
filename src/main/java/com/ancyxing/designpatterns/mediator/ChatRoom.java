package com.ancyxing.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

// 具体中介者类 - 聊天室
class ChatRoom implements ChatMediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}

// 具体用户类
class ChatUser implements User {
    private String name;
    private ChatMediator mediator;

    public ChatUser(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }

    public void sendMessage(String message) {
        System.out.println(name + " sent: " + message);
        mediator.sendMessage(message, this);
    }
}
