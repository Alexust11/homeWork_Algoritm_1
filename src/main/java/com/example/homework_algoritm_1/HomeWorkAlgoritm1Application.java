package com.example.homework_algoritm_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HomeWorkAlgoritm1Application {

    public static void main(String[] args) {
        SpringApplication.run(HomeWorkAlgoritm1Application.class, args);
        IntegerListImpl integerList=new IntegerListImpl();
        List<Integer> expectedList=new ArrayList<>(List.of(5, 4, 7, 9, 1, 3));
        // 1
        System.out.println("_____задача 1:_________");
        System.out.println("Добавленный элемент -"+ integerList.add(1));
        System.out.println("Добавленный элемент -"+ integerList.add(2));
        System.out.println("Добавленный элемент -"+ integerList.add(3));
        System.out.println("Добавленный элемент -"+ integerList.add(4));
        System.out.println("Добавленный элемент -"+ integerList.add(5));
        System.out.println("всего элементов "+integerList.size());
        integerList.getAll();


       System.out.println("_____задача 2:_________");
        System.out.println("Новый элемент "+integerList.add(3,7));
         integerList.getAll();

        System.out.println("_____задача 3:_________");
        System.out.println("Переписан элемент по задачи 3: "+integerList.set(3,8));
        integerList.getAll();

        System.out.println("_____задача 4:_________");
        System.out.println(integerList.remove(3));
        integerList.getAll();

        System.out.println("_____задача 5:_________");
        System.out.println(integerList.remove(4));
        integerList.getAll();

        System.out.println("_____задача 6:_________");
        System.out.println(integerList.contains(4));

        System.out.println("_____задача 7:_________");
        System.out.println(integerList.indexOf(4) );

        System.out.println("_____задача 8:_________");
        System.out.println(integerList.lastIndexOf(4));

        System.out.println("_____задача 9:_________");
        System.out.println(integerList.get(3));

        System.out.println("_____задача 10:_________");
        List<Integer> firstList = new ArrayList<>(List.of(5, 4, 7, 9, 1, 3));
        System.out.println(integerList.equals(expectedList));

        System.out.println("_____задача 11:_________");
        System.out.println(integerList.toArray());

//        System.out.println("_____задача 11:_________");
//        System.out.println(list.isEmpty());
//        System.out.println("_______________________________________");
//        System.out.println(list.toString()); ;
    }

}
