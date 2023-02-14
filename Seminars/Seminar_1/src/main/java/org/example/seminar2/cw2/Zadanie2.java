package org.example.seminar2.cw2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int num1 = sc.nextInt();
        for (int i = 1; i < count; i++) {
            int num2 = sc.nextInt();
            if (num1 % 2 == 0 & num2%10 == 5){
                sum += num2;
            }
            num1 = num2;
        }
        sc.close();
        System.out.println(sum);
    }




}
