/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.bucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luis Valenzuela
 */
public class Bucles3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(5) + 1; // Número aleatorio entre 1 y 5
        int numeroUsuario;

        do {
            System.out.print("Adivina el número (entre 1 y 5): ");
            numeroUsuario = scanner.nextInt();
        } while (numeroUsuario != numeroAdivinar);

        System.out.println("¡Correcto! El número era: " + numeroAdivinar);
        scanner.close();
    }
}
