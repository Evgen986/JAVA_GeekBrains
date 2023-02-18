package org.example.seminar3.cw3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube c1 = new Cube(3, "желтый", "дерево");
        Cube c2 = new Cube(5, "красный", "пластик");
        Cube c3 = new Cube(2, "желтый", "пластик");
        Cube c4 = new Cube(4, "желтый", "дерево");

        List <Cube> cubes = new ArrayList<>();
        cubes.add(c1);
        cubes.add(c2);
        cubes.add(c3);
        cubes.add(c4);

        int totalVolume = 0;
        int countYellowCubes = 0;
        int countWoodCubes = 0;

        for (Cube cube: cubes) {
            if (cube.getColor().equals("желтый")) {
                countYellowCubes++;
                totalVolume += getCube(cube.getSizeFin());
            }
            if (cube.getMaterial().equals("дерево") && cube.getSizeFin() == 3) countWoodCubes++;
            }
        System.out.println("Кубиков желтого цвета = " + countYellowCubes + ", суммарный объем = " + totalVolume);
        System.out.println("Деревянных кубиков с размером ребра 3 = " + countWoodCubes);
        }

    private static int getCube(Integer sizeFin) {
        return sizeFin*sizeFin*sizeFin;
    }
}

