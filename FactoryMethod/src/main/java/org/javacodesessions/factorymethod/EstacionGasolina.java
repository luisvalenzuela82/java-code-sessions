/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.factorymethod;

/**
 *
 * @author Luis Valenzuela
 */
public class EstacionGasolina {

    public static void cargarCombustible(Auto auto, double cantidad) {
        auto.cargarCombustible(cantidad);
        System.out.println("Cargado " + cantidad + " litros de combustible. Nivel actual: " + auto.getNivelCombustible());
    }
}
