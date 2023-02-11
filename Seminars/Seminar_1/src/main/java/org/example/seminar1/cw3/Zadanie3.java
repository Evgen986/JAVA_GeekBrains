package org.example.seminar1.cw3;

/*
Дана строкаю Поменять местами ее половины.
 */

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(text.substring(text.length()/2)).append(text.substring(0, text.length()/2));
        System.out.println(sb);
    }
}
