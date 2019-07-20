package com.ancyxing.designpatterns.prototypepatterns.prototypeexample;

/**
 * 客户端使用一个已创建好的实例快速构建一个与本实例属性值相同的对象
 * @author yangxing
 * @date 2019/7/20
 */
public class Client {
    private Prototype prototype;
    public Client(Prototype prototype) {
        this.prototype = prototype;
    }
    public void someOperation(){
        Prototype newPrototype = prototype.clone();
    }
}
