/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

/**
 *
 * @author Luis Valenzuela
 */
public class Listas2 {

    public static void main(String[] args) {

        // Crear una lista de String
        List<String> frutas = new ArrayList<>();

        // Agregar elementos a la lista
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Kiwi");

        // Imprimir todos los elementos de la lista
        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // Eliminar un elemento de la lista
        frutas.remove("Naranja");

        // Imprimir la lista después de eliminar un elemento
        System.out.println("\nLista de frutas después de eliminar la naranja:");
        frutas.forEach(System.out::println);

        // Acceder a un elemento específico
        System.out.println("\nLa segunda fruta de la lista es: " + frutas.get(1));

        // Reemplazar un elemento
        frutas.set(1, "Fresa");
        System.out.println("\nLista de frutas después de reemplazar la banana por fresa:");
        frutas.forEach(System.out::println);

        // Repetir un elemento
        frutas.add("Fresa");
        System.out.println("\nLista de frutas después de agregar Fresa nuevamente:");
        frutas.forEach(System.out::println);

        //Agregar mas elementos
        frutas.addAll(Arrays.asList("Mango", "Uva", "Piña", "Melón", "Cereza", "Pera", "Papaya", "Durazno", "Frambuesa"));

        //Ordenar una lista en orden natural
        //La clase Comparator en Java es una interfaz utilizada para definir un orden 
        //específico para colecciones de objetos
        
        //Los objetos de la lista deben implementar la interfaz Comparable
        //String: alfabeticamente
        //Integer: orden de los números
        frutas.sort(Comparator.naturalOrder());
        System.out.println("\nLista de frutas ordenadas alfabeticamente:");
        frutas.forEach(System.out::println);

        frutas.sort(Comparator.reverseOrder());
        System.out.println("\nLista de frutas ordenadas de forma descendente:");
        frutas.forEach(System.out::println);
    }
}
