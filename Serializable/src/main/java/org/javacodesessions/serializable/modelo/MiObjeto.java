/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.serializable.modelo;

import java.io.Serializable;

/**
 *
 * @author Luis Valenzuela
 */
// Crear una clase con atributos que implemente la interface Serializable
public class MiObjeto implements Serializable {

    private int id;
    private String nombre;
    private transient String password;
    private static final long serialVersionUID = 1L;

    public MiObjeto(int id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
    }

    @Override
    public String toString() {
        return "MiObjeto{"
                + "id=" + id
                + ", nombre='" + nombre + "\\"
                + ", password='" + password + "\\"
                + "}";
    }
}
