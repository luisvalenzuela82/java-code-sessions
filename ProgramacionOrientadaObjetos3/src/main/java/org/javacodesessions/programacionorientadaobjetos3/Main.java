/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos3;

import org.javacodesessions.programacionorientadaobjetos3.modelo.AutoVolador;
import org.javacodesessions.programacionorientadaobjetos3.modelo.Automovil;
import org.javacodesessions.programacionorientadaobjetos3.modelo.Avion;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
        AutoVolador miAutoVolador = new AutoVolador();
        miAutoVolador.conducir();
        miAutoVolador.volar();

        // Uso como Automovil
        Automovil automovil = miAutoVolador;
        automovil.conducir();
        // Imprime: Conduciendo en la carretera.

        // Uso como Avion
        Avion avion = miAutoVolador;
        avion.volar(); // Imprime: Volando en el cielo.
    }
}
