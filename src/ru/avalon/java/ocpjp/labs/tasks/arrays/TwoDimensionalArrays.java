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
     * Выполняет сортировку двумерного массива таким
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
        factory = TwoDimensionalArrays::createArray;
        sort = TwoDimensionalArrays::sort;
        writer = new TwoDimensionalArraysWriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        int[][] array = factory.create();
        sort.run(array);
        writer.write(array);
        writer.close();
    }

    /**
     * Создает двумерный массив, , содержащий случайные числа
     * в диапазоне от 0 до 100. Количество строк и столбцов
     * колеблется в диапазоне от 10 до 20.
     *
     * @return двумерный массив элементов типа int
     */
    private static int[][] createArray() {
        Random r = new Random();
        int width = r.nextInt(11) + 10;
        int height = r.nextInt(11) + 10;
        int[][] array = new int[height][];

        for(int i = 0; i < height; i++)
            array[i] = r.ints(width, 0, 100).toArray();

        return array;
    }

    /**
     * Выполняет сортировку
     *
     * @param array двумерный массив элементов типа int,
     *              который следует отсортировать
     */
    private static void sort(int[][] array) {
        int[] newArray = new int[array.length * array[0].length];
        int newArrayIndex = 0;

        for(int i = 0; i < array.length; i++) {
            System.arraycopy(array[i], 0, newArray, newArrayIndex, array[i].length);
            newArrayIndex += array[i].length;
        }

        Arrays.sort(newArray);
        newArrayIndex = 0;

        for(int i = 0; i < array.length; i++) {
            System.arraycopy(newArray, newArrayIndex, array[i], 0, array[i].length);
            newArrayIndex += array[i].length;
        }
    }
}
