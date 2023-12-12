/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.prototype.model;

/**
 *
 * @author Luis Valenzuela
 */
public interface Prototype<T> {

    /*
    La <T> en la interfaz Prototype en Java es un "Generics". 
    T actúa como un parámetro de tipo. 
    Permiten que las clases, interfaces y métodos operen sobre tipos de objetos, 
    sin comprometer la comprobación de tipos en tiempo de compilación.
    */
    T clonar();
}
