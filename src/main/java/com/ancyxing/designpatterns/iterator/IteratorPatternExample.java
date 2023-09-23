package com.ancyxing.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

// 定义迭代器接口
interface Iterator<T> {
    boolean hasNext();
    T next();
}

// 定义具体的迭代器实现
class ConcreteIterator<T> implements Iterator<T> {
    private List<T> collection;
    private int index = 0;

    public ConcreteIterator(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }

    @Override
    public T next() {
        if (hasNext()) {
            T item = collection.get(index);
            index++;
            return item;
        } else {
            throw new IndexOutOfBoundsException("No more elements");
        }
    }
}

// 定义集合接口
interface IterableCollection<T> {
    Iterator<T> createIterator();
}

// 定义具体的集合实现
class ConcreteCollection<T> implements IterableCollection<T> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(items);
    }
}

// 客户端代码
public class IteratorPatternExample {
    public static void main(String[] args) {
        ConcreteCollection<String> collection = new ConcreteCollection<>();
        collection.addItem("Item 1");
        collection.addItem("Item 2");
        collection.addItem("Item 3");

        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
