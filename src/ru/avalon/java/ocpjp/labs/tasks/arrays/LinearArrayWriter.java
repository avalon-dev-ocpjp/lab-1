package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class LinearArrayWriter implements ObjectWriter<int[]> {

    private PrintStream stream = System.out;

    @Override
    public void write(int[] array) {
        stream.print("[");
        for (int item : array) {
            stream.print(item);
            stream.print(", ");
        }
        stream.println("]");
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }
}
