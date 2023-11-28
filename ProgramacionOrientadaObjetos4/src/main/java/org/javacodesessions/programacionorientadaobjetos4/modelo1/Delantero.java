/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos4.modelo1;

/**
 *
 * @author Luis Valenzuela
 */
public class Delantero extends Jugador {

    public Delantero(String nombre) {
        super(nombre, "Delantero");
    }

    @Override
    public void jugar() {
        System.out.println("El delantero " + super.nombre + " ataca hacia la portería rival.");
    }
}
