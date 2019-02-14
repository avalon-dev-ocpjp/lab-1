/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Comparator;

/**
 *
 * @author Fox
 */
public class ComparatorImpl implements Comparator<Citizen> {
       
    @Override
    public int compare(Citizen o1, Citizen o2) {
        int result = o1.getName().compareTo(o2.getName());
        if (result == 0) {
            result = o1.getLastName().compareTo(o2.getLastName());
        }
        return result;
    }
    
}
