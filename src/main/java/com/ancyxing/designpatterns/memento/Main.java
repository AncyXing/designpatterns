package com.ancyxing.designpatterns.memento;

// 备忘录类
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}

// 发起者类
class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // 创建备忘录并保存当前状态
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    // 从备忘录中恢复状态
    public void restoreStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}

// 管理者类
class Caretaker {
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建发起者对象
        Originator originator = new Originator();
        originator.setState("状态1");

        // 创建管理者对象并保存发起者的状态
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.saveStateToMemento());

        // 修改发起者的状态
        originator.setState("状态2");

        // 恢复发起者的状态
        originator.restoreStateFromMemento(caretaker.getMemento());

        System.out.println("当前状态: " + originator.getState());
    }
}
