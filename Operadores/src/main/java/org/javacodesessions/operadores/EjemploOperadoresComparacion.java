/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.operadores;

import java.util.Scanner;

/**
 *
 * @author Luis Valenzuela
 */
public class EjemploOperadoresComparacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criterios para montar en la montaña rusa
        int edadMinima = 12;
        double alturaMinima = 1.4; // en metros

        // Solicitando datos al usuario
        System.out.print("Ingrese su edad: ");
        int edadUsuario = scanner.nextInt();

        System.out.print("Ingrese su altura (en metros): ");
        double alturaUsuario = scanner.nextDouble();

        // Verificaciones con operadores de comparación
        if (edadUsuario >= edadMinima && alturaUsuario >= alturaMinima) {
            System.out.println("¡Puedes subir a la montaña rusa!");
        } else {
            System.out.println("Lo siento, no cumples con los requisitos para subir a la montaña rusa.");
            if (edadUsuario < edadMinima) {
                System.out.println("Debes tener al menos " + edadMinima + " años.");
            }
            if (alturaUsuario < alturaMinima) {
                System.out.println("Debes medir al menos " + alturaMinima + " metros de altura.");
            }
        }

        scanner.close();
    }
}
