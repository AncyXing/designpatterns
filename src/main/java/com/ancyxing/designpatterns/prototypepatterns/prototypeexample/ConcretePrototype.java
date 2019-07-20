package com.ancyxing.designpatterns.prototypepatterns.prototypeexample;

/**
 * 实现具体克隆方法的对象
 * @author yangxing
 * @date 2019/7/20
 */
public class ConcretePrototype implements Prototype{
    /**
     * 实现自身属性的复制
     * @return 克隆出的新对象，属性值与本实例相同
     */
    @Override
    public Prototype clone() {
        Prototype concretePrototype = new ConcretePrototype();
        return concretePrototype;
    }
}
