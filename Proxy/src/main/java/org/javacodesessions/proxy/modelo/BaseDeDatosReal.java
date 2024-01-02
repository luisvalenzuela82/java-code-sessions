/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.proxy.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class BaseDeDatosReal implements BaseDeDatos {

    @Override
    public String consultar(String consulta) {
        return "Resultado de la consulta '" + consulta + "'";
    }
}
