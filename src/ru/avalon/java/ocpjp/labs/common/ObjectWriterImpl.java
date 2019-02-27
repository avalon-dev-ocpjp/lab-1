package ru.avalon.java.ocpjp.labs.common;

import ru.avalon.java.ocpjp.labs.tasks.objects.Citizen;
import ru.avalon.java.ocpjp.labs.tasks.objects.Country;

import java.io.IOException;

public class ObjectWriterImpl implements ObjectWriter {
    @Override
    public void write(Object object) throws IOException {
        if(object instanceof Citizen) {
            Citizen citizen = (Citizen) object;
            Country country = citizen.getCountry();
            System.out.println(citizen.getLastName() + "\t" + citizen.getName()
                                        + "\t" + country.getCode() + "\t" + country.getName());
        }
    }

    @Override
    public void close() throws IOException {

    }
}
