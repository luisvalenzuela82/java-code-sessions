/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.Objects;

/**
 *
 * @author Luis Valenzuela
 */
class Persona implements Comparable<Persona> {

    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        // Primero comparar por edad
        int edadComparacion = Integer.compare(this.edad, otra.edad);
        if (edadComparacion != 0) {
            return edadComparacion;
        }

        // Si la edad es la misma, comparar por nombre
        return this.nombre.compareTo(otra.nombre);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Persona persona = (Persona) obj;
        // Comparando por nombre y edad
        return edad.equals(persona.edad) && nombre.equals(persona.nombre);
    }

    @Override
    public String toString() {
        return "Persona{"
                + "nombre='" + nombre + '\''
                + ", edad=" + edad
                + '}';
    }
}
