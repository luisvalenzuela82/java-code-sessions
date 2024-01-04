/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.command.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class Television {

    public void encender() {
        System.out.println("La televición esta encendida");
    }

    public void cambiarCanal(int canal) {
        System.out.println("Cambiando canal a " + canal);
    }

    public void programarApagar(int minutos) {
        System.out.println("La televisión se apagará en " + minutos + " minutes");
        // Aquí se implementaría la lógica para apagar la TV después del tiempo establecido
    }
}
