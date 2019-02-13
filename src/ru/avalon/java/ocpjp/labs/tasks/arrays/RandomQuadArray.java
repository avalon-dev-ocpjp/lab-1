package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.common.Factory;

import java.util.Random;

public class RandomQuadArray implements Factory {

    private final Random RANDOM = new Random();

    @Override
    public Object create() {
        int[][] array = new int[RANDOM.nextInt(10) + 10][RANDOM.nextInt(20) + 20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

            }
        }
        return array;
    }
}
