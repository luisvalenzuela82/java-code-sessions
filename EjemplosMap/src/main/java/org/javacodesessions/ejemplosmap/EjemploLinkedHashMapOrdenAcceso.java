/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.ejemplosmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Luis Valenzuela
 */
public class EjemploLinkedHashMapOrdenAcceso {

    public static void main(String[] args) {
        // Crear un LinkedHashMap con orden por acceso
        Map<String, String> mapa = new LinkedHashMap<>(16, 0.75f, true);

        // Añadir elementos
        mapa.put("1", "Uno");
        mapa.put("2", "Dos");
        mapa.put("3", "Tres");

        // Imprimir el mapa antes de acceder a algunos elementos
        System.out.println("\nOrden de los elementos en el LinkedHashMap antes del acceso:");
        imprimirMapa(mapa);
        
        // Acceder a algunos elementos
        System.out.println("\nAcceso a: " + mapa.get("1"));
        System.out.println("Acceso a: " + mapa.get("3"));

        // Imprimir el mapa después de acceder a algunos elementos
        System.out.println("\nOrden de los elementos en el LinkedHashMap después del acceso:");
        imprimirMapa(mapa);
    }

    private static void imprimirMapa(Map<String, String> mapa) {
        for (Map.Entry<String, String> entrada : mapa.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}
