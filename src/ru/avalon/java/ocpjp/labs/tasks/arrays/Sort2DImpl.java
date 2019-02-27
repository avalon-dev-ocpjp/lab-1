package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.common.Array1DWriterImpl;

import java.util.ArrayList;

public class Sort2DImpl implements Sort<int[][]> {
    @Override
    public void run(int[][] dataSet) {
        int stolb = dataSet.length;
        int str = dataSet[0].length;
        System.out.println(stolb + " " + str);
        for (int c = 0; c <= (str * stolb); c++) {
            for (int j = 0; j < stolb - 1; j++) {
                for (int i = 0; i < str - 1; i++) {
                    if (dataSet[j][i] > dataSet[j][i + 1]) {
                        dataSet[j][i] = dataSet[j][i] ^ dataSet[j][i + 1];
                        dataSet[j][i + 1] = dataSet[j][i] ^ dataSet[j][i + 1];
                        dataSet[j][i] = dataSet[j][i] ^ dataSet[j][i + 1];
                    }
                }
            }
            for (int i = 0; i < str - 1; i++) {
                for (int j = 0; j < stolb - 1; j++) {
                    if (dataSet[j][i] > dataSet[j][i + 1]) {
                        dataSet[j][i] = dataSet[j][i] ^ dataSet[j][i + 1];
                        dataSet[j][i + 1] = dataSet[j][i] ^ dataSet[j][i + 1];
                        dataSet[j][i] = dataSet[j][i] ^ dataSet[j][i + 1];
                    }
                }
            }
        }
    }
}
