/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.prototype.model;

/**
 *
 * @author Luis Valenzuela
 */
public class Entrenador implements Prototype<Entrenador> {

    private String nombre;

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Entrenador clonar() {
        return new Entrenador(this.nombre);
    }

    @Override
    public String toString() {
        return "Entrenador{"
                + "nombre='" + nombre + '\''
                + '}';
    }
}
