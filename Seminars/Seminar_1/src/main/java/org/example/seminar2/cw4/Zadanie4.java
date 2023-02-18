package org.example.seminar2.cw4;

public class Zadanie4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1,1,1);
        Vector vector2 = new Vector(1,2,1);
        System.out.println(vector2.toString());
        System.out.println("Length = " + vector1.length());
        System.out.println("Scalar = " + vector1.scal(vector2));
        System.out.println("Vector = " + vector2.vecPr(vector1));
        System.out.println("Cosinus = " + vector1.cosinus(vector2));
        System.out.println("Sum = " + vector1.sumVectors(vector2));
        System.out.println("Diff = " + vector1.differenceVectors(vector2));
    }
}
