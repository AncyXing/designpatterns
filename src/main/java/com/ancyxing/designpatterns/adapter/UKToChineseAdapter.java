package com.ancyxing.designpatterns.adapter;

// 英国插头到中国插座的适配器
class UKToChineseAdapter implements ChineseSocket {
    private UKPlug ukPlug;

    public UKToChineseAdapter(UKPlug ukPlug) {
        this.ukPlug = ukPlug;
    }

    @Override
    public void powerOn() {
        ukPlug.plugIn();
        System.out.println("适配器将英国插头连接到中国插座");
    }
}
