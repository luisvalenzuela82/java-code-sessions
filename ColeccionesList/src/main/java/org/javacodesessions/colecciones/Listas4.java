/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Luis Valenzuela
 */
public class Listas4 {

    public static void main(String[] args) {
        
        /*
        Evitar 
        ConcurrentModificationException:
        Problema: Ocurre al modificar una lista mientras se está iterando sobre ella.
         */
        List<String> numeros = new ArrayList<>();

        // Agregar 100 elementos a la lista
        for (int i = 0; i < 100; i++) {
            numeros.add("Número " + i);
        }
        
        // Imprimir la lista antes de las eliminaciones
        System.out.println("Lista después de eliminar elementos que terminan en 5:");
        for (String numero : numeros) {
            System.out.println(numero);
        }

        // Crear un Iterator para la lista
        Iterator<String> iterator = numeros.iterator();

        // Iterar sobre la lista de forma segura
        while (iterator.hasNext()) {
            String numero = iterator.next();
            if (numero.endsWith("5")) { // Por ejemplo, eliminar elementos que terminen en 5
                iterator.remove(); // Eliminar el elemento de forma segura
            }
        }

        // Imprimir la lista después de las eliminaciones
        System.out.println("Lista después de eliminar elementos que terminan en 5:");
        for (String numero : numeros) {
            System.out.println(numero);
        }
    }
}
