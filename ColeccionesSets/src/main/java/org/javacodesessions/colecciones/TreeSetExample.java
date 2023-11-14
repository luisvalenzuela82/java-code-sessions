/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Luis Valenzuela
 */
public class TreeSetExample {

    public static void main(String[] args) {
      
        /**
         * Consistencia entre equals() y Comparator/Comparable
         * TreeSet usa compareTo() (o un Comparator si se proporciona) 
         * para ordenar sus elementos y determinar si son iguales. 
         * No usa equals().
         */

        TreeSet<Persona> personas = new TreeSet<>();
        personas.add(new Persona("Ana", 30));
        personas.add(new Persona("Carlos", 25));
        personas.add(new Persona("Paco", 30)); // Diferente nombre y misma edad

        System.out.println("Personas en el TreeSet: " + personas);
    }
}
