/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Luis Valenzuela
 */
public class Listas7 {

    public static void main(String[] args) {
        final int SIZE = 10000000; // Tamaño de las colecciones
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> hashSet = new HashSet<>();

        // Llenar ambas colecciones con datos iniciales
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            hashSet.add(i);
        }

        // Elemento a buscar
        int elementoABuscar = SIZE - 1; // Un elemento hacia el final

        // Medir el tiempo de búsqueda en ArrayList
        long startTime = System.nanoTime();
        boolean encontradoEnArrayList = arrayList.contains(elementoABuscar);
        long endTime = System.nanoTime();
        System.out.println("Búsqueda en ArrayList: " + (endTime - startTime) / 1_000_000_000.0 + " s, encontrado: " + encontradoEnArrayList);

        // Medir el tiempo de búsqueda en HashSet
        startTime = System.nanoTime();
        boolean encontradoEnHashSet = hashSet.contains(elementoABuscar);
        endTime = System.nanoTime();
        System.out.println("Búsqueda en HashSet: " + (endTime - startTime) / 1_000_000_000.0 + " s, encontrado: " + encontradoEnHashSet);
    }
}
