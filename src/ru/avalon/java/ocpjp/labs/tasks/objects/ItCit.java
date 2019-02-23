/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author Павлик
 */
public class ItCit implements Iterable<Citizen> {
    
    private final Random RANDOM = new Random();
    private List<Citizen> list;
    private Factory<Citizen> factory;
    
    public ItCit() {
        factory = new RandomCitFactory();
        list = new ArrayList<>();        
        for (int i = 0; i < (RANDOM.nextInt(10) + 20); i++) {
            list.add(factory.create());
        }
    } 

    @Override
    public Iterator<Citizen> iterator() {
        return list.iterator();
    }
    
}
