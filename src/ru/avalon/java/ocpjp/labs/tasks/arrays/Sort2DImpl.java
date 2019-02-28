package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.ArrayList;
import java.util.Comparator;

public class Sort2DImpl implements Sort<int[][]> {
    @Override
    public void run(int[][] dataSet) {
        int vLength = dataSet.length;
        int hLength = dataSet[0].length;
        System.out.println(vLength);
        System.out.println(hLength);
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < vLength; i++) {
            for (int j = 0; j < hLength; j++) {
                temp.add(dataSet[i][j]);
            }
        }

        temp.sort(Comparator.comparing(x -> x));

        for (int i = 0; i < vLength; i++) {
            for (int j = 0; j < hLength; j++) {
                    dataSet[i][j] = temp.get(i * hLength + j);
            }
        }
    }
}
