/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.facade.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class SistemaSonido {

    public SistemaSonido() {
    }

    public void encender() {
        System.out.println("Sistema de sonido encendido.");
    }

    public void setVolumen(int nivel) {
        System.out.println("Volumen del sistema de sonido ajustado a " + nivel + ".");
    }

    public void modoEnvolvente() {
        System.out.println("Sistema de sonido en modo envolvente.");
    }
}
