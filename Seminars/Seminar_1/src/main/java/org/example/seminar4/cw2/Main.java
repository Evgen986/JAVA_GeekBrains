package org.example.seminar4.cw2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Построить однонаправленный список целых чисел. Найти сумму четных элементов
 * списка.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        sc.close();
        // показать/достать элемент
        System.out.println(list);
        System.out.println("peek " + list.peek());
        System.out.println("После peek: " + list);
        System.out.println("pop " + list.pop());
        System.out.println("После pop: " + list);
        // Добавление в начало/вконец
        list.addFirst(5);
        System.out.println("После addFirst: " + list);
        list.addLast(5);
        System.out.println("После addLast: " + list);
        list.add(5);
        System.out.println("После add: " + list);
        // замена
        list.set(0, 7);
        System.out.println("После set: " + list);
        // Проверка на наличие элемента
        System.out.println("contains = " + list.contains("7"));
        // удаление
        list.remove(4);
        System.out.println();
    }
}
