/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.facade.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class CineEnCasaFacade {

    private Pantalla pantalla;
    private SistemaSonido sistemaDeSonido;
    private ReproductorVideo reproductorDeVideo;

    public CineEnCasaFacade() {
        pantalla = new Pantalla();
        sistemaDeSonido = new SistemaSonido();
        reproductorDeVideo = new ReproductorVideo();
    }

    public void verPelicula(String pelicula) {
        System.out.println("Preparándose para ver una película...");
        pantalla.encender();
        pantalla.modoPelicula();
        sistemaDeSonido.encender();
        sistemaDeSonido.setVolumen(5);
        sistemaDeSonido.modoEnvolvente();
        reproductorDeVideo.encender();
        reproductorDeVideo.play(pelicula);
    }

}
