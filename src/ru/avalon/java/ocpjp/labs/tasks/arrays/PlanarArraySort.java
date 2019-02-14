/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

/**
 *
 * @author Fox
 */
public class PlanarArraySort implements Sort<int[][]> {

    @Override
    public void run(int[][] array) {
        /* Cортировка через слияние в одномерный массив
        int r = array.length;
        int c = array[1].length;
        int[] buf = new int[r*c];
        for (int k = 0; k < buf.length;) {
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
        buf[k++] = array[i][j];
        }
        }
        }
        Arrays.sort(buf);
        int k = 0;
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
        array[i][j] = buf[k++];
        }
        }
        buf = null; */
        
        // Последовательно сравниаем все элементы массива с каждым из них
        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                for (int[] array2 : array) {
                    for (int c = 0; c < array2.length; c++) {
                        if (array2[c] > array1[j]) {
                            array2[c] ^= array1[j];
                            array1[j] ^= array2[c];
                            array2[c] ^= array1[j];
                        }
                    }
                }
            }
        }

    }
    
}
