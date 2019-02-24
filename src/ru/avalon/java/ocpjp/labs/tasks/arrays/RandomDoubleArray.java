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
 * @author Кирилл
 */
public class RandomDoubleArray implements Factory<int[][]> {
    private final Random random = new Random();

    @Override
    public int[][] create() {
        int rand = random.nextInt(10)+10;
        int[][] array = new int[rand][rand];
        for(int q=0; q<array.length;q++){
            for(int j = 0; j< array[q].length;j++){
                array[q][j]=random.nextInt(100);
            }
        }
        return array;
    }
    
}
