package com.ancyxing.designpatterns.adapter;

// 中国插座具体实现
class ChineseSocketImpl implements ChineseSocket {
    @Override
    public void powerOn() {
        System.out.println("中国插座通电");
    }
}
