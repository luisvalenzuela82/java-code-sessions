/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio3.bad;

/**
 *
 * @author Luis Valenzuela
 */
public class Pinguino extends Ave {

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Los pingüinos no vuelan");
    }

}
