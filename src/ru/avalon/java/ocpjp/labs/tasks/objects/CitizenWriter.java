/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.IOException;
import java.io.PrintStream;
import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

/**
 *
 * @author Sonya
 */
public class CitizenWriter implements ObjectWriter<Citizen> {

    private PrintStream stream = System.out;
    private Country country;

    @Override
    public void write(Citizen citizen) throws IOException {
        country = citizen.getCountry();

        StringBuilder sb = new StringBuilder();
        sb.append(country.getCode()).append(": ")
                .append(country.getName()).append("--> ")
                .append(citizen.getName()).append(" ")
                .append(citizen.getLastName());
        stream.println(sb.toString());
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }
}
