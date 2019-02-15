/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Comparator;

/**
 *
 * @author Sonya
 */
public class CountryComparator implements Comparator<Citizen>{

    @Override
    public int compare(Citizen a, Citizen b) {
       Country countryA= a.getCountry();
       Country countryB= b.getCountry();
       
       return countryA.getCode().compareTo(countryB.getCode());
        
    }
    
}
