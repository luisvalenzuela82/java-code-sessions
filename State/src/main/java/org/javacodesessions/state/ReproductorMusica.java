/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.state;

/**
 *
 * @author Luis Valenzuela
 */
// Clase ReproductorMusica
public class ReproductorMusica {

    private EstadoReproductor estadoActual;

    public ReproductorMusica(EstadoReproductor estadoInicial) {
        this.estadoActual = estadoInicial;
    }

    public void setEstado(EstadoReproductor nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public void presionarBotonPlay() {
        //Aqui nos evitamos toda la lógica de "ifs" 
        estadoActual.presionarBotonPlay(this);
    }

    public void presionarBotonStop() {
        estadoActual.presionarBotonStop(this);
    }
}
