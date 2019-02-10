/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

/**
 *
 * @author Sonya
 */
public class DoubleArraySorting implements Sort<int[][]> {

    int rows;
    int columns;
    int[] linearArray;

    @Override
    public void run(int[][] array) {
        columns = array[0].length;
        rows = array.length;

        linearArray = toLinearArray(array);
        Arrays.sort(linearArray);
        setDoubleArray(array);
        

    }

    private int[] toLinearArray(int[][] array) {
        int[] linearArray = new int[rows * columns];
        int i = 0;
        int j = 0;
        for (int k = 0; k < linearArray.length; k++) {
            linearArray[k] = array[i][j];
            if (++j == columns) {
                i++;
                j = 0;
            }
        }
        return linearArray;
    }

    private void setDoubleArray(int[][] array) {
        int j=0;
        for(int[] row:array){
            for(int i=0;i<row.length;i++){
                row[i] = linearArray[j];
                j++;
            }
        }        
    }    
}
