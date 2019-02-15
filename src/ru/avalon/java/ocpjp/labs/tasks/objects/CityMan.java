/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author Sonya
 */
public class CityMan extends RandomPerson implements Citizen {

    private Country country;

    public CityMan() {
        country = new RandomCountry();
    }

    @Override
    public Country getCountry() {
        return country;
    }
}
