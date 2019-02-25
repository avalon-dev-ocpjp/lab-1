package ru.avalon.java.ocpjp.labs.tasks.arrays;

import java.io.IOException;
import java.util.Arrays;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

public class TwoDimensionalArraysWriter implements ObjectWriter<int[][]> {
    /**
     * {@inheritDoc}
     */
    @Override
    public void write(int[][] array) throws IOException {
        for(int[] item: array)
            System.out.println(Arrays.toString(item));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws IOException {}
}
