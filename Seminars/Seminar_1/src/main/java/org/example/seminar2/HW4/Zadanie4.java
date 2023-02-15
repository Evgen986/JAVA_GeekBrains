package org.example.seminar2.HW4;

import java.util.Arrays;
import java.util.HashSet;

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
        System.out.println("с точками = " + checkCorrectFilling(board));
        System.out.println("Доска заполненна корректно(численно) = " + isValidSudokuDesk(board2));
        System.out.println("Доска заполненна правильно(матем.) = " + checkCorrectFilling(board2));
    }

    /**
     * Проверяет корректность заполнения доски судоку
     * через подсчет введенных значений в строках, колонках и блоках
     * @param array массивы с данными доски судоку
     * @return true если доска заполненна корректно, иначе false
     */
    public static boolean checkCorrectFilling(char [][] array){
        int [] colomsArr = new int[9];  // Массив для хранения данных в колонках
        int [] rowsArr = new int[9];  // Массив для хранения данных строках
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
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

    /**
     * Проверяет доску судоку на валидность
     * @param arr массивы с данными доски судоку
     * @return true если доска валидна, иначе false
     */
    public static boolean isValidSudokuDesk(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            HashSet<Character> rowSet = new HashSet<>();  // Множество для строк
            HashSet<Character> columnsSet = new HashSet<>();  // Множество для колонок
            for (int j = 0; j < arr[i].length; j++) {  // Перебираем доску судоку
                char symbol = arr[i][j];  // Получаем символ колонки судоку
                if (rowSet.contains(symbol)) return false;  // Если полученный элемент есть в множестве, то false
                if (symbol != '.') rowSet.add(symbol); // Добавляем символ в множество для дальнейших проверок
                symbol = arr[j][i];  // Получаем сивол строки судоку
                if (columnsSet.contains(symbol)) return false;  // Если полученный элемент есть в множестве, то false
                if (symbol != '.') columnsSet.add(symbol); // Добавляем символ в множество для дальнейших проверок
            }
        }
        int row = 0; // счетчик для движения по строкам
        int column = 0; // счетчик для движения по колонкам
        for (int i = 0; i < 9; i++) {  // Перебираем блоки доски судоку
            HashSet<Character> blockSet = new HashSet<>(); // Создаем пустое множество для хранения данных блока 3*3
            for (int j = row; j < row + 3; j++) { // Перебираем строку блока
                for (int k = column; k < column + 3; k++) { // Перебираем ячейки блока
                    char symbol = arr[j][k]; // Получаем символ блока
                    if (blockSet.contains(symbol)) return false; // Если символ блока есть в множестве то false
                    if (symbol != '.') blockSet.add(symbol); // Добавляем  символ в множество для дальнейших проверок
                }
            }
            column += 3; // Увеличиваем счетчик колонок на 3 для перехода к следующему блоку
            if (column == 9) { // Если счетчик == 9
                column = 0; // обнуляем счетчик колонок
                row += 3; // и переходим к следующим строкам
            }
        }
        return true; // Если все проверки прошли то возвращаем true
    }
}
