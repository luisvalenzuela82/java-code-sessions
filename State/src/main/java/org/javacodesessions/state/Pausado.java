/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.state;

/**
 *
 * @author Luis Valenzuela
 */
// Estado Pausado
public class Pausado implements EstadoReproductor {

    @Override
    public void presionarBotonPlay(ReproductorMusica reproductor) {
        System.out.println("Reproduciendo la música.");
        reproductor.setEstado(new Reproduciendo());
    }

    @Override
    public void presionarBotonStop(ReproductorMusica reproductor) {
        System.out.println("Deteniendo la música.");
        reproductor.setEstado(new Detenido());
    }
}
