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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(" ")
                .append(this.getLastName()).append(" ")
                .append(country.getName()).append(" ")
                .append(country.getCode());
        return sb.toString();
    }
}
