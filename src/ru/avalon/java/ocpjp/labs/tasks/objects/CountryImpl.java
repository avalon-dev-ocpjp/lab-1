package ru.avalon.java.ocpjp.labs.tasks.objects;

public class CountryImpl implements Country{

    private String code;
    private String country;

    public CountryImpl(String code, String country) {
        this.code = code;
        this.country = country;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return country;
    }
}
