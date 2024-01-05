/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.state;

/**
 *
 * @author Luis Valenzuela
 */
// Interfaz para los estados del reproductor
public interface EstadoReproductor {

    void presionarBotonPlay(ReproductorMusica reproductor);

    void presionarBotonStop(ReproductorMusica reproductor);
}
