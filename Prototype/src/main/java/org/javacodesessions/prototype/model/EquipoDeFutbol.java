/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.prototype.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Valenzuela
 */
public class EquipoDeFutbol implements Prototype<EquipoDeFutbol> {

    private String nombreEquipo;
    private List<Jugador> jugadores;
    private Entrenador entrenador;
    private Estadio estadio;

    public EquipoDeFutbol(String nombreEquipo, List<Jugador> jugadores, Entrenador entrenador, Estadio estadio) {
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
        this.entrenador = entrenador;
        this.estadio = estadio;
    }

    @Override
    public EquipoDeFutbol clonar() {
        List<Jugador> jugadoresClonados = new ArrayList<>();
        for (Jugador jugador : this.jugadores) {
            jugadoresClonados.add(jugador.clonar());
        }
        return new EquipoDeFutbol(this.nombreEquipo, jugadoresClonados, this.entrenador.clonar(), this.estadio.clonar());
    }

    @Override
    public String toString() {
        return "EquipoDeFutbol{"
                + "nombreEquipo='" + nombreEquipo + '\''
                + ", jugadores=" + jugadores
                + ", entrenador=" + entrenador
                + ", estadio=" + estadio
                + '}';
    }
}
