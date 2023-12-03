/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio5.good;

/**
 *
 * @author Luis Valenzuela
 */
public class ProcesadorPedidos {

    private BaseDeDatos baseDeDatos;

    public ProcesadorPedidos(BaseDeDatos baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public void procesarPedido(String pedido) {
        System.out.println("Procesando el pedido: " + pedido);
        baseDeDatos.guardarPedido(pedido);
    }
}
