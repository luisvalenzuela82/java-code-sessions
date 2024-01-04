/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.strategy.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class StrategyExample {

    public static void main(String[] args) {
        GPSNavigator navigator = new GPSNavigator(new FastestRoute());

        System.out.println("Usando la ruta más rápida:");
        navigator.buildRoute("Punto A", "Punto B");

        // Cambiar a la ruta más corta
        navigator.setRouteStrategy(new ShortestRoute());
        System.out.println("Cambiando a la ruta más corta:");
        navigator.buildRoute("Punto A", "Punto B");

        // Cambiar a la ruta más económica
        navigator.setRouteStrategy(new EconomicRoute());
        System.out.println("Cambiando a la ruta más económica:");
        navigator.buildRoute("Punto A", "Punto B");
    }
}
