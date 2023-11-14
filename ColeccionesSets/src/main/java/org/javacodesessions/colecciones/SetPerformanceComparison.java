/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Luis Valenzuela
 */
public class SetPerformanceComparison {

    public static void main(String[] args) {
        final int NUM_ELEMENTS = 10_000_000;
        List<Integer> numbers = new ArrayList<>(NUM_ELEMENTS);

        // Generar números aleatorios y agregarlos a la lista
        Random random = new Random();
        for (int i = 0; i < NUM_ELEMENTS; i++) {
            numbers.add(random.nextInt());
        }

        // HashSet
        Set<Integer> hashSet = new HashSet<>();
        long startTime = System.nanoTime();
        for (int number : numbers) {
            hashSet.add(number);
        }
        long endTime = System.nanoTime();
        System.out.println("Tiempo de inserción para HashSet: " + (endTime - startTime) / 1_000_000_000.0 + " segundos");

        startTime = System.nanoTime();
        for (int number : numbers) {
            hashSet.contains(number);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de búsqueda para HashSet: " + (endTime - startTime) / 1_000_000_000.0 + " segundos");

        // TreeSet
        Set<Integer> treeSet = new TreeSet<>();
        startTime = System.nanoTime();
        for (int number : numbers) {
            treeSet.add(number);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de inserción para TreeSet: " + (endTime - startTime) / 1_000_000_000.0 + " segundos");

        startTime = System.nanoTime();
        for (int number : numbers) {
            treeSet.contains(number);
        }
        endTime = System.nanoTime();
        System.out.println("Tiempo de búsqueda para TreeSet: " + (endTime - startTime)  / 1_000_000_000.0 + " segundos");
    }
}
