/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.observer.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
        PartidoFutbol partido = new PartidoFutbol();

        Fanatico fanaticoSantos = new Fanatico("Fanático de Santos Laguna");
        Fanatico fanaticoTigres = new Fanatico("Fanático de Tigres UANL");
        Fanatico otroAficionado = new Fanatico("Otro aficionado");
        Fanatico unObservadoMas = new Fanatico("Uno mas");

        
        partido.registerObserver(fanaticoSantos);
        partido.registerObserver(fanaticoTigres);
        partido.registerObserver(otroAficionado);
        partido.registerObserver(unObservadoMas);

        // Simulamos algunos eventos del partido
        partido.setEvento("Inicia el partido: Santos Laguna vs Tigres UANL");
        partido.setEvento("Gol de Santos Laguna!");
        partido.setEvento("Medio tiempo: Santos Laguna 1 - 0 Tigres UANL");
        partido.setEvento("Gol de Santos Laguna!");
        partido.setEvento("Final del partido: Santos Laguna 2 - 0 Tigres UANL. ¡Santos Laguna es campeón!");
    }
}
