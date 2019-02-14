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

/**
 *
 * @author Sonya
 */
public class CitizenSourse implements Iterable<Citizen> {
    private List<Citizen> citizens;
//    private int index;
    
    public CitizenSourse() {
        Random random = new Random();
        citizens = new ArrayList();
        int count = random.nextInt((10)+10);
        for(int i=0;i<count;i++){
            citizens.add(new CityMan());
        }        
    }

//    @Override
//    public boolean hasNext() {
//        return index < citizens.size();        
//    }
//
//    @Override
//    public Citizen next() {
//        return citizens.get(index++);
//    }

    @Override
    public Iterator<Citizen> iterator() {
        return citizens.iterator();       
    }

}
