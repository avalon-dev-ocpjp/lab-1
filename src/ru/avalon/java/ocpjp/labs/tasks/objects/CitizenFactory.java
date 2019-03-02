package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ella
 */
public class CitizenFactory {
     private int countCitizen;
 private final int MAX_COUNT = 30;
 private final int MIN_COUNT = 20;
 private final String FILE_PATH = System.getProperty("user.dir") 
         + "\\src\\ru\\avalon\\java\\ocpjp\\labs\\resources\\";
 private final String FILE_FIRST_NAMES = FILE_PATH + "first-names.txt";
 private final String FILE_LAST_NAMES = FILE_PATH + "last-names.txt";
 private final String FILE_COUNTRIES = FILE_PATH + "countries.txt";
         
 private ArrayList<String> firstNames = new ArrayList<>();
 private ArrayList<String> lastNames = new ArrayList<>();
 private ArrayList<String> countries = new ArrayList<>();
 
 Random rnd = new Random();

 CitizenFactory() {
     countCitizen = rnd.nextInt(MAX_COUNT - MIN_COUNT) + MIN_COUNT;
     readDataFromFile(FILE_FIRST_NAMES, firstNames);
     readDataFromFile(FILE_LAST_NAMES, lastNames);
     readDataFromFile(FILE_COUNTRIES, countries);
 }
 
 public int getCountCitizen() {
     return countCitizen;
 }

 private void readDataFromFile(String filePath, ArrayList<String> list) {
     File file = new File(filePath);
     try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
         String line;
         while ((line = br.readLine()) != null) {
             list.add(line);
         }
         Collections.shuffle(list);
     } catch (FileNotFoundException ex) {
         Logger.getLogger(Source.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException io) {
         Logger.getLogger(Source.class.getName()).log(Level.SEVERE, null, io);
     }
 }
 
 Citizen createCitizen() {
     String rndFirstName = firstNames.get(rnd.nextInt(firstNames.size()));
     String rndLastName = lastNames.get(rnd.nextInt(lastNames.size()));
     String[] rndCountry = countries.get(rnd.nextInt(countries.size()-1)).split(":");
     Country country = new CurrentCountry(rndCountry[0], rndCountry[1]);
     return  new CitizenImpl(rndFirstName, rndLastName, country);
 }

}
