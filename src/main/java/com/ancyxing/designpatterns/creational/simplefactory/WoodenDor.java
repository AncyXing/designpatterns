package com.ancyxing.designpatterns.creational.simplefactory;

public class WoodenDor implements Door {
    private float width;
    private float height;

    public WoodenDor(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getWidth() {
        return width;
    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "WoodenDor{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
