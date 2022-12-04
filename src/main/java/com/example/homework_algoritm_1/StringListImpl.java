package com.example.homework_algoritm_1;

import java.util.ArrayList;
import java.util.List;

public class StringListImpl implements StringList {
    private final List<String> stringList = new ArrayList<>();

    @Override
    public String add(String item) {
        stringList.add(item);
        return item;
    }

    @Override
    public String add(int index, String item) {
        if (index > stringList.size()) {
            throw new MyException("Индекс превышает размер массива");
        } else stringList.add(index, item);
        return stringList.get(index);
    }

    @Override
    public String set(int index, String item) {
        if (index > stringList.size()) {
            throw new MyException("Индекс превышает размер массива");
        } else
            stringList.set(index, item);
        return stringList.get(index);
    }

    @Override
    public String remove(String item) {
        if (!stringList.contains(item)) {
            throw new MyException("Такого элемента нет");
        }
        int count = stringList.indexOf(item);
        stringList.remove(count);
        return "удален элемент " + item;
    }

    @Override
    public String remove(int index) {
        if (index > stringList.size()) {
            throw new MyException("Индекс превышает размер массива");
        }
        String str = stringList.get(index);
        stringList.remove(index);
        return "Удален элемент -" + str;
    }

    @Override
    public boolean contains(String item) {
        if (stringList.contains(item)) {
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        return stringList.indexOf(item);
    }

    @Override
    public int lastIndexOf(String item) {
        return stringList.lastIndexOf(item);
    }

    @Override
    public String get(int index) {
        if (index > stringList.size()) {
            throw new MyException("Индекс превышает размер массива");
        }

        return stringList.get(index);
    }

    @Override
    public boolean equals(StringList otherList) {
        return false;
    }

    @Override
    public int size() {
        return stringList.size();
    }

    @Override
    public boolean isEmpty() {
        if (stringList.isEmpty()) {
            return true;
        } else return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public String[] toArray() {
        return new String[0];
    }
    public void getAll() {
        stringList.stream().forEach(System.out::println);
    }
    @Override
    public String toString() {
        String str="";
        for (int i = 0; i < stringList.size(); i++) {
            str = str + stringList.get(i);
        }
        return str;
    }
}
