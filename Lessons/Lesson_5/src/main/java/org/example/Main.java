package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map <Integer, String> mapList = new HashMap<>(5);
        mapList.put(3,"один"); // Добавление элемента в словарь
        mapList.put(2,"два");
        mapList.put(1,"три");
        mapList.put(null,"ключ null");

        Map<Integer, String> mapList2 = new HashMap<>();
        mapList2.put(5, "пять");
        mapList2.put(6, "шесть");
        mapList2.put(7, "семь");
        mapList2.put(8, "восемь");
        mapList2.put(9, "девять");
        mapList2.put(10, "десять");
        mapList2.put(11, "одиннадцать");

        System.out.println("Печать словаря: " + mapList); // Печать словаря
        System.out.println("Проверка содержится ли в словаре ключ 1: " + mapList.containsKey(1));
        System.out.println("Проверка содержится ли в словаре значение null: " + mapList.containsValue("null"));
        System.out.println("Сравнение 2-х словарей: " + mapList.equals(mapList2));
        System.out.println("Является ли 2-й словарь пустым: " + mapList2.isEmpty());
        System.out.println("Получение значения 1-го словаря по ключу 2: " + mapList.get(2));
        System.out.println("Получение значения 1-го словаря по отсутствующему ключу: " + mapList.get(5));
        System.out.println("Получение значения 1-го словаря по отсутствующему ключу с доп. параметром: " + mapList.getOrDefault(5, "не найдено!"));
        System.out.println("Добавление в эл-та в словарь, с проверкой на его наличие!");
        mapList.putIfAbsent(5, "пять");
        mapList.putIfAbsent(3, "это не должно добавиться, т.к. такой ключ уже есть");
        System.out.println("Словарь полсле изменений: " + mapList);
        System.out.println("Удаление элемента из словаря");
        mapList.remove(5);
        mapList.remove(10); // Вызов метода с ключом, которго нет в словаре - к ошибке не приводит
        System.out.println("Словарь полсле изменений: " + mapList);
        System.out.println("Получаем размер первого словаря: " + mapList.size());

        System.out.println("--------------- Map.Entry ---------------------");
        System.out.println("\nПеребор словаря по элементам при помощи Map.Entry");
        for (Map.Entry<Integer, String> item : mapList.entrySet()) {
            System.out.printf("ключ = %d : значение = %s%n", item.getKey(), item.getValue());
            if (item.getValue().equals("три")) {
                item.setValue("это значение заменено");
                System.out.println(item);
            }
        }
        System.out.println("\nСловарь после изменения в форич, через Map.Entry: " + mapList);
        System.out.println("Передаем значения из словаря в LinkedList и ключи в другой лист.");
        List<String> listValues = new LinkedList<>(mapList.values());
        List<Integer> listKeys = new LinkedList<>(mapList.keySet());
        System.out.println("LinkedList со значениями словаря: " + listValues);
        System.out.println("LinkedList с ключами словаря: " + listKeys);

        System.out.println("------------------ LinkedHashMap -----------------------");
        System.out.println("Создаем карту(словарь) LinkedHashMap");
        Map<Integer,String> linkHashMap = new LinkedHashMap<>();
        linkHashMap.put(9, "первый эл-т");
        linkHashMap.put(5, "второй эл-т");
        linkHashMap.put(2, "третий эл-т");
        linkHashMap.put(15, "четвертый эл-т");
        System.out.println("LinkedHashMap в порядке заполнения: " + linkHashMap);

        System.out.println("--------------- SortedMap -------------------");
        System.out.println("HashList переведен в SortedMap:");
        SortedMap<Integer, String> sortMapList = new TreeMap<>();
        sortMapList.putAll(mapList2);
        System.out.println("SortedMap = " + sortMapList);
        System.out.println("Получем первый ключ SortedMap = " + sortMapList.firstKey());
        System.out.println("Получаем значение первого ключа SortedMap = " + sortMapList.get(sortMapList.firstKey()));
        System.out.println("Получем последний ключ SortedMap = " + sortMapList.lastKey());
        System.out.println("Получем пары SortedMap до указанного ключа (не включая его) = " + sortMapList.headMap(7));
        System.out.println("Получем пары SortedMap с указанного ключа = " + sortMapList.tailMap(6));
        System.out.println("Получем пары SortedMap от и до указанных ключей = " + sortMapList.subMap(6, 9));

        System.out.println("------------- NavigableMap ----------------------");
        NavigableMap<Integer,String> navMap = new TreeMap<>();
        navMap.putAll(mapList2);
        System.out.println("Создали NavigableMap navMap = " + navMap);
        System.out.println("Ищем пару по ключу >= 3: " + navMap.ceilingEntry(3));
        System.out.println("Ищем пару по ключу <= 15: " + navMap.floorEntry(15));
        System.out.println("Ищем пару по ключу > 15: " + navMap.higherEntry(3));
        System.out.println("Ищем пару по ключу < 15: " + navMap.lowerEntry(15));
        System.out.println("Получаем первую пару из NavigableMap = " + navMap.firstEntry());
        System.out.println("Получаем последнюю пару из NavigableMap = " + navMap.lastEntry());
        System.out.println("Получаем ключи в обратном порядке = " + navMap.descendingKeySet());
        System.out.println("Получаем NavigableMap в обратном порядке = " + navMap.descendingMap());
        System.out.println("\"Срезы\" по NavigableMap");
        System.out.println("Срез до ключа 9 включительно = " + navMap.headMap(9, true));
        System.out.println("Срез от ключа 6 невключительно = " + navMap.tailMap(6, false));
        System.out.println("Срез от ключа 6 включительно до ключа 9 не включтиельно = " +
                navMap.subMap(6, true, 9, false));
        System.out.println("\n" + "-------------- TreeMap -------------------");
        NavigableMap<Integer, String> treeMap = new TreeMap<>(mapList2);
        System.out.println(treeMap);

    }
}