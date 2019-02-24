/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Comparator;

/**
 *
 * @author Кирилл
 */
public class CountryComparator implements Comparator<Citizen>{

    @Override
    public int compare(Citizen o1, Citizen o2) {
       Country countryA= o1.getCountry();
       Country countryB= o2.getCountry();
       
       return countryA.getCode().compareTo(countryB.getCode());
    }
    
}
