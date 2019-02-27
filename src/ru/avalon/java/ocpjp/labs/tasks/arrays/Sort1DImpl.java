package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sort1DImpl implements Sort<int[]> {
    @Override
    public void run(int[] dataSet) {
        for (int i = 0; i < dataSet.length - 1; i++) {
            for (int j = 0; j < dataSet.length - i - 1; j++) {
                if (dataSet[j] > dataSet[j + 1]) {
                    dataSet[j] = dataSet[j] ^ dataSet[j + 1];
                    dataSet[j + 1] = dataSet[j] ^ dataSet[j + 1];
                    dataSet[j] = dataSet[j] ^ dataSet[j + 1];
                }
            }
        }
    }
}
