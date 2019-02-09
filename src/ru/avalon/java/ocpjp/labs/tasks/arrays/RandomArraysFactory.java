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
 * @author Sonya
 */
public class RandomArraysFactory implements Factory<int[]>{
    
    private final Random RANDOM = new Random();

    @Override
    public int[] create() {
       int[] array = new int[RANDOM.nextInt(11)+10];
       for(int i=0;i<array.length;i++){
           array[i]=RANDOM.nextInt(101);
       }
       return array;
    }    
}
