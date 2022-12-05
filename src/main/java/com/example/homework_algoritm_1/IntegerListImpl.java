package com.example.homework_algoritm_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerListImpl implements IntegerList {

    private  List<Integer> integerList = new ArrayList<>();


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
        Integer tmp = integerList.get(index);
        integerList.remove(index);
        return tmp;
    }

    @Override
    public boolean contains(Integer item) {
        if (integerList.contains(item)) {
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(Integer item) {
        return integerList.indexOf(item);
    }

    @Override
    public int lastIndexOf(Integer item) {
       return integerList.lastIndexOf(item);
    }

    @Override
    public Integer get(int index) {
        if (index > integerList.size()) {
            throw new MyException("Индекс превышает размер массива");
        }
        return integerList.get(index);
    }

    @Override
    public boolean equals(List<Integer> otherList) {
        if (integerList == null) {
            return otherList == null;
        }

        if (integerList.size() != otherList.size()) {
            return false;
        }
        integerList= integerList.stream().sorted().collect(Collectors.toList());
        otherList = otherList.stream().sorted().collect(Collectors.toList());
        return integerList.equals(otherList);
      }

    @Override
    public int size() {
        return integerList.size();
    }

    @Override
    public boolean isEmpty() {
        if (integerList.isEmpty()) {
            return true;
        } else return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer[] toArray() {
        Integer[] copyArrey = new Integer[integerList.size()];
        for (int i = 0; i < copyArrey.length; i++) {
            copyArrey[i]=integerList.get(i);
        }
       return copyArrey;
    }

    public void getAll() {
        integerList.stream().forEach(System.out::println);
    }
}
