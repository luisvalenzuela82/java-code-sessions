/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos3.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class AutoVolador implements Automovil, Avion {

    

    @Override
    public void volar() {
        System.out.println("Volando en el cielo.");
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo en la carretera");
    }
}
