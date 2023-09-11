package com.ancyxing.designpatterns.adapter;

public class Client {
    public static void main(String[] args) {
        // 创建英国插头和中国插座
        UKPlug ukPlug = new UKPlugImpl();
        ChineseSocket chineseSocket = new ChineseSocketImpl();

        // 尝试连接英国插头到中国插座（会失败）
        System.out.println("尝试连接英国插头到中国插座：");
        chineseSocket.powerOn();

        // 使用适配器将英国插头连接到中国插座
        System.out.println("\n使用适配器连接英国插头到中国插座：");
        UKToChineseAdapter adapter = new UKToChineseAdapter(ukPlug);
        adapter.powerOn();
    }
}
