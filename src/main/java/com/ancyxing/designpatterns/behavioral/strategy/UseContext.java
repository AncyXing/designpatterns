package com.ancyxing.designpatterns.behavioral.strategy;

public class UseContext {
    public static void main(String[] args) {
        int[] arraySet = {1, 2, 3, 5, 6};
        SortClient sortClient = new SortClient(new BubbleSortStrategy());
        sortClient.sort(arraySet);
    }
}
