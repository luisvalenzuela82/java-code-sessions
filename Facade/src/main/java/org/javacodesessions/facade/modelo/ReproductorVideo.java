/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.facade.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class ReproductorVideo {

    public ReproductorVideo() {
    }

    public void encender() {
        System.out.println("Reproductor de video encendido.");
    }

    public void play(String pelicula) {
        System.out.println("Reproduciendo video: " + pelicula);
    }
}
