package org.example.seminar3.HW4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Введите значения для занесения в массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int [][] result = array(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

    }
    public static int [][] array (int [] arr){
        int count = (arr.length-1)*arr.length;
        int [][] array = new int[count][arr.length];
        array[0] = arr;
        for (int i = 1; i < count; i++) {
            List <Integer> tempList = Arrays.asList(Arrays.stream(arr).boxed().toArray(Integer[]::new));
            int countOf = 0;
            do{
                countOf = 0;
                Collections.shuffle(tempList);
                int[] temp = new int[tempList.size()];
                for (int j = 0; j < tempList.size(); j++) {
                    temp[j] = tempList.get(j);
                }
                for (int j = 0; j < array.length; j++) {
                    if (Arrays.equals(array[j], temp)) countOf++;
                }
            }while (countOf != 0);
            for (int j = 0; j < tempList.size(); j++) {
                array[i][j] = tempList.get(j);
            }
        }
        return array;
    }
}
