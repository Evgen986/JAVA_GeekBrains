package org.example.seminar5.HW2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Подсчитать количество искомого слова,
 * через map (наполнением значение, где искомое слово будет являться ключом)
 */
public class Main {
    public static void main(String[] args) {
        String findWord;
        int choice = 3;

        System.out.print("Введите вариант поиска:\n1 - По вводимому тексту;\n2 - По файлу;\nВведите цифру: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            choice = sc.nextInt();
            sc.nextLine();
        }

        if (choice == 1) {
            System.out.print("Введите текст: ");
            String text = sc.nextLine();
            System.out.print("Введите слово для поиска: ");
            findWord = sc.nextLine();
            System.out.printf("Слово \"%s\" встречается %d раз(а).", findWord, countWord(text, findWord));
        } else if (choice == 2) {
            System.out.print("Введите слово для поиска: ");
            findWord = sc.nextLine();
            int count = 0;
            try (BufferedReader br = new BufferedReader(new FileReader("text.txt"))) {
                String text;
                while ((text = br.readLine()) != null) {
                    count += countWord(text, findWord);
                }
                System.out.printf("Слово \"%s\" встречается %d раз(а).", findWord, count);
            } catch (IOException e) {
                System.out.println("Ошибка при выполнении чтения файла: " + e);
            }
        } else System.out.println("Неизвестная команда!");
    }

    public static int countWord(String text, String findWord) {
        findWord = findWord.toLowerCase();
        text = text.replaceAll("[^а-яА-я\\s]", "").replaceAll("\\s{2,}", " ");
        String[] word = text.toLowerCase().split(" ");
        Map<String, Integer> countWordMap = new HashMap<>();
        countWordMap.put(findWord, 0);
        for (String s : word) {
            if (countWordMap.containsKey(s)) countWordMap.put(s, countWordMap.get(s) + 1);
        }
        return countWordMap.get(findWord);
    }
}

