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
public class Delantero implements Jugador {

    private String nombre;

    public Delantero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void jugar() {
        System.out.println("El delantero " + nombre + " ataca hacia la portería rival.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Delantero: " + nombre);
    }
}
