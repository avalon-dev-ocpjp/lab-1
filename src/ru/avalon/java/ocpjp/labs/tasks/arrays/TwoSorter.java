/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

/**
 *
 * @author java
 */
public class TwoSorter implements Sort<int[][]> {

    @Override
    public void run(int[][] dataSet) {
        int size = dataSet.length;
        int[] temp = new int[size * size];
        int k = 0;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                temp[k] = dataSet[i][j];
                ++k;
            }
        }

        Arrays.sort(temp);
        
        k = 0;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                dataSet[i][j] = temp[k];
                ++k;
            }
        }
    }

}
