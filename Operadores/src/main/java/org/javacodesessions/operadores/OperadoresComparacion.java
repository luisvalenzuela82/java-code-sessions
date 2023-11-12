/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.operadores;

/**
 *
 * @author Luis Valenzuela
 */
public class OperadoresComparacion {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Igual a
        System.out.println("a == b: " + (a == b));  // false

        // No igual a
        System.out.println("a != b: " + (a != b));  // true

        // Mayor que
        System.out.println("a > b: " + (a > b));    // false

        // Menor que
        System.out.println("a < b: " + (a < b));    // true

        // Mayor o igual que
        System.out.println("a >= b: " + (a >= b));  // false

        // Menor o igual que
        System.out.println("a <= b: " + (a <= b));  // true
    }
}
