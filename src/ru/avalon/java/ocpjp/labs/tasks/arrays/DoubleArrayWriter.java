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

    private PrintStream stream = System.out;

    @Override
    public void write(int[][] array) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int num = array[i][j];             
                sb.append(num > 9 ? " " : "  ")
                  .append(num);
                if (j + 1 == array[i].length) {
                    sb.append("\n");
                }
            }
        }
        stream.println(sb);
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }

}
