/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos4.modelo1;

/**
 *
 * @author Luis Valenzuela
 */
public class Defensa extends Jugador {

    public Defensa(String nombre) {
        super(nombre, "Defensa");
    }

    @Override
    public void jugar() {
        System.out.println("El defensa " + nombre + " protege su propia portería.");
    }
}
