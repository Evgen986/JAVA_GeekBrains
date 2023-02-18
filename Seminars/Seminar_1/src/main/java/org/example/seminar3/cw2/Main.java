package org.example.seminar3.cw2;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дан массив объектов: фамилия студента, номер группы, размер стипендии,
 * баллы по 3 предметам. Определить стипендии студентов, фамилии которых
 * заканчиваются на «ова», при четной сумме баллов.
 */
public class Main {
    public static void main(String[] args) {
        Students st1 = new Students("Петрова", 5, 1000, List.of(5, 4, 3, 5));
        Students st2 = new Students("Сереев", 5, 1200, List.of(3, 4, 5, 5));
        Students st3 = new Students("Иванов", 4, 1500, List.of(2, 4, 5, 5));
        Students st4 = new Students("Горенова", 3, 1700, List.of(5, 5, 5, 5));

        List <Students> allStudents = new ArrayList<>();
        allStudents.add(st1);
        allStudents.add(st2);
        allStudents.add(st3);
        allStudents.add(st4);
        for (Students student: allStudents) {
            if (strSudentEnd(student.getSurName(), "ова")) {
                int sum = 0;
                for (Integer count: student.getEstimates()) {
                    sum += count;
                }
                if (sum % 2 == 0){
                    System.out.println("Стипендия = " + student.getSizeGrant());
                }
            }
            }
        }






    public static boolean strSudentEnd(String surName, String findStr){
        int charCount = surName.length()-findStr.length();
        if (surName.substring(charCount).equals(findStr)) return true;
        else return false;
    }
}
