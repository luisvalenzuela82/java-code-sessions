/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.bucles;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Luis Valenzuela
 */
public class Bucles2 {

    public static void main(String[] args) {
        //ejemplo1();
        ejemplo2();
    }

    public static void ejemplo1() {
        //Factorial 5 = 1*2*3*4*5
        int number = 100; // Número para calcular el factorial
        BigInteger factorial = BigInteger.ONE;
        int i = 1;

        int control = 1;
        // Bucle while para calcular el factorial
        while (i <= number && control <= 1_000_000_000) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            i++; // Incrementa i en cada iteración
            control++;
        }

        System.out.println("El factorial de " + number + " es: " + factorial);
    }

    public static void ejemplo2() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("Ingresa un número (ingresa un número negativo para salir):");
            int number = scanner.nextInt();

            if (number < 0) {
                break; // Sale del bucle si el número es negativo
            }

            sum += number;
            System.out.println("Suma actual: " + sum);
        }

        System.out.println("Suma final: " + sum);
        scanner.close();

    }
}
