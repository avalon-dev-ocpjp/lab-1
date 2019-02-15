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
public class LinearArraysWriter implements ObjectWriter<int[]> {
    
    private PrintStream stream = System.out; 
    
    private String arrayToString (int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int x: array) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(x);
        }
        return sb.insert(0, '[').append(']').toString();
    }

    @Override
    public void write(int[] array) throws IOException {
        String string = arrayToString(array);
        stream.println(string);
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }

    
}
