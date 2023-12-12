/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.prototype.model;

/**
 *
 * @author Luis Valenzuela
 */
public class Jugador implements Prototype<Jugador> {

    private String nombre;
    private String posicion;

    public Jugador(String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    @Override
    public Jugador clonar() {
        return new Jugador(this.nombre, this.posicion);
    }

    @Override
    public String toString() {
        return "Jugador{"
                + "nombre='" + nombre + '\''
                + ", posicion='" + posicion + '\''
                + '}';
    }
}
