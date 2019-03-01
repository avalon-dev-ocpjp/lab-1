package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.Exercise;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

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
     * Объект, отвечающий за вывод экземпляров {@link Citizen}
     * в консоль.
     */
    private ObjectWriter<Citizen> writer;

    public Inheritance() {
        // TODO(Студент): Выполнить инициализацию полей класса Inheritance
//        throw new UnsupportedOperationException("Not implemented!");
        comparator = new Comparator<Citizen>(){
            @Override
            public int compare(Citizen o1, Citizen o2) {
                if (o1.getLastName().equals(o2.getLastName()))
                    if (o1.getName().equals(o2.getName()))
                        return o1.getCountry().getName().compareTo(o2.getCountry().getName());
                    else
                        return o1.getName().compareTo(o2.getName());
                else
                    return o1.getLastName().compareTo(o2.getLastName());
            }
            
        };
        
        writer = new ObjectWriter<Citizen>(){
            @Override
            public void write(Citizen object) throws IOException {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                System.out.println(new StringBuilder().append(object.getLastName()).append(" ")
                                                      .append(object.getName()).append(" ")
                                                      .append(object.getCountry().getName()));
            }

            @Override
            public void close() throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }


            
        };
        
        source = new Iterable<Citizen>(){
            @Override
            public Iterator<Citizen> iterator() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        List<Citizen> citizens = new ArrayList<>();

        // TODO(Студент): Добавить все элементы, доступные в объекте source, в коллекцию citizens

        // TODO(Студент): Отсортировать список citizens перед выводом в поток

        // TODO(Студент): Пользуясь объектом writer вывести список citizens в консоль
    }
}
