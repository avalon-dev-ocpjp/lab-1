package ru.avalon.java.ocpjp.labs.tasks.objects;

public class CitizenImpl implements Citizen {

    private String name;
    private String lastName;
    private Country country;

    public CitizenImpl(String name, String lastName, Country country) {
        this.name = name;
        this.lastName = lastName;
        this.country = country;
    }

    public CitizenImpl(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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
