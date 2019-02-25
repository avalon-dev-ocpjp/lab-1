package ru.avalon.java.ocpjp.labs.tasks.objects;

import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Задание, направленное на изучение следующих тем:
 * 1. наследование;
 * 2. полиморфизм;
 * 3. использование коллекции ArrayList
 */
public final class Inheritance implements Exercise {
    /**
     * Объект, выполняющий сравнение объектов типа
     * {@link Citizen}.
     */
    private Comparator<Citizen> comparator;

    /**
     * Источник случайного набора экземпляров класса
     * {@link Citizen}.
     * <p>
     * Объектов в источнике должно быть случайное количечство
     * в диапазоне от {@code 20} до {@code 30}.
     * <p>
     * Формировать экземпляры следует с использованием данных
     * словарей, расположенных в пакете
     * {@link ru.avalon.java.ocpjp.labs.resources}.
     */
    private Iterable<Citizen> source;

    /**
     * Объект, отвечающий за вывод экземпляров класса {@link Citizen}
     * в консоль
     */
    private ObjectWriter<Citizen> writer;

    /**
     * Коллекция для хранения экземпляров класса {@link Citizen},
     * доступных в объекте source
     */
    private List<Citizen> citizens;

    public Inheritance() {
        comparator = (c1, c2) -> c1.getLastName().compareToIgnoreCase(c2.getLastName());
        source = new RandomCitizens();
        writer = new CitizenWriter();
        citizens = new ArrayList<>();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Iterator<Citizen> iterator = source.iterator();

        while(iterator.hasNext()) {
            Citizen citizen = iterator.next();
            if(citizen != null)
                citizens.add(citizen);
        }

        citizens.sort(comparator);

        if(citizens.isEmpty()) {
            System.out.println("Unfortunately list of citizens contains no element.");
            return;
        }

        for(Citizen citizen : citizens) {
            try {
                writer.write(citizen);
            } catch (IOException e) {
                e.printStackTrace(System.err);
            }
        }
    }
}
