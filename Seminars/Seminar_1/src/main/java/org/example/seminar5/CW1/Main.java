package org.example.seminar5.CW1;

import java.util.HashMap;
import java.util.Map;

/**
 * Посчитать количество вхождений каждого символа в текст.
 */
public class Main {
    public static void main(String[] args) {
        String text = "Привет мир! Привет мир!";
        Map<Character, Integer> mapList = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (mapList.containsKey(text.charAt(i))){
                mapList.put(text.charAt(i), mapList.get(text.charAt(i)) + 1);
            } else mapList.put(text.charAt(i), 1);
        }
        System.out.println(mapList);
    }
}
