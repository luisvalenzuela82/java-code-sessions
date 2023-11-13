/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Valenzuela
 */
public class Listas6 {

    public static void main(String[] args) {
        /*
        Evitar
        Un IndexOutOfBoundsException en Java generalmente ocurre cuando 
        intentas acceder a un elemento de una lista usando un índice que está fuera 
        de su rango válido. 
        */
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Índice seguro para acceder a la lista
        int indiceSeguro = 1; // Cambia este valor para probar diferentes índices

        // Verificar si el índice está dentro del rango de la lista
        if (indiceSeguro >= 0 && indiceSeguro < frutas.size()) {
            // Acceder al elemento de manera segura
            String fruta = frutas.get(indiceSeguro);
            System.out.println("Fruta en el índice " + indiceSeguro + ": " + fruta);
        } else {
            // Manejar el caso en que el índice esté fuera de rango
            System.out.println("Índice " + indiceSeguro + " está fuera del rango de la lista.");
        }
    }
}
