package com.ancyxing.designpatterns.adapter;

// 英国插头具体实现
class UKPlugImpl implements UKPlug {
    @Override
    public void plugIn() {
        System.out.println("插入英国插头");
    }
}
