package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Ella
 */
public class SourceIterator implements Iterator<Citizen> {
    private CitizenFactory citizenFactory;
    private int counter = 0;
    
    public SourceIterator(CitizenFactory citizenFactory) {
        this.citizenFactory = citizenFactory;
    }
    @Override
    public boolean hasNext() {
        if(counter > citizenFactory.getCountCitizen()) return false;
        return true;
    }

    @Override
    public Citizen next() {
        if(counter > citizenFactory.getCountCitizen())
        throw new NoSuchElementException("No more citizens");
        counter++;
        return citizenFactory.createCitizen();
    }
    
}
