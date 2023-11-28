/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos4.modelo2;

import org.javacodesessions.programacionorientadaobjetos4.modelo1.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Valenzuela
 */
public class SantosLaguna {

    private List<Jugador> jugadores = new ArrayList<>();

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void jugarPartido() {
        for (Jugador jugador : jugadores) {
            jugador.jugar();
        }
    }
}
