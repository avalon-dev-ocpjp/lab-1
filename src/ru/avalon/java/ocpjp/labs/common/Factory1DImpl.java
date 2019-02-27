package ru.avalon.java.ocpjp.labs.common;

import jdk.internal.org.objectweb.asm.commons.RemappingAnnotationAdapter;

import java.util.Random;

public class Factory1DImpl implements Factory {

    @Override
    public int[] create() {
        int randomSize = new Random().nextInt(10) + 10;
        int[] arr = new int[randomSize];
        for (int i = 0; i < randomSize; i++) {
            arr[i] = new Random().nextInt(100);
        }
        return arr;
    }
}
