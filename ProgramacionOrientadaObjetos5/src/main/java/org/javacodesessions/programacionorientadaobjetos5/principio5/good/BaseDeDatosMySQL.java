/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio5.good;

/**
 *
 * @author Luis Valenzuela
 */
public class BaseDeDatosMySQL implements BaseDeDatos {

    @Override
    public void guardarPedido(String pedido) {
        System.out.println("Guardando el pedido " + pedido + " en la Base de Datos MySQL");
    }
}
