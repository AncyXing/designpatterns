package com.ancyxing.designpatterns.proxy;

public class Client {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // 图像1首次访问，会延迟加载
        image1.display();
        
        // 图像1再次访问，不会重新加载
        image1.display();
        
        // 图像2首次访问，会延迟加载
        image2.display();
    }
}
