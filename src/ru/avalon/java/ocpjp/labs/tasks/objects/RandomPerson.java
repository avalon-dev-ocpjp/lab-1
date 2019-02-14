/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.List;
import java.util.Random;

/**
 *
 * @author Sonya
 */
public class RandomPerson implements Person {

    private static final List<String> FIRST_NAMES;
    private static final List<String> LAST_NAMES;
    private static final String FIRST_NAMES_PATH = "C:\\Java\\Avalon\\Projects\\lab-1\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\first-names.txt";
    private static final String LAST_NAMES_PATH = "C:\\Java\\Avalon\\Projects\\lab-1\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\last-names.txt";
    private String name;
    private String lastName;

    static {
        Data data = new FilesReader();
        FIRST_NAMES = (List<String>) data.getData(FIRST_NAMES_PATH);
        LAST_NAMES = (List<String>) data.getData(LAST_NAMES_PATH);
    }

    public RandomPerson() {
        Random random = new Random();
        int nameId = random.nextInt(FIRST_NAMES.size());
        int lastNameId = random.nextInt(LAST_NAMES.size());
        name = FIRST_NAMES.get(nameId);
        lastName = LAST_NAMES.get(lastNameId);
        
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
