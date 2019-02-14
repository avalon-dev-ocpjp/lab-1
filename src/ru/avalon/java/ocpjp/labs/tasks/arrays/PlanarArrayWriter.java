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
 * @author Fox
 */
public class PlanarArrayWriter implements ObjectWriter<int[][]> {

    private PrintStream stream = System.out;
    
    private String arrayToString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (int[] i : array) {
            builder2.delete(0, builder2.length());
            for (int j : i) {
                if (builder2.length() > 0) {
                    builder2.append(", ");
                }
                builder2.append(j);
            }
            builder2.insert(0, '[').append("]\n");
            builder.append(builder2.toString());
        }        
        return builder.toString().trim();
    }    
    
    @Override
    public void write(int[][] array) throws IOException {
        String string = arrayToString(array);
        stream.println(string);
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }    
}
