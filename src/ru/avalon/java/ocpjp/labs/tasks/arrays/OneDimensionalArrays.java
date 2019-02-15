package ru.avalon.java.ocpjp.labs.tasks.arrays;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.Factory;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * Задание, направленное на получение умений и навыков
 * объявления и использования одномерных массивов.
 */
public final class OneDimensionalArrays implements Exercise {
    /**
     * Фабрика, создающая одномерный массив случайной
     * длины, содержащие случайные числа в интервале
     * от {@code 0} до {@code 100}.
     *<p>
     * Длина массивов должна колебаться в диапазоне от
     * 10, до 20 элементов.
     */
    private Factory<int[]> factory;

    /**
     * Выполняет сортировку одномерного массива по
     * возрастанию.
     */
    private Sort<int[]> sort;

    /**
     * Объект, отвечающий за вывод одномерного массива в
     * консоль.
     * <p>
     * Массив следет выводить в одну строку, разделяя
     * элементы массива запятыми и пробелами. Массив должен
     * быть заключён в квадратные скобки.
     * <p>
     * Например: {@code [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]}
     */
    private ObjectWriter<int[]> writer;

    public OneDimensionalArrays() {
        // TODO(Студент): Выполнить инициализацию полей класса OneDimensionalArrays
        
        factory = new IntArrayFactory();
        sort = new IntArraySort();
        writer = new IntArrayWriter();

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        int[] array = factory.create();
        sort.run(array);
        writer.write(array);
    }
}

class IntArrayFactory implements Factory<int[]>{

    @Override
    public int[] create() {
        Random rnd = new Random();
        int[] arr = new int[10 + rnd.nextInt(10)];
        for (int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }
    
}

class IntArraySort implements Sort<int[]>{

    @Override
    public void run(int[] dataSet) {
        Arrays.sort(dataSet);
    }
    
}

class IntArrayWriter implements ObjectWriter<int[]>{

    @Override
    public void write(int[] arr) throws IOException {
        System.out.println(Arrays.toString(arr));
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
