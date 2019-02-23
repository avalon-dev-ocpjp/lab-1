/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.util.Arrays;

/**
 *
 * @author Павлик
 */
public class SortTwoDimArr implements Sort<int[][]> {
     
    private int[] arr;
    SortOneDimArr s = new SortOneDimArr();    

    @Override
    public void run(int[][] arr2) {
        arr = new int [arr2[0].length*2];
        System.arraycopy(arr2[0], 0, arr, 0, arr2[0].length);
        System.arraycopy(arr2[1], 0, arr, arr2[0].length , arr2[1].length);
        s.run(arr);
        System.arraycopy(arr, 0, arr2[0], 0, arr2[0].length);
        System.arraycopy(arr, arr2[0].length, arr2[1], 0, arr2[1].length);
    }
}
    

