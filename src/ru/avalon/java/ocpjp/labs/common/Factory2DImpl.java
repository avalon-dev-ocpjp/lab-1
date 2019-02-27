package ru.avalon.java.ocpjp.labs.common;

import java.util.Random;

public class Factory2DImpl implements Factory {
    @Override
    public int[][] create() {
        Random random = new Random();
        int stolb = random.nextInt(10) + 10;
        int str = random.nextInt(10) + 10;
        int[][] arr = new int[stolb][str];
        for (int i = 0; i < stolb; i++) {
            for (int j = 0; j < str; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        return arr;
    }
}
