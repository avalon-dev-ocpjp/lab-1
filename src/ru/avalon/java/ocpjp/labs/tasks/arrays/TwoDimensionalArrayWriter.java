/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import java.io.PrintStream;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

/**
 *
 * @author Павлик
 */
public class TwoDimensionalArrayWriter implements ObjectWriter<int[][]>{
    private PrintStream stream = System.out;

    @Override
    public void write(int[][] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }
    
}
