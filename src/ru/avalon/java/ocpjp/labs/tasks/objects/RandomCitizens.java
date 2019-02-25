package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Iterator;
import java.util.Random;

/**
 * Источник случайного набора элементов типа {@link Citizen}
 */
public class RandomCitizens implements Iterable<Citizen> {
    /**
     * Случайное количество элементов типа {@link Citizen}
     * в диапазоне от 20 до 30
     */
    private int objectCnt;

    public RandomCitizens() {
        Random r = new Random();
        this.objectCnt = r.nextInt(11) + 20;
    }

    public int getObjectCnt() {
        return objectCnt;
    }

    public void decrementObjectCnt() {
        objectCnt--;
    }

    /**
     * Возвращает итератор для элементов типа {@link Citizen}
     *
     * @return итератор
     */
    @Override
    public Iterator<Citizen> iterator() {
        return new CitizenIterator(this);
    }
}
