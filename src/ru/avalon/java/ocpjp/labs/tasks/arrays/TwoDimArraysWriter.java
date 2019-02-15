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
 * @author lesya
 */
public class TwoDimArraysWriter implements ObjectWriter<int[][]> {
    
        private PrintStream stream = System.out; 

    public String arrayToString(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }

    @Override
    public void write(int[][] array) throws IOException {
        String string = arrayToString(array);
        stream.println(string);
    }
 
}
