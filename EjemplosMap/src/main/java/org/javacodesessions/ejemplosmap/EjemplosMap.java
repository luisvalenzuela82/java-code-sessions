/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.ejemplosmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Luis Valenzuela
 */
public class EjemplosMap {

    public static void main(String[] args) {
        // Declaración de los mapas
        Map<Integer, String> hashMap = new HashMap<>(); //No garantiza un orden específico
        Map<Integer, String> treeMap = new TreeMap<>(); //orden natural
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();// orden de inserción

        // Añadir elementos a los mapas
        hashMap.put(1, "Carlos Acevedo");
        hashMap.put(5, "Felix Torres");
        hashMap.put(21, "Matheus Doria");
        hashMap.put(10, "Juan Bruneta");

        treeMap.put(1, "Carlos Acevedo");
        treeMap.put(5, "Felix Torres");
        treeMap.put(21, "Matheus Doria");
        treeMap.put(10, "Juan Bruneta");

        linkedHashMap.put(1, "Carlos Acevedo");
        linkedHashMap.put(5, "Felix Torres");
        linkedHashMap.put(21, "Matheus Doria");
        linkedHashMap.put(10, "Juan Bruneta");

        // Obtener y mostrar un elemento específico de cada mapa
        System.out.println("Elemento de HashMap: " + hashMap.get(5));
        System.out.println("Elemento de TreeMap: " + treeMap.get(5));
        System.out.println("Elemento de LinkedHashMap: " + linkedHashMap.get(5));

        // Imprimir el contenido de cada mapa
        System.out.println("\nContenido de HashMap:");
        imprimirMapa(hashMap);

        System.out.println("\nContenido de TreeMap:");
        imprimirMapa(treeMap);

        System.out.println("\nContenido de LinkedHashMap:");
        imprimirMapa(linkedHashMap);
    }

    // Método para imprimir los elementos de un mapa
    private static void imprimirMapa(Map<Integer, String> mapa) {
        for (Map.Entry<Integer, String> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}
