package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[1_000_000];
        long time = System.currentTimeMillis();
        int [] arr2 = new int[1_000_001];
        for (int i = 0; i < arr.length; i++) {
            if (i==4) arr2[i] = 1;
            else arr2[i] = arr[i];
        }
        System.out.println("Копия в новый массив = " + (System.currentTimeMillis()-time));

        ArrayList<Integer> list1 = new ArrayList<>(1_000_000);
        for (int i = 0; i < 1_000_000; i++) {
            list1.add(0);
        }
        time = System.currentTimeMillis();
        list1.add(4,1);
        System.out.println("Добавление в ArrayList = " +  (System.currentTimeMillis()-time));

        LinkedList <Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            list2.add(0);
        }
        time = System.currentTimeMillis();
        list2.add(4, 1);
        System.out.println("Добавление в LikendList = " + (System.currentTimeMillis()-time));

        time = System.currentTimeMillis();
        System.out.println("Значение из Array листа по индексу 999_999 = " + list1.get(999_999) + " получено за = " + (System.currentTimeMillis()-time));

        time = System.currentTimeMillis();
        System.out.println("Значение из Likend листа по индексу 500_000 = " + list2.get(500_000) + " получено за = " + (System.currentTimeMillis()-time));
    }
}
