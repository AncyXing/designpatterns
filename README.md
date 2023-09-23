# designpatterns
设计模式使用java代码举例实现
- [类的关系](#----)
    * [六种关系](#----)
    * [组合与聚合的区别](#--------)
    * [关联和聚合的区别](#--------)
    * [依赖和关联的区别](#--------)
  

## 类的关系

### 六种关系

![image](https://github.com/AncyXing/picx-images-hosting/raw/master/20230923/image.47175wtj4cs0.webp)

### 组合与聚合的区别

![image](https://github.com/AncyXing/picx-images-hosting/raw/master/20230923/image.chempfasc7c.webp)

### 关联和聚合的区别

![image](https://github.com/AncyXing/picx-images-hosting/raw/master/20230923/image.4hs2b1n5ghs0.webp)

### 依赖和关联的区别

![image](https://github.com/AncyXing/picx-images-hosting/raw/master/20230923/image.20ffwtg53340.webp)

## 行为型
### 中介者模式
#### 使用场景

多个对象之间存在直接调用，导致对象之间的关系复杂。将不同对象进行解耦，方便新增新的对象。

#### 类图

![](https://jsd.cdn.zzko.cn/gh/AncyXing/picx-images-hosting@master/20230902/image.45sleupw8k40.webp)

1. User接口，定义用户之间交互的行为
2. 具体User类，包含对中介者的引用
3. 中介者接口ChatMediator，定义添加用户的行为及用户之间交互的行为
4. 具体中介者ChatRoom，维护用户集合，包含用户之间交互方法的具体逻辑

#### 时序图

![](https://jsd.cdn.zzko.cn/gh/AncyXing/picx-images-hosting@master/20230902/image.12cdt2yox1cw.webp)

#### 具体实现

中介者接口

```java
// 中介者接口
interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
```

具体中介者类

```java
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
```

用户接口

```java
// 用户接口
interface User {
    void receiveMessage(String message);
    void sendMessage(String message);
}
```

具体用户类

```java
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
```

客户端

```java
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
    }
}
```

#### 总结

1. 适合群聊场景、机场塔台场景
2. 降低不同对象之间的耦合度，对象直接同中介者进行交互
