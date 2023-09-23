package com.ancyxing.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

// 主题接口
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

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

// 观察者接口
interface Observer {
    void update(int state);
}

// 具体观察者类
class ConcreteObserver implements Observer {
    private int observerState;

    public void update(int state) {
        observerState = state;
        System.out.println("Observer received state update: " + observerState);
    }
}

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

