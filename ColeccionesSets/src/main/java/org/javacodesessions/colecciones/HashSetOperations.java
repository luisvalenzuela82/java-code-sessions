/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Luis Valenzuela
 */
public class HashSetOperations {

    public static void main(String[] args) {
        // Crear dos HashSets
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // Añadir elementos al primer HashSet
        set1.add("Elemento1");
        set1.add("Elemento2");
        set1.add("Elemento3");

        // Añadir elementos al segundo HashSet
        set2.add("Elemento3");
        set2.add("Elemento4");
        set2.add("Elemento5");

        // Recorrer y mostrar elementos del primer HashSet
        System.out.println("Elementos en set1:");
        for (String element : set1) {
            System.out.println(element);
        }

        // Unión de set1 y set2
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Unión de set1 y set2: " + union);

        // Diferencia entre set1 y set2 (elementos en set1 que no están en set2)
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Diferencia (elementos en set1 que no están en set2): " + difference);
    }
}
