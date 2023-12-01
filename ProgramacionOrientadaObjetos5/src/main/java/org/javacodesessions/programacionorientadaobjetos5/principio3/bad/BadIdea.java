/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio3.bad;

/**
 *
 * @author Luis Valenzuela
 */
public class BadIdea {

    public static void main(String[] args) {
        Ave ave = new Gorrion();
        ave.volar(); // Funciona correctamente

        Ave pinguino = new Pinguino();
        pinguino.volar(); // Lanza UnsupportedOperationException

    }

}
