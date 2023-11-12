/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions;

/**
 *
 * @author Luis Valenzuela
 */
public class EnvoltoriosVsPrimitivos {

    public static void main(String[] args) {
        // Número de iteraciones para la prueba
        int iteraciones = 1_000_000_000;

        // Prueba con tipo primitivo int
        long inicioPrimitivo = System.nanoTime();
        int sumaPrimitivo = 0;
        for (int i = 0; i < iteraciones; i++) {
            sumaPrimitivo += i;
        }
        long finPrimitivo = System.nanoTime();

        // Prueba con clase envoltorio Integer
        long inicioEnvoltorio = System.nanoTime();
        Integer sumaEnvoltorio = 0;
        for (Integer i = 0; i < iteraciones; i++) {
            sumaEnvoltorio += i; // Aquí ocurre unboxing y luego boxing en cada iteración
        }
        long finEnvoltorio = System.nanoTime();

        // Calcular y mostrar los tiempos
        double tiempoPrimitivo = (finPrimitivo - inicioPrimitivo) / 1_000_000_000.0; // Convertido a segundos
        double tiempoEnvoltorio = (finEnvoltorio - inicioEnvoltorio) / 1_000_000_000.0; // Convertido a segundos

        System.out.println("Tiempo con tipo primitivo (int): " + tiempoPrimitivo + " segundos.");
        System.out.println("Tiempo con clase envoltorio (Integer): " + tiempoEnvoltorio + " segundos.");
    }
}
