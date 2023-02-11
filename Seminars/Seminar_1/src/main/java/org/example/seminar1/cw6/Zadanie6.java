package org.example.seminar1.cw6;

import java.util.Arrays;

/*
Задан массив nums. Мы определяем текущую сумму массива как runningSum[i] = sum(nums[0]...nums[i]).
Возвращает текущую сумму чисел.
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class Zadanie6 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        int [] arr2 = runningSum(arr);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] runningSum(int[] nums) {
        int [] arrays = new int[nums.length];
        for (int i = 0; i< arrays.length; i++){
            int sum = 0;
            for (int j=0; j<=i; j++){
                sum += nums[j];
            }
            arrays[i] = sum;
        }
        return arrays;
    }
}
