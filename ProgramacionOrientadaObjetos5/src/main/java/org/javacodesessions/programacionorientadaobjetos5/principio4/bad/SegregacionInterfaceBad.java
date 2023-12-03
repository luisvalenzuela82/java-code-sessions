/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio4.bad;

/**
 *
 * @author Luis Valenzuela
 */
public class SegregacionInterfaceBad {

    public static void main(String[] args) {
        JugadorSantosLaguna brunetta = new JugadorSantosLaguna("10", "Juan Brunetta", "Delantero");
        brunetta.jugarPartido();
        brunetta.entrenarJugadores();
        brunetta.coordinarLogistica();
    }

}
