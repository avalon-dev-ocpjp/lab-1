/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.lang.reflect.Array;
import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author Sonya
 */
public class DoubleArraysFactory implements Factory<int[][]> {

    private final Random random = new Random();

    @Override
    public int[][] create() {
        int[][] array = null;
        array = (int[][]) Array.newInstance(int.class,
                random.nextInt(11) + 10,random.nextInt(10) + 10);
        for (int [] arr:array) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
            }
        }
        return array;
    }
}
