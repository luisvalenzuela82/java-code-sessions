/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos4.modelo1;

/**
 *
 * @author Luis Valenzuela
 */
public abstract class Jugador {

    protected String nombre;
    protected String posicion;

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    // Método abstracto
    public abstract void jugar();

    // Método concreto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Posición: " + posicion);
    }
    
    
}
