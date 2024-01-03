/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.observer.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class Fanatico implements Observer {

    private String nombre;

    public Fanatico(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String message) {
        System.out.println(nombre + " recibió la actualización: " + message);
    }
}
