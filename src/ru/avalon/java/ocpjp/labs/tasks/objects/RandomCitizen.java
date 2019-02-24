/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Кирилл
 */
public class RandomCitizen implements Citizen {

    private Country country;
    private String name;
    private String lastName;
    private StringBuilder sb;
    private Random rnd;
    private String[] str;
    private String tmp[];
    private int index;

    public RandomCitizen() {
        sb = null;
        tmp = null;
        str = randomString(new File("C:\\Users\\Кирилл\\Desktop\\Repsit\\lab-1\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\countries.txt")).split(":");
        this.country = new CitizenCountry(str[0], str[1]);
        this.name = randomString(new File("C:\\Users\\Кирилл\\Desktop\\Repsit\\lab-1\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\first-names.txt"));
        this.lastName = randomString(new File("C:\\Users\\Кирилл\\Desktop\\Repsit\\lab-1\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\last-names.txt"));
    }

    private String randomString(File file) {
        rnd = null;
        rnd = new Random();
        sb = new StringBuilder();
        int c;
        try (FileReader fr = new FileReader(file)) {

            while ((c = fr.read()) != -1) {
                sb = sb.append((char) c);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(CitizenFactory.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getLocalizedMessage();
        } catch (IOException ex) {
            Logger.getLogger(CitizenFactory.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getLocalizedMessage();
        }

        tmp = sb.toString().split("\n");

        index = rnd.nextInt(tmp.length);

        return tmp[index];
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
