package org.example.seminar4.cw4;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Построить однонаправленный список целых чисел. Удалить отрицательные элементы
 * списка.
 */
public class main {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>(Arrays.asList(-1,-7,-5,-3,-2,-1));
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) < 0) list.remove(i);
        }
        System.out.println(list);
    }
}
