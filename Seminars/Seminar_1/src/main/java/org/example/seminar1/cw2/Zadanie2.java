package org.example.seminar1.cw2;

/*
Дана последовательность N целых чиселю Найти количество положительных чисел после которых следует отрицательно число.
 */

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num1 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int num2 = scanner.nextInt();
            if(num1 > 0 && num2 < 0){
                count++;
            }
            num1 = num2;
        }
        System.out.println(count);
    }
}
