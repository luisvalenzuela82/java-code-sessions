/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Luis Valenzuela
 */
public class LinkedHashSetExample {

    public static void main(String[] args) {
       
        /*
        Problema: implementación incorrecta de equals() y hashCode()
        
         */
        Set<Item> items = new LinkedHashSet<>();
        items.add(new Item("Item1", 1));
        items.add(new Item("Item2", 2));
        items.add(new Item("Item1", 3)); // Distinto id, mismo nombre

        System.out.println("Contenido del LinkedHashSet: " + items);

    }
}
