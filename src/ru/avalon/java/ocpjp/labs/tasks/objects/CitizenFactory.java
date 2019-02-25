package ru.avalon.java.ocpjp.labs.tasks.objects;

import ru.avalon.java.ocpjp.labs.common.Factory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

/**
 * Фабрика, создающая объекты типа {@link Citizen}
 */
public class CitizenFactory implements Factory<Citizen> {
    private List<String> countries;
    private List<String> names;
    private List<String> lastNames;

    public CitizenFactory() {
        try {
            countries = Files.readAllLines(Paths.get("src/ru/avalon/java/ocpjp/labs/resources/countries.txt"));
            names = Files.readAllLines(Paths.get("src/ru/avalon/java/ocpjp/labs/resources/first-names.txt"));
            lastNames = Files.readAllLines(Paths.get("src/ru/avalon/java/ocpjp/labs/resources/last-names.txt"));
        } catch (IOException e) {
            e.printStackTrace(System.err);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Citizen create() {
        Random random = new Random();

        try {
            String name = names.get(random.nextInt(names.size()));
            String lastName = lastNames.get(random.nextInt(lastNames.size()));
            String countryStr = countries.get(random.nextInt(countries.size()));
            String countryCode = countryStr.split(":")[0];
            String countryName = countryStr.split(":")[1];
            Country country = new CountryImpl(countryCode, countryName);
            return new CitizenImpl(country, name, lastName);
        } catch(IndexOutOfBoundsException e) {
            e.printStackTrace(System.err);
            return null;
        }
    }
}
