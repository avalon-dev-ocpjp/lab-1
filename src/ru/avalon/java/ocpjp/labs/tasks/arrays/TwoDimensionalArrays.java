package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.Factory;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * Задание, направленное на получение умений и навыков
 * объявления и использования многомерных массивов.
 */
public final class TwoDimensionalArrays implements Exercise {
    /**
     * Фабрика, создающая двумерный массив, содержащий
     * случайные числа в диапазоне от {@code 0} до
     * {@code 100}.
     * <p>
     * Количество строк и столбцов должно быть случайным
     * и колебатся в диапазоне от {@code 10} до {@code 20}.
     * <p>
     * Массив должен быть прямоугольным. То есть
     * количество элементов всех строк должно совпадать,
     * как и количество элементов всех столбцов.
     */
    private Factory<int[][]> factory;

    /**
     * Выполняет соритровку двумерного массива таким
     * образом, что все элементы массива должны быть
     * расположены по возрастанию слева направо, сверху
     * вниз.
     * <p>
     * Например:
     *  1  2  3  4  5
     *  6  7  8  9 10
     * 11 12 13 14 15
     * 16 17 18 19 20
     */
    private Sort<int[][]> sort;

    /**
     * Объект, отвечающий за вывод в консоль двумерного
     * массива.
     * <p>
     * Массив, должен выводиться построчно.
     */
    private ObjectWriter<int[][]> writer;

    public TwoDimensionalArrays() {
        // TODO(Студент): Выполнить инициализацию полей класса TwoDimensionalArrays
        factory = new IntIntArrayFactory();
        sort = new IntIntArraySort();
        writer = new IntIntArrayWriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        int[][] array = factory.create();
        sort.run(array);
        writer.write(array);
    }
}

class IntIntArrayFactory implements Factory<int[][]>{

    @Override
    public int[][] create() {
        Random rnd = new Random();
        int[][] arr = new int[10 + rnd.nextInt(10)][10 + rnd.nextInt(10)];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(100);
            }           
        }
        return arr;
    }
    
}

class IntIntArraySort implements Sort<int[][]>{

    @Override
    public void run(int[][] dataSet) {
        int[] arr = new int[dataSet.length * dataSet[0].length];
        for (int i = 0; i < dataSet.length; i++) {
            for (int j = 0; j < dataSet[i].length; j++) {
                arr[i * dataSet[0].length + j] = dataSet[i][j];
            }           
        }
        
        Arrays.sort(arr);
        
        for (int i = 0; i < dataSet.length; i++) {
            for (int j = 0; j < dataSet[i].length; j++) {
                dataSet[i][j] = arr[i * dataSet[0].length + j];
            }           
        }
        
    }
    
}

class IntIntArrayWriter implements ObjectWriter<int[][]>{

    @Override
    public void write(int[][] arr) throws IOException {
        for(int[] arri : arr){
            System.out.println(Arrays.toString(arri));
        }
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
