/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.intancias;

/**
 *
 * @author Luis Valenzuela
 */
public class ControlRemoto {

    // Estado interno del ControlRemoto, como el canal actual y el volumen
    private int canalActual;
    private int volumenActual;

    // Constructor privado
    public ControlRemoto() {
        canalActual = 1; // Canal inicial por defecto
        volumenActual = 20; // Volumen inicial por defecto
    }

    // Métodos para controlar la televisión
    public void cambiarCanal(int nuevoCanal) {
        canalActual = nuevoCanal;
        System.out.println("Canal cambiado a: " + canalActual);
    }

    public void ajustarVolumen(int nuevoVolumen) {
        volumenActual = nuevoVolumen;
        System.out.println("Volumen ajustado a: " + volumenActual);
    }

    // Métodos para obtener el estado actual
    public int getCanalActual() {
        return canalActual;
    }

    public int getVolumenActual() {
        return volumenActual;
    }
}
