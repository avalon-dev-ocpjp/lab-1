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
public class LinearArraySorting implements Sort<int[]>{

    @Override
    public void run(int[] array) {
        Arrays.sort(array);
    }
    
}
