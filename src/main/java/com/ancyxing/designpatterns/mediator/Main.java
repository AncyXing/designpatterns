package com.ancyxing.designpatterns.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser("User1", chatRoom);
        User user2 = new ChatUser("User2", chatRoom);
        User user3 = new ChatUser("User3", chatRoom);

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi, User1!");
        user3.sendMessage("Hey, there!");

        // 输出示例：
        // User1 sent: Hello, everyone!
        // User2 received: Hello, everyone!
        // User3 received: Hello, everyone!
        // User2 sent: Hi, User1!
        // User1 received: Hi, User1!
        // User3 sent: Hey, there!
        // User1 received: Hey, there!
        // User2 received: Hey, there!
    }
}
