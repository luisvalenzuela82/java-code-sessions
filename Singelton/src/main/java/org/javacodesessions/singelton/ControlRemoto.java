/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.singelton;

/**
 *
 * @author Luis Valenzuela
 */
public class ControlRemoto {

    // La única instancia del ControlRemoto
    private static ControlRemoto instancia = null;

    // Estado interno del ControlRemoto, como el canal actual y el volumen
    private int canalActual;
    private int volumenActual;

    // Constructor privado
    private ControlRemoto() {
        canalActual = 1; // Canal inicial por defecto
        volumenActual = 20; // Volumen inicial por defecto
    }

    // Método público estático para obtener la instancia
    public static synchronized ControlRemoto getInstancia() {
        if (instancia == null) {
            instancia = new ControlRemoto();
        }
        return instancia;
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