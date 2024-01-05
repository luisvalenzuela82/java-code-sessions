/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.state;

/**
 *
 * @author Luis Valenzuela
 */
// Estado Reproduciendo
public class Reproduciendo implements EstadoReproductor {
    @Override
    public void presionarBotonPlay(ReproductorMusica reproductor) {
        System.out.println("Pausando la música.");
        reproductor.setEstado(new Pausado());
    }

    @Override
    public void presionarBotonStop(ReproductorMusica reproductor) {
        System.out.println("Deteniendo la música.");
        reproductor.setEstado(new Detenido());
    }
}
