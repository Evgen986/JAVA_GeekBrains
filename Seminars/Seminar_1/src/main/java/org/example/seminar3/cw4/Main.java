package org.example.seminar3.cw4;

import org.example.seminar3.cw3.Cube;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cube c1 = new Cube(4, "желтый", "дерево");
        Cube c2 = new Cube(5, "красный", "пластик");
        Cube c3 = new Cube(2, "желтый", "пластик");
        Cube c4 = new Cube(4, "желтый", "дерево");
        List <Cube> cubes = new ArrayList<>();
        cubes.add(c1);
        cubes.add(c2);
        cubes.add(c3);
        cubes.add(c4);

        System.out.println(getunique(cubes));
    }
    public static Collection getunique (Collection coll){
        return new HashSet(coll);
    }
}
