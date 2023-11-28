/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos4.modelo2;

import org.javacodesessions.programacionorientadaobjetos4.modelo1.*;

/**
 *
 * @author Luis Valenzuela
 */
public class Defensa implements Jugador {

    private String nombre;

    public Defensa(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void jugar() {
        System.out.println("El defensa " + nombre + " protege su propia portería.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Defensa: " + nombre);
    }
}
