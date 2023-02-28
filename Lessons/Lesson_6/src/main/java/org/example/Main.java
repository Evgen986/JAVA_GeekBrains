package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> setList = new HashSet<>();
        setList.add(1);
        setList.add(2);
        setList.add(3);
        System.out.printf("Создано новое множество setList %s%n", setList);
        setList.add(1);
        System.out.printf("В множество setList добавлен еще один эл-т \"1\", который игнорируется %s%n", setList);
        List<Integer> hashList = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2));
        System.out.printf("Создан новый лист hashList %s%n", hashList);
        Set<Integer> setList2 = new HashSet<>(hashList);
        System.out.printf("Создано новое множество setList2 на основе листа %s%n", setList2);
        setList.addAll(setList2);
//        setList2.retainAll(setList); // разность множеств
//        setList.removeAll(setList2); // пересечение множеств
        System.out.printf("Объединение двух множеств setList и setList2 %s%n", setList);

    }
}