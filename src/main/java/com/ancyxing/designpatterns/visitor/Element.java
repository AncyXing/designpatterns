package com.ancyxing.designpatterns.visitor;

// 元素接口
public interface Element {
    void accept(Visitor visitor);

    void operation();
}
