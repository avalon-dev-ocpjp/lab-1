/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author MultatulyIM
 */
public class Countries implements Country{
    private String code;
    private String name;
Countries(String code, String name){
    this.code=code;
    this.name=name;
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
