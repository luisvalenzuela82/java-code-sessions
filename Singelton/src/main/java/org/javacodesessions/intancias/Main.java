/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.intancias;

import org.javacodesessions.singelton.*;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
        ControlRemoto control = new ControlRemoto();

        // Cambiando el canal y el volumen
        control.cambiarCanal(5);
        control.ajustarVolumen(30);

        // Verificando el estado del control remoto
        System.out.println("Canal actual: " + control.getCanalActual());
        System.out.println("Volumen actual: " + control.getVolumenActual());

        ControlRemoto control2 = new ControlRemoto();
        // Cambiando el canal y el volumen
        control.cambiarCanal(10);
        control.ajustarVolumen(50);

        // Verificando el estado del control remoto
        System.out.println("Canal actual: " + control.getCanalActual());
        System.out.println("Volumen actual: " + control.getVolumenActual());
    }
}
