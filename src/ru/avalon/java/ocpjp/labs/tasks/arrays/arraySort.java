/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

/**
 *
 * @author Кирилл
 */
public class arraySort<T> implements Sort<T> {

    @Override
    public void run(T dataSet) {

        if (dataSet.getClass().equals(int[].class)) {

            singleArraySort((int[]) dataSet);

        } else if (dataSet.getClass().equals(int[][].class)) {
            int[][] array = (int[][]) dataSet;
            int[] arrayTTL = new int[array.length * array.length];
            int index = 0;
            for (int q = 0; q < array.length; q++) {
                for (int j = 0; j < array[q].length; j++) {
                    arrayTTL[index] = array[q][j];
                    index++;
                }
            }
            index = 0;
            
            arrayTTL = singleArraySort(arrayTTL);
            
            for (int q = 0; q < array.length; q++) {
                for (int j = 0; j < array[q].length; j++) {
                    array[q][j] = arrayTTL[index];
                    index++;
                }
            }    
            
        }
    }

    private int[] singleArraySort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    private int[][] doubleArraySort(int[][] array) {
        
        return array;
    }
}
