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
 * @author Павлик
 */
public class TwoDimensionalArrayFactory implements Factory <int[][]> {
    
    private final Random RANDOM = new Random();

    @Override
    public int[][] create() {
        int length;
        length = RANDOM.nextInt(10)+10;
        int[][] array = new int[length][length];
        for (int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++){
                array[i][j] = RANDOM.nextInt(100);
            }
            
        }
        return array;
    }
    
}
