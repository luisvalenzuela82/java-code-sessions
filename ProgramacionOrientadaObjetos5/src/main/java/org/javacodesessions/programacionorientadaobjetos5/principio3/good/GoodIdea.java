/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio3.good;

/**
 *
 * @author Luis Valenzuela
 */
public class GoodIdea {

    public static void main(String[] args) {
        AveVoladora gorrion = new Gorrion();
        gorrion.volar(); // Funciona correctamente

        AveNoVoladora pinguino = new Pinguino();
        // pinguino.volar(); // Este código ni siquiera compilaría, ya que Pinguino no tiene el método volar
    }
}
