/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.strategy.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class FastestRoute implements RouteStrategy {
    @Override
    public void buildRoute(String pointA, String pointB) {
        System.out.println("Construyendo la ruta más rápida entre " + pointA + " y " + pointB);
    }
}
