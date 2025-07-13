package com.ancyxing.designpatterns.behavioral.strategy;

public class BubbleSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("BubbleSort");
    }
}
