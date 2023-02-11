package org.example.seminar1.cw4;

/*
Учитывая две двоичные строки a и b, верните их сумму в виде двоичной строки.

Input: a = "11", b = "1"
Output: "100"

Input: a = "1010", b = "1011"
Output: "10101"
 */

public class Zadanie4 {
    public static void main(String[] args) {

    }

    public String addBinary(String a, String b) {
        if (a.length() < b.length()){
            return addBinary(b, a);
        }
        String result = "";
        int k = 0;
        int j = b.length()-1;
        for (int i = a.length(); i >= 0 ; i--) {
            if (a.charAt(i) == '1'){
                k++;
            }
            if (j >= 0 && b.charAt(i) == '1'){
                k++;
            }
            result = k % 2 + result;
            j--;
            k /= 2;
        }
        if (k > 0){
            result = k + result;
        }
        return result;
    }
}
