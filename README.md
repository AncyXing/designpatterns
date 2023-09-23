# designpatterns
设计模式使用java代码举例实现
- [类的关系](#类的关系)
    * [六种关系](#六种关系)
    * [组合与聚合的区别](#组合与聚合的区别)
    * [关联和聚合的区别](#关联和聚合的区别)
    * [依赖和关联的区别](#依赖和关联的区别)
- [行为型](#行为型)
  * [中介者模式](#中介者模式)
    + [使用场景](#使用场景)
    + [类图](#类图)
    + [时序图](#时序图)
    + [具体实现](#具体实现)
    + [总结](#总结)
  * [观察者模式](#观察者模式)
    + [使用场景](#使用场景)
    + [类图](#类图)
    + [时序图](#时序图)
    + [具体实现](#具体实现)
    + [总结](#总结)

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
### 观察者模式
#### 使用场景

订阅-发布场景、广播场景

#### 类图

![image](https://jsd.cdn.zzko.cn/gh/AncyXing/picx-images-hosting@master/20230902/image.2u780kazdfi0.webp)

1. Subject接口，定义管理观察者和通知观察者的方法
2. 具体Subject类，包含一个观察者集合，实现管理观察者和通知观察者的方法
3. 观察者接口Observer，定义观察者发现主题状态变更后要触发的行为
4. 具体观察者ConcreteObserver，实现主题状态变更后要触发的行为

#### 时序图

![image](https://jsd.cdn.zzko.cn/gh/AncyXing/picx-images-hosting@master/20230902/image.47raid741rk0.webp)

#### 具体实现

观察者接口

```java
// 观察者接口
interface Observer {
    void update(int state);
}
```

具体观察者类

```java
// 具体观察者类
class ConcreteObserver implements Observer {
    private int observerState;

    public void update(int state) {
        observerState = state;
        System.out.println("Observer received state update: " + observerState);
    }
}
```

主题接口

```java
// 主题接口
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
```

具体主题类

```java
// 具体主题类
class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
```

客户端

```java
class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        // 创建观察者
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();
        Observer observer3 = new ConcreteObserver();

        // 注册观察者
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);

        // 主题状态发生改变，通知观察者
        subject.setState(0);

        // 移除一个观察者
        subject.removeObserver(observer2);

        // 主题状态再次发生改变，通知观察者
        subject.setState(1);
    }
}
```

#### 总结

1. 可以用来监控某个对象，当这个被监控对象的状态变更后，通知关注此状态变更事件的其他对象触发相应的行为
2. 实现了观察者和主题之间的解耦，方便新增观察者