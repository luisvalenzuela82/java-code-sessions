/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.proxy;

import org.javacodesessions.proxy.modelo.BaseDeDatos;
import org.javacodesessions.proxy.modelo.ProxyBaseDeDatos;

/**
 *
 * @author Luis Valenzuela
 */
public class Cliente {

    public static void main(String[] args) {
        BaseDeDatos baseDeDatos = new ProxyBaseDeDatos();

        // Realiza una consulta que se registra y se almacena en caché
        System.out.println(baseDeDatos.consultar("SELECT * FROM usuarios"));

        // Realiza la misma consulta, esta vez recuperada del caché
        System.out.println(baseDeDatos.consultar("SELECT * FROM usuarios"));
    }
}
