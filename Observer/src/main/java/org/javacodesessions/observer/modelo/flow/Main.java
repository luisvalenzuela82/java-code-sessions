/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.observer.modelo.flow;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        PartidoFutbol publisher = new PartidoFutbol();

        Fanatico subscriber1 = new Fanatico("Fanático de Santos Laguna");
        Fanatico subscriber2 = new Fanatico("Fanático de Tigres UANL");

        
        
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        // Simulamos eventos del partido
        publisher.publicarEvento("Inicia el partido: Santos Laguna vs Tigres UANL");
        publisher.publicarEvento("Gol de Santos Laguna!");
        publisher.publicarEvento("Medio tiempo: Santos Laguna 1 - 0 Tigres UANL");
        publisher.publicarEvento("Gol de Santos Laguna!");
        publisher.publicarEvento("Final del partido: Santos Laguna 2 - 0 Tigres UANL. ¡Santos Laguna es campeón!");

        publisher.close(); // Cierra el Publisher
    }
}
