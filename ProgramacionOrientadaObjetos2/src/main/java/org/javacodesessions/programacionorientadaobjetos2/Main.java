/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos2;

import org.javacodesessions.programacionorientadaobjetos2.modelo.Auto;
import org.javacodesessions.programacionorientadaobjetos2.modelo.Motocicleta;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
        Auto miAuto = new Auto("Toyota", "Corolla", "Gasolina");
        miAuto.arrancar(); // Muestra: El auto ha arrancado con Gasolina como combustible.
        miAuto.detener();  // Muestra: El vehículo se ha detenido.

        Motocicleta miMotocicleta = new Motocicleta("Yamaha", "YZF", "Super Deportiva");
        miMotocicleta.arrancar(); // Muestra: La motocicleta ha arrancado. ¿Tiene alforjas? true
        miMotocicleta.detener();  // Muestra: El vehículo se ha detenido.
    }
}
