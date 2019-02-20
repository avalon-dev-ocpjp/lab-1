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
 * @author Кирилл
 */
public class CitizenFactory implements Iterable<Citizen> {

    private Random rnd;
    private List<Citizen> array;
    private int index;
    
    public CitizenFactory() {
        rnd = new Random();
        array = new ArrayList(40);
        index = rnd.nextInt(10)+20;
        for (int i = 0; i < index; i++) {
            array.add(new RandomCitizen());
        }
        
        
    }

    @Override
    public Iterator<Citizen> iterator() {
       return array.iterator();
    }

}
