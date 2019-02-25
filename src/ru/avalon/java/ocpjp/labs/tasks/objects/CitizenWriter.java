package ru.avalon.java.ocpjp.labs.tasks.objects;

import ru.avalon.java.ocpjp.labs.common.ObjectWriter;

import java.io.IOException;

public class CitizenWriter implements ObjectWriter<Citizen> {
    /**
     * {@inheritDoc}
     */
    @Override
    public void write(Citizen citizen) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(citizen.getLastName()).append(" ").append(citizen.getName()).append(" (");
        sb.append(citizen.getCountry().getCode()).append(" - ").append(citizen.getCountry().getName()).append(")");
        System.out.println(sb.toString());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void close() throws IOException {}
}
