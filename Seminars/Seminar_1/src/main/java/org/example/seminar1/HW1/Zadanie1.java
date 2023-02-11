package org.example.seminar1.HW1;

import java.util.Arrays;

/*
Учитывая входную строку s, измените порядок слов в обратном порядке.
Слово определяется как последовательность символов, не содержащих пробелов.
Слова в s будут разделены по крайней мере одним пробелом.
Возвращает строку слов в обратном порядке, объединенную одним пробелом.
Обратите внимание, что s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.
Возвращаемая строка должна содержать только один пробел, разделяющий слова.
Не включайте никаких дополнительных пробелов.

Input: s = "the sky is blue"
Output: "blue is sky the"

 */
public class Zadanie1 {
    public static void main(String[] args) {
        String text1 = "the sky is blue";
        String text2 = "  hello world  ";
        String text3 = "a good   example";
        System.out.println(reverseWords(text1));
        System.out.println(reverseWords(text2));
        System.out.println(reverseWords(text3));
    }
    public static String reverseWords(String s) {
        s = s.trim();                                   // Убираем пробелы в начале и конце строки
        while (s.indexOf("  ") > 0){                    // Пока в строке присутствует более одно пробела подряд
            s = s.replace("  ", " ");   // меняем на обин пробел
        }
        String [] arr = s.split(" ");               // Закидываем строку в массив
        StringBuilder str = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {           // Идем с конца массива и собираем значения в строку
            str.append(arr[i]);
            if (i != 0){                                // если i не 0 то добавляем пробел между словами
                str.append(" ");
            }
        }
        return str.toString();
    }
}
