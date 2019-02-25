package ru.avalon.java.ocpjp.labs.tasks.objects;


public class CountryImpl implements Country {
    private String code;
    private String name;

    public CountryImpl(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getCode() {
        return code;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }
}
