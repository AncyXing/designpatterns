package com.ancyxing.designpatterns.behavioral.strategy;

public class QuickSortStrategy implements SortStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("QuickSort");
    }
}
