package ru.avalon.java.ocpjp.labs.tasks.objects;

import ru.avalon.java.ocpjp.labs.common.Factory;

import java.util.Iterator;

/**
 * Итератор для элементов типа {@link Citizen}
 */
public class CitizenIterator implements Iterator<Citizen> {
    private RandomCitizens randomCitizens;
    private Factory<Citizen> factory;

    public CitizenIterator(RandomCitizens randomCitizens) {
        this.randomCitizens = randomCitizens;
        factory = new CitizenFactory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasNext() {
        return randomCitizens.getObjectCnt() > 0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Citizen next() {
        randomCitizens.decrementObjectCnt();
        return factory.create();
    }
}
