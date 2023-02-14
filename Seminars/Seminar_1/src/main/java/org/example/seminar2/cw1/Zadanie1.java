package org.example.seminar2.cw1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        sc.close();
        System.out.println(myPow(x, n));
    }
    public static double myPow(double x, int n) {
        double result = 1;
        if (n < 0){
            x = 1/x;
            n *= -1;
        }
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
}
