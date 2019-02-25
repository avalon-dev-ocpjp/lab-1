package ru.avalon.java.ocpjp.labs.tasks.objects;

public class CitizenImpl implements Citizen {
    private Country country;
    private String name;
    private String lastName;

    public CitizenImpl(Country country, String name, String lastName) {
        this.country = country;
        this.name = name;
        this.lastName = lastName;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Country getCountry() {
        return country;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLastName() {
        return lastName;
    }
}
