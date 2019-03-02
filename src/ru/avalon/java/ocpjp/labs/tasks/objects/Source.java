package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Iterator;

/**
 *
 * @author Ella
 */
class Source implements Iterable<Citizen> {

    @Override
    public Iterator<Citizen> iterator() {
        return new SourceIterator(new CitizenFactory());
    }
}
