package com.ancyxing.designpatterns.prototypepatterns.prototypeexample;

/**
 * 某个对象的抽象，比如肥仔快乐水和肥宅泡面都属于商品，给这些商品提供一个克隆自身属性的方法
 * @author yangxing
 * @date 2019/7/20
 */
public interface Prototype {
     /**
      * 复制自身实例属性的方法
      * @return 与自身实例属性值相同的新对象
      */
     Prototype clone();
}
