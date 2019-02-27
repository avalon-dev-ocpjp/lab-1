package ru.avalon.java.ocpjp.labs.common;

import java.io.IOException;

public class Array2DWriterImpl implements ObjectWriter<int[][]> {
    @Override
    public void write(int[][] object) throws IOException {
        for (int i = 0; i < object.length; i++) {
            for (int j = 0; j < object[i].length; j++) {
                System.out.print(object[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public void close() throws IOException {

    }
}
