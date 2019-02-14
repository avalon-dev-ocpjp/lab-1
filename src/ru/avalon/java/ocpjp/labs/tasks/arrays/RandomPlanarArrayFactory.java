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
 * @author Fox
 */
public class RandomPlanarArrayFactory implements Factory<int[][]> {
    
    private final Random RANDOM = new Random();
    private final int row = RANDOM.nextInt(10) + 10;
    private final int column = RANDOM.nextInt(10) + 10;
    
    @Override
    public int[][] create() {
        int[][] array = new int[row][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[column];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = RANDOM.nextInt(100);
            }
        }
        return array;
    }
    
}
