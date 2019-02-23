/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import ru.avalon.java.ocpjp.labs.common.Factory;

/**
 *
 * @author Павлик
 */
public class RandomCitFactory implements Factory<Citizen> {
    
    private final Random RANDOM = new Random();
    
    private static final String namePath = "C://Users//Павлик//Documents//NetBeansProjects"
                + "//Repository//lab-1//Lab1//build//classes//"
                + "ru//avalon//java//ocpjp//labs//resources//first-names.txt";
    private static final String lastNamePath = "C://Users//Павлик//Documents//NetBeansProjects"
                + "//Repository//lab-1//Lab1//build//classes//"
                + "ru//avalon//java//ocpjp//labs//resources//last-names.txt";
    private static final String countryPath = "C://Users//Павлик//Documents//NetBeansProjects"
                + "//Repository//lab-1//Lab1//build//classes//"
                + "ru//avalon//java//ocpjp//labs//resources//countries.txt";
    
    private static final List<String> names;
    private static final List<String> lastNames;
    private static final List<Country> countries;    
    
    static {
        names = new ArrayList<>();
        lastNames = new ArrayList<>();
        countries = new ArrayList<>();
        fillNameOrLastName(names, namePath);
        fillNameOrLastName(lastNames, lastNamePath);
        fillCountry(countryPath);
    }
    
    private static void fillNameOrLastName(List<String> list, String path) {
        try (RandomAccessFile file = new RandomAccessFile(path, "r")) {
            while(file.readLine() != null) {
                list.add(file.readLine()); 
            }
        } catch (FileNotFoundException e) {
            System.out.println("file Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
    
    private static void fillCountry(String path) {
        List<String> tmp = new ArrayList<>();
        Map<String, String> map = new HashMap();
        try (Scanner scanner = new Scanner(new File(path))) {
            scanner.useDelimiter(":|\n");
            while(scanner.hasNext()) {
                tmp.add(scanner.next());
            }
            for (int i = 0; i < tmp.size() - 1; i+=2) {
                map.put(tmp.get(i), tmp.get(i + 1));
            }            
            map.entrySet().forEach((e) -> {
                countries.add(new Motherland(e.getKey(), e.getValue()));
            });
            tmp = null; map = null;
        } catch (FileNotFoundException e) {
            System.out.println("file Error: " + e.getMessage());
        }
    }    
    
    @Override
    public Citizen create() {
        return new Human(
                    names.get(RANDOM.nextInt(names.size())), 
                    lastNames.get(RANDOM.nextInt(lastNames.size())), 
                    countries.get(RANDOM.nextInt(countries.size()))
        );
    }
    
}
