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
public class Listas3 {

    public static void main(String[] args) {

        /*
        ConcurrentModificationException:
        Problema: Ocurre al modificar una lista mientras se está iterando sobre ella.
         */
        List<String> numeros = new ArrayList<>();

        // Agregar 100 elementos a la lista
        for (int i = 0; i < 100; i++) {
            numeros.add("Número " + i);
        }
        
        //Imprimir lista antes de modificarla
        System.out.println("Lista antes de intentar modificarla");
        numeros.forEach(System.out::println);

        // Intentar eliminar elementos mientras se itera sobre la lista
        for (String numero : numeros) {
            if (numero.endsWith("3")) { // Por ejemplo, eliminar elementos que terminen en 5
                numeros.remove(numero);
            }
        }
        
        //Imprimir lista antes de modificarla
        System.out.println("Lista DESPUES de intentar modificarla");
        numeros.forEach(System.out::println);
    }
}
