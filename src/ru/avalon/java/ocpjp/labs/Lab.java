package ru.avalon.java.ocpjp.labs;

public class Lab {

    /**
     * Точка входа в приложение.
     * <p>
     * При входе в приложение, выполняется создание получение
     * экземпляра задания с использованием фабричного метода
     * {@code create} интерфейса {@link Exercise}.
     *
     * @param args аргументы командной строки
     */
    public static void main(String ... args) {
        Exercise exercise = Exercise.create(args);

        if(exercise == null) {
            System.out.println("Error! Invalid application arguments.");
            return;
        }

        try {
            exercise.run();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
