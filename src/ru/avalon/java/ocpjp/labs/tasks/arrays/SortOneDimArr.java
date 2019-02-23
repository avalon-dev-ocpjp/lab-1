/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

/**
 *
 * @author Павлик
 */
public class SortOneDimArr implements Sort<int[]>{
    
    private Boolean flag = false;
    private int tmp;
        

    @Override
    public void run(int[] arr) {
        while(!flag){
            flag = true;
            for(int i = 0; i<arr.length-1; i++){
                if(arr[i]>arr[i+1]){
                    flag = false;
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;                  
                }
            }
        }
    }
}
    

