package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author java
 */
public class CitizenImpl implements Citizen {
    private String name;
    private String lastName;
    private Country country;
    
    CitizenImpl(String name, String lastName, Country country) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Country getCountry() {
        return country;
    }
    
}
