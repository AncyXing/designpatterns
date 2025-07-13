package com.ancyxing.designpatterns.behavioral.strategy;

public class SortClient {
    private final SortStrategy sortStrategy;

    public SortClient(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] array) {
        this.sortStrategy.sort(array);
    }
}
