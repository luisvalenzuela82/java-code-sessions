/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio5.good;

/**
 *
 * @author Luis Valenzuela
 */
public class InversionDependenciaGood {
    
    public static void main(String[] args) {
        BaseDeDatos baseDeDatosMyDatos = new BaseDeDatosMySQL();
        ProcesadorPedidos procesadorPedidos = new ProcesadorPedidos(baseDeDatosMyDatos);
        procesadorPedidos.procesarPedido("QWERTY-234");
    }
}
