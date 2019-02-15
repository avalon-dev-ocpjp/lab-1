package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Задание, направленное на изучение следующих тем: 1. наследование; 2.
 * полиморфизм; 3. использование коллекции ArrayList
 */
public final class Inheritance implements Exercise {

    /**
     * Объект, выполняющий сравнение объектов типа {@link Citizen}.
     */
    private Comparator<Citizen> comparator;

    /**
     * Источник случайного набора экземпляров класса {@link Citizen}.
     * <p>
     * Объектов в источнике должно быть случайное количечство в диапазоне от
     * {@code 20} до {@code 30}.
     * <p>
     * Формировать экземпляры следует с использованием данных словарей,
     * расположенных в пакете {@link ru.avalon.java.ocpjp.labs.resources}.
     */
    private Iterable<Citizen> source;

    /**
     * Объект, отвечающий за вывод экземпляров {@link Citizen} в консоль.
     */
    private ObjectWriter<Citizen> writer;

    public Inheritance() {
        // TODO(Студент): Выполнить инициализацию полей класса Inheritance
        source = new CitizenSourse();
        comparator = new CountryComparator().thenComparing(new NameComparator());
        writer = new CitizenWriter();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        List<Citizen> citizens = new ArrayList<>();

        // TODO(Студент): Добавить все элементы, доступные в объекте source, в коллекцию citizens
        
        for(Citizen human:source){
            citizens.add(human);
        }        
        // TODO(Студент): Отсортировать список citizens перед выводом в поток
        citizens.sort(comparator);
       
        // TODO(Студент): Пользуясь объектом writer вывести список citizens в консоль
        for(int i=0; i<citizens.size();i++){
            writer.write(citizens.get(i));
        }
    }
}
