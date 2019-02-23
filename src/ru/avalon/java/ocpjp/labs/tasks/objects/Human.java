/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author Павлик
 */
public class Human implements Citizen {
    
    private Country country;
    private String name;
    private String lastName;
    
    Human(String name, String lastName, Country country){
        this.name = name;
        this.lastName = lastName;
        this.country = country;
    }
    
    
    @Override
    public Country getCountry() {
        return country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
    
}
