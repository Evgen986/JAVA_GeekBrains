package org.example.seminar2.HW4;

import java.util.Arrays;

/*

 */
public class Zadanie4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        char[][] board2 = {
                {'5', '3', '4', '6', '7', '8', '9', '1', '2'},
                {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
                {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
                {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
                {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
                {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
                {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
                {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
                {'3', '4', '5', '2', '8', '6', '1', '7', '9'}};
        System.out.println("с точками = " + validSudoku(board));
        System.out.println("решенный = " + validSudoku(board2));
    }

    public static boolean validSudoku(char [][] array){
        int [] colomsArr = new int[9];  // Массив для хранения данных в колонках
        int [] rowsArr = new int[9];  // Массив для хранения данных строках
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(49 < array[i][j] && array[i][j] > 57) return false; // проверям, что-бу судоку был заполнен
                colomsArr[j] = Character.digit(array[i][j], 10);  // в эталонный массив заносим значения колонок судоку
                rowsArr[j] = Character.digit(array[j][i], 10); // в эталонный массив заносим значения строк судоку
            }
            if(Arrays.stream(colomsArr).sum() != 45 && Arrays.stream(rowsArr).sum() != 45) return false; // в эталонных массивах сумма должна быть равна 45
            colomsArr = new int[9]; // Очищаем массив после проверки
            rowsArr = new int[9];  // Очищаем массив после проверки
        }
        int [][] referenceArr = new int[9][9];  // Массива для хранения ячеек 3*3 судоку
        int count = 0; // Счетчик для колонок
        int index = 0; // Счетчик для строк
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                referenceArr[(int)Math.floor(j/3)+ index][count] = Character.digit(array[i][j], 10); // Заполняем массивы данными судоку
                count++;
                if (count % 3 == 0) count -= 3;  // Что-бы следующую строку начинать с нужного места
            }
            count += 3; // Что-бы следующую строку начинать с нужного места
            if (count == 9) count = 0; // если достигли конца строк обнуляем
            if (i == 2 || i == 5) index += 3; // переход на следующую строку
        }
        for (int[] ints : referenceArr) {  // Проверка создержимого массивов
            if (Arrays.stream(ints).sum() != 45) return false;
        }
        return true;
    }
}
