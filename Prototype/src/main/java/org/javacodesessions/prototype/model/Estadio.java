/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.prototype.model;

/**
 *
 * @author Luis Valenzuela
 */
public class Estadio implements Prototype<Estadio> {
    private String nombre;
    private int capacidad;

    public Estadio(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public Estadio clonar() {
        return new Estadio(this.nombre, this.capacidad);
    }

    @Override
    public String toString() {
        return "Estadio{" +
                "nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
