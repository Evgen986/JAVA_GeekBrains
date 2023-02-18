package org.example.seminar3.cw1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item = new Item("Бананы", "Бразилия", 25);
        Item item2 = new Item("Бананы", "Аргентина", 35);
        Item item3 = new Item("Апельсины", "Австралия", 27);
        Item item4 = new Item("Бананы", "Бразилия", 18);

        List <Item> itemList = new ArrayList<>();
        itemList.add(item);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);

        System.out.println(itemList);
        String searchName = "Бананы";
        Integer sumValue = 0;
        List <String> country = new ArrayList<>();
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getItem().equals(searchName)){
                if (!country.contains(itemList.get(i).getCountryName())) {
                    country.add(itemList.get(i).getCountryName());
                }
                sumValue += itemList.get(i).getValue();
            }
        }
        System.out.println("country = " + country);
        System.out.println("value = " + sumValue);
    }

}
