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
public class RandomCountry implements Country{

    private static List<String> countries;
    private static String countryPath = "C:\\Java\\Avalon\\Projects\\lab-1\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\countries.txt";
    private String name;
    private String code;
    static int ii=0;
    
    static {
        Data data= new FilesReader(); 
        countries = (List<String>) data.getData(countryPath);
    }
    
    public RandomCountry(){
        Random random = new Random();
        int index = random.nextInt(countries.size());
        String str = countries.get(index);        
        String[] arr = str.split(":");
        code = arr[0];
        name = arr[1];
    }
    
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }
    
}
