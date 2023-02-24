package org.example.seminar5.CW2;

import java.util.HashMap;
import java.util.Map;

/**
 * Определить, есть ли в массиве дубликаты, если найден хоть один, вывести на экран (true),
 * В противном случае (false).
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(isDouble(arr));
    }
    public static boolean isDouble (int [] array){
        Map <Integer, Integer> mapList = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (mapList.containsKey(array[i])) return true;
            else mapList.put(array[i], 1);
        }
        return false;
    }
}
