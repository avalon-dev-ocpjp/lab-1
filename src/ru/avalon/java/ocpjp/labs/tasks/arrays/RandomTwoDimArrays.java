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
 * @author lesya
 */
public class RandomTwoDimArrays implements Factory<int[][]>{
    
    private final Random RANDOM = new Random();

    @Override
    public int[][] create() {
        int dim = RANDOM.nextInt(10) + 10;
        int[][] array = new int[dim][dim];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = RANDOM.nextInt(100);
            }
        }
        return array;
    }
    
}
