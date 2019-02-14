/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.avalon.java.ocpjp.labs.tasks.objects;

/**
 *
 * @author Sonya
 */
public interface Data<T> {
    /**
     * Создаёт экземпляр заданного типа.
     *
     * @return Экземпляр типа {@code T}
     */
    T getData(String path);
}
