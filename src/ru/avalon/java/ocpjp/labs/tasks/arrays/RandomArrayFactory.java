package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Random;

public class RandomArrayFactory implements ru.avalon.java.ocpjp.labs.common.Factory<int[]> {


    private final Random RANDOM = new Random();


    @Override
    public int[] create() {
        int[] array = new int[RANDOM.nextInt(10) + 10];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(100);
        }
        return array;
    }
}
