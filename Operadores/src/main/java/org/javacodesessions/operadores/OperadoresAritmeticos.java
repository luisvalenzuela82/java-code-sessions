/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.operadores;

/**
 *
 * @author Luis Valenzuela
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {
        // Definiendo dos números para las operaciones
        int numero1 = 15;
        int numero2 = 4;

        // Suma
        int suma = numero1 + numero2;
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);

        // Resta
        int resta = numero1 - numero2;
        System.out.println("Resta: " + numero1 + " - " + numero2 + " = " + resta);

        // Multiplicación
        int multiplicacion = numero1 * numero2;
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);

        // División
        int division = numero1 / numero2;
        System.out.println("División: " + numero1 + " / " + numero2 + " = " + division);

        // Módulo (resto de la división)
        int modulo = numero1 % numero2;
        System.out.println("Módulo: " + numero1 + " % " + numero2 + " = " + modulo);
    }
}
