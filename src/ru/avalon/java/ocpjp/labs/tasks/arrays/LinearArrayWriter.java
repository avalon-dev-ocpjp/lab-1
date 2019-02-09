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
 * @author Sonya
 */
public class LinearArrayWriter implements ObjectWriter<int[]> {
    
    private PrintStream stream = System.out;

    private String arrayToString(int[] array){
        StringBuilder sb = new StringBuilder("[");
        for(int num:array){
            if(sb.length()>1){
                sb.append(" ,");
            }
            sb.append(num);
        }
        return sb.append("]").toString();
    }
    
    @Override
    public void write(int[] array) throws IOException {
        String str = arrayToString(array);
        stream.println(str);
    }

    @Override
    public void close() throws IOException {
        stream=null;
    }
    
}
