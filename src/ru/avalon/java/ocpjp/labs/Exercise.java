package ru.avalon.java.ocpjp.labs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.avalon.java.ocpjp.labs.tasks.arrays.OneDimensionalArrays;
import ru.avalon.java.ocpjp.labs.tasks.arrays.TwoDimensionalArrays;

/**
 * Абстратное представление об упражнении.
 */
public interface Exercise {

    final class Patterns {

        public static Pattern EXERCISE;

        static {
            EXERCISE = Pattern.compile("^/e|-e|/exercise|-exercise$");
        }
    }

    /**
     * Тело упражнения.
     * <p>
     * Содержит основной код упражнения.
     *
     * @throws Exception в случае возникновения исключительной ситуации
     */
    void run() throws Exception;

    /**
     * Фабричный метод, порождающий задания на основании переданых аргументов
     * командной строки.
     * <p>
     * Пользователь должен передавать название задания, с использованием
     * аргумента {@code /exercise}, {@code -exercise}, {@code /e} или
     * {@code -e}.
     * <p>
     * Например: {@code java -jar lab1.jar -e comparison} где:
     * <b>{@code syntax}</b> - название задания, которое следует запустить.
     *
     * @param args аргументы командной строки
     * @return Экземпляр класса, реализующего задание
     */
    static Exercise create(String[] args) {
        // TODO(Студент): Реализовать метод create интерфейса Exercise
        for (int i = 0; i < args.length; i++) {
            Matcher matcher = Patterns.EXERCISE.matcher(args[i]);
            if (++i == args.length) {
                throw new IllegalArgumentException("Недопустимые аргументы");
            }
            if (matcher.matches()) {
                switch (args[i]) {
                    case "OneDimesionalArray":
                        return new OneDimensionalArrays();
                    case "TwoDimesionalArray":
                        return new TwoDimensionalArrays();
                }
            }
        }
        throw new IllegalArgumentException("Недопустимые аргументы");
    }
}
