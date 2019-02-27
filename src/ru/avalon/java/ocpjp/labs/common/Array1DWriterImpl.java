package ru.avalon.java.ocpjp.labs.common;

import java.io.IOException;

public class Array1DWriterImpl implements ObjectWriter<int[]> {
    @Override
    public void write(int[] object) throws IOException {
        for (int i = 0; i < object.length; i++) {
            System.out.println(object[i]);
        }
    }

    @Override
    public void close() throws IOException {
        //Do some closing ops
    }
}
