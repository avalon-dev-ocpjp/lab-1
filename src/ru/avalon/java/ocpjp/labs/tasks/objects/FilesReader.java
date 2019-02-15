/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sonya
 */
public class FilesReader implements Data<List<String>> {

    @Override
    public List<String> getData(String path) {
        File file = new File(path);
        List<String> list = new ArrayList();
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (!line.isEmpty()) {
                    list.add(line);
                }
            }
        } catch (FileNotFoundException ex) {
            System.err.println("FilesReader:getData(): " + ex.getMessage());
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("File is Empty!");
        }
        return list;
    }
}
