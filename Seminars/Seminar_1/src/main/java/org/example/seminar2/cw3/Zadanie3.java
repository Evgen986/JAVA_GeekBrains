package org.example.seminar2.cw3;

import java.util.Scanner;

/*
Дан массив целых чисел. Найти количество пар соседних элементов,
где первый элемент вдвое больше второго.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        int k = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]*2){
                k++;
            }
        }
        sc.close();
        System.out.println(k);
    }
}
