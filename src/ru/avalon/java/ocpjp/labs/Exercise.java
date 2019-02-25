package ru.avalon.java.ocpjp.labs;

import ru.avalon.java.ocpjp.labs.tasks.arrays.OneDimensionalArrays;
import ru.avalon.java.ocpjp.labs.tasks.arrays.TwoDimensionalArrays;
import ru.avalon.java.ocpjp.labs.tasks.objects.Inheritance;

/**
 * Абстратное представление об упражнении.
 */
public interface Exercise {
    /**
     * Тело упражнения.
     * <p>
     * Содержит основной код упражнения.
     *
     * @throws Exception в случае возникновения исключительной
     * ситуации
     */
    void run() throws Exception;

    /**
     * Фабричный метод, порождающий задания на основании
     * переданых аргументов командной строки.
     * <p>
     * Пользователь должен передавать название задания,
     * с использованием аргумента {@code /exercise},
     * {@code -exercise}, {@code /e} или {@code -e}.
     * <p>
     * Например:
     * {@code java -jar lab1.jar -e comparison}
     * где: <b>{@code syntax}</b> - название задания, которое
     * следует запустить.
     *
     * @param args аргументы командной строки
     * @return экземпляр класса, реализующего задание
     */
    static Exercise create(String[] args) {
        try {
            if(args[0].equals("/exercise") || args[0].equals("-exercise") || args[0].equals("/e") || args[0].equals("-e")) {
                String exercise = args[1];
                switch(exercise) {
                    case "OneDimensionalArrays":
                        return new OneDimensionalArrays();
                    case "TwoDimensionalArrays":
                        return new TwoDimensionalArrays();
                    case "Inheritance":
                        return new Inheritance();
                    default:
                        return null;
                }
            } else
                return null;
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
}
