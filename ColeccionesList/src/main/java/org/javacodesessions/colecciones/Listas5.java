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
public class Listas5 {

    public static void main(String[] args) {
        /*
        Un IndexOutOfBoundsException en Java generalmente ocurre cuando 
        intentas acceder a un elemento de una lista usando un índice que está fuera 
        de su rango válido. 
        */
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        // Intentar acceder a un elemento que está fuera del rango de la lista
        // La lista tiene elementos en los índices 0, 1 y 2, por lo que el índice 3 generará un error
        String fruta = frutas.get(3);

        System.out.println("Fruta: " + fruta);
    }
}
