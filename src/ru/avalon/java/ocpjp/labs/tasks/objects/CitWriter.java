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
 * @author Павлик
 */
public class CitWriter implements ObjectWriter<Citizen> {
    
    private PrintStream stream = System.out;

    @Override
    public void write(Citizen object) throws IOException {
        String string = formString(object);
        stream.println(string);
    }

    @Override
    public void close() throws IOException {
        stream = null;
    }
    
    private String formString(Citizen object) {        
        return "Citizen: " + object.getName() + " " + object.getLastName() +  
               "\nCountry: " + object.getCountry().getName() +
               " (" + object.getCountry().getCode() +  ")\n";
    }
    
}
