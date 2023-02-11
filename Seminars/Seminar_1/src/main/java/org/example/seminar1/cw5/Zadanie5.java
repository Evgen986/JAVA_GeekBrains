package org.example.seminar1.cw5;

/*
Дан массив целых чисел. Верно ли, что массив является симметричным?
 */

public class Zadanie5 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(checkArray(array));
    }

    public static String checkArray (int [] arr){
        for (int i = 0; i < arr.length/2; i++) {
            if (arr[i] != arr[arr.length-1-i]){
                return "Не семметричен";
            }
        }
        return "Семметричен";
    }
}
