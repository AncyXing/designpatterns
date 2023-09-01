package com.ancyxing.designpatterns.state;

// 定义状态接口
interface State {
    void handle();
}

// 具体状态类 - 状态A
class ConcreteStateA implements State {
    public void handle() {
        System.out.println("State A is handling.");
    }
}

// 具体状态类 - 状态B
class ConcreteStateB implements State {
    public void handle() {
        System.out.println("State B is handling.");
    }
}

// 上下文类
class Context {
    private State currentState;

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handle();
    }
}

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        // 初始状态为A
        State stateA = new ConcreteStateA();
        context.setState(stateA);

        // 上下文对象执行请求
        context.request();

        // 切换状态为B
        State stateB = new ConcreteStateB();
        context.setState(stateB);

        // 上下文对象执行请求
        context.request();
    }
}
