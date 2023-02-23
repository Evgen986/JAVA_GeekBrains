package org.example.seminar4.cw5;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Учитывая строковый путь, который является абсолютным путем (начинающимся с косой черты '/')
 * к файлу или каталогу в файловой системе в стиле Unix, преобразуйте его в упрощенный канонический путь.
 * <p>
 * В файловой системе в стиле Unix точка '.' относится к текущему каталогу, двойная точка '..'
 * относится к каталогу на более высоком уровне, а любые несколько последовательных косых черт (например, '//')
 * рассматриваются как одна косая черта '/'. Для решения этой проблемы любой другой формат точек, такой как '...',
 * обрабатывается как имена файлов / каталогов.
 */
public class Main {
    public static void main(String[] args) {
        String text = "/../";
        System.out.println(simplifyPath(text));
    }

    public static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals(".")) continue;
            else if (arr[i].equals("..")) {
                if (!list.isEmpty()) list.pop();
            }else list.add(arr[i]);
        }
        return "/" + String.join("/", list);
    }
}
