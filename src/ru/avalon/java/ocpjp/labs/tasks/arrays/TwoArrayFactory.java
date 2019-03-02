/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author java
 */
public class TwoArrayFactory implements Factory<int[][]> {

    int arr[][];
    private final int LEFT_SCOPE = 10;
    private final int RIGHT_SCOPE = 20;
    private final int MAX = 1000;

    @Override
    public int[][] create() {
        Random rnd = new Random();
        int digit;
        int arrSize = rnd.nextInt(RIGHT_SCOPE - LEFT_SCOPE) + LEFT_SCOPE;
        arr = new int[arrSize][arrSize];
        for (int i = 0; i < arrSize; ++i) {
            for (int j = 0; j < arrSize; ++j) {
                digit = rnd.nextInt(MAX);
                arr[i][j] = digit;
            }
        }
        return arr;
    }
}
