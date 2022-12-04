package com.example.homework_algoritm_1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListImpl implements IntegerList {

    private final List<Integer> integerList = new ArrayList<>();


    @Override
    public Integer add(Integer item) {
        integerList.add(item);
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        if (index > integerList.size()) {
            throw new MyException("Индекс превышает размер массива");
        } else integerList.add(index, item);
        return integerList.get(index);
    }

    @Override
    public Integer set(int index, Integer item) {
        if (index > integerList.size()) {
            throw new MyException("Индекс превышает размер массива");
        } else
            integerList.set(index, item);
        return integerList.get(index);
    }

    @Override
    public Integer remove(Integer item) {
        if (!integerList.contains(item)) {
            throw new MyException("Такого элемента нет");
        }
        int count = integerList.indexOf(item);
        integerList.remove(count);
        return item;
    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public boolean contains(Integer item) {
        return false;
    }

    @Override
    public int indexOf(Integer item) {
        return 0;
    }

    @Override
    public int lastIndexOf(Integer item) {
        return 0;
    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public boolean equals(IntegerList otherList) {
        return false;
    }

    @Override
    public int size() {
        return integerList.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer[] toArray() {
        return new Integer[0];
    }

    public void getAll() {
        integerList.stream().forEach(System.out::println);
    }
}
