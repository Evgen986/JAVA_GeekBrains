package org.example.seminar1.cw1;

/*
Учитывая целое число n, верните разницу между произведением его цифр и суммой его цифр.
Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15
 */

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (num != 0){
            sum += num % 10;
            product *= num%10;
            num /= 10;
        }
        System.out.println(product-sum);
    }
}
