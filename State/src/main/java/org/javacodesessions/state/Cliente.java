/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.state;

/**
 *
 * @author Luis Valenzuela
 */
public class Cliente {

    // Método principal para demostración
    public static void main(String[] args) {
        ReproductorMusica reproductor = new ReproductorMusica(new Detenido());

        reproductor.presionarBotonPlay(); // Comienza a reproducir
        reproductor.presionarBotonPlay(); // Pausa
        reproductor.presionarBotonStop(); // Detiene
        reproductor.presionarBotonPlay(); // Reproduce nuevamente
    }
}
