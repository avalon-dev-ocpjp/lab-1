/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

/**
 *
 * @author Кирилл
 */
public class ArrayWriter<T> implements ObjectWriter<T> {

    @Override
    public void write(T object) throws IOException {
        if (object.getClass().equals(int[].class)) {
            singleArrayWriter((int[]) object);

        } else if (object.getClass().equals(int[][].class)) {
            doubleArrayWriter((int[][]) object);
        }
    }
    
    private int[] singleArrayWriter(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
        return array;
    }
    private int[][] doubleArrayWriter(int[][] array){
            for (int i = 0; i < array.length; i++) {
                singleArrayWriter(array[i]);
            }
        return array;
    }    
    
    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
