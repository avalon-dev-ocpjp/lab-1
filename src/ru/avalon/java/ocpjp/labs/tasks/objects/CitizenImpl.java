/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author Fox
 */
public class CitizenImpl implements Citizen {

    private String name, lastName;
    private Country country;
       
    public CitizenImpl(String name, String lastName, Country country) {
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
