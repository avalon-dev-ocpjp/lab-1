package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.util.Comparator;

/**
 *
 * @author Ella
 */
public class CitizenComparator implements Comparator<Citizen>{

    @Override
    public int compare(Citizen ctz, Citizen ctz1) {
        int flag = ctz.getName().compareTo(ctz1.getName());
        if(flag == 1) return flag;
        if(flag == 0) {
           flag = ctz.getLastName().compareTo(ctz1.getLastName());
           if(flag == 1) return flag;
           if(flag == 0) {
           flag = ctz.getCountry().getName().compareTo(ctz1.getCountry().getName());
        }
        }
        return flag;
    }
    
}
