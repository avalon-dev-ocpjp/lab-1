/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.common;

import java.io.IOException;
import ru.avalon.java.ocpjp.labs.tasks.objects.Citizen;
import ru.avalon.java.ocpjp.labs.tasks.objects.Country;
import ru.avalon.java.ocpjp.labs.tasks.objects.CitizenFactory;

/**
 *
 * @author Кирилл
 */
public class CitizenWriter implements ObjectWriter<Citizen>{
    private Country tmp;

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void write(Citizen object) throws IOException {
        System.out.println(object.getName());
        System.out.println(object.getLastName());
        System.out.println(object.getCountry().getCode()+ " "+object.getCountry().getName());
        System.out.println("");
    }
    
}
