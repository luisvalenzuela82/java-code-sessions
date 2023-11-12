/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.bucles;

import java.util.ArrayList;

/**
 *
 * @author Luis Valenzuela
 */
public class Bucles1 {

    public static void main(String[] args) {
        //ejemplo1();
        ejemplo2();
    }

    public static void ejemplo1() {
        int number = 5; // Número para el cual queremos la tabla de multiplicar
        int limit = 10; // Hasta qué número queremos multiplicar

        // Imprimimos la tabla de multiplicar para el número dado
        for (int i = 1; i <= limit; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void ejemplo2() {
        //Un ArrayList en Java es una colección dinámica y redimensionable de 
        //elementos que permite almacenar y acceder a una lista ordenada de objetos
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");

        // Uso de for-each para imprimir cada fruta en la lista
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

}
