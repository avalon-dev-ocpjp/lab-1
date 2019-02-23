/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Павлик
 */
public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("C://Users//Павлик//Documents//NetBeansProjects"
                + "//Repository//lab-1//Lab1//build//classes//"
                + "ru//avalon//java//ocpjp//labs//resources//countries.txt");
        String str = getInfo(file);
        System.out.println(str);
        
    }
    
    public static String getInfo(File file) throws FileNotFoundException, IOException{
        final RandomAccessFile f = new RandomAccessFile(file, "r");
        final long randomLocation = (long) (Math.random() * f.length());
        f.seek(randomLocation);
        f.readLine();
        return f.readLine();
    }
}


