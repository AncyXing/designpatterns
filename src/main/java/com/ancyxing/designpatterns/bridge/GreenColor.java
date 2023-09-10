package com.ancyxing.designpatterns.bridge;

/**
  * @author yangxing
  * @date 2023/9/9
  */ // 具体颜色类：绿色
class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying green color");
    }
}
