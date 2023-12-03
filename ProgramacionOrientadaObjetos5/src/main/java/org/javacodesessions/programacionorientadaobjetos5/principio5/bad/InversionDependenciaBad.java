/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio5.bad;

/**
 *
 * @author Luis Valenzuela
 */
public class InversionDependenciaBad {

    public static void main(String[] args) {
        ProcesadorPedidos procesadorPedidos = new ProcesadorPedidos();
        procesadorPedidos.procesarPedido("QWERTY-234");
    }
}
