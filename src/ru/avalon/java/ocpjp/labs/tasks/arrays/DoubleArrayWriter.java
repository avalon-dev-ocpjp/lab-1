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
public class DoubleArrayWriter implements ObjectWriter<int[][]> {

    PrintStream stream = System.out;

    @Override
    public void write(int[][] array) throws IOException {
        StringBuilder sb = new StringBuilder();
        for(int[] arr:array){
            for (int num:arr){
                sb.append(num<10?"  ":" ")
                  .append(num);                
            }
            sb.append("\n");
        }
        stream.print(sb);
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }

}
