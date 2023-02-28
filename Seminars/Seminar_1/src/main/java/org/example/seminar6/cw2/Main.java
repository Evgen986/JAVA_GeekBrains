package org.example.seminar6.cw2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Найти пересечение двух множеств
 * Пример:
 * set1= [1,2,3,4]
 * set2= [3,5,6,7]
 * Вывод в консоль:
 */
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(5,6,7,8,9));
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(result);
    }
}
