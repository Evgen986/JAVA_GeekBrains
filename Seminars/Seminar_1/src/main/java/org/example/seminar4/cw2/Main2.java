package org.example.seminar4.cw2;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Построить однонаправленный список целых чисел. Найти сумму четных элементов
 * списка.
 */
public class Main2 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) sum += list.get(i);
        }
        System.out.println("Сумма четных элементов = " + sum);
    }
}
