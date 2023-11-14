/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Luis Valenzuela
 */
public class Sets1 {

    public static void main(String[] args) {

        /*
        HashSet es el más común y se usa cuando no necesitas un orden específico 
        para los elementos y quieres operaciones rápidas.
         */
        Set<String> fruits = new HashSet<>();
        fruits.add("Manzana");
        fruits.add("Plátano");
        fruits.add("Naranja");
        System.out.println("HashSet: " + fruits);

        /*
        LinkedHashSet extiende HashSet pero también mantiene un doble enlace 
        con los elementos, lo que permite conservar el orden de inserción.
         */
        Set<String> fruits2 = new LinkedHashSet<>();
        fruits2.add("Manzana");
        fruits2.add("Plátano");
        fruits2.add("Naranja");
        System.out.println("LinkedHashSet: " + fruits2);

        /*
        TreeSet implementa NavigableSet y almacena sus elementos en un 
        árbol rojo-negro, lo que significa que están ordenados de 
        acuerdo a su valor natural o por un comparador.
        Un árbol rojo-negro es como un árbol binario 
        donde cada nodo puede ser rojo o negro. 
        
        Arbol rojo - negro
        Esta estructura sigue reglas estrictas sobre quién puede ser rojo o negro 
        y cómo deben estar conectados para asegurarse de que ninguna rama 
        del árbol sea mucho más larga que las otras, 
        lo que ayuda a encontrar rápidamente cualquier persona en este árbol genealógico digital.
         */
        Set<String> fruits3 = new TreeSet<>();
        fruits3.add("Manzana");
        fruits3.add("Plátano");
        fruits3.add("Naranja");

        System.out.println("TreeSet: " + fruits3);

    }

}
