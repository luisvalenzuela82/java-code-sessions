/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos4;

import org.javacodesessions.programacionorientadaobjetos4.modelo1.Defensa;
import org.javacodesessions.programacionorientadaobjetos4.modelo1.Delantero;
import org.javacodesessions.programacionorientadaobjetos4.modelo1.Jugador;
import org.javacodesessions.programacionorientadaobjetos4.modelo1.SantosLaguna;

/**
 *
 * @author Luis Valenzuela
 */
public class Main1 {

    public static void main(String[] args) {
        
        SantosLaguna santosLaguna = new SantosLaguna();

        Jugador delantero = new Delantero("Juan Brunetta");
        Jugador defensa = new Defensa("Matheus Dória");
        
        delantero.mostrarInformacion();
        defensa.mostrarInformacion();

        santosLaguna.agregarJugador(delantero);
        santosLaguna.agregarJugador(defensa);

        santosLaguna.jugarPartido();
    }
}
