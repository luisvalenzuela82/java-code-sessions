/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.factorymethod;

/**
 *
 * @author Luis Valenzuela
 */
public abstract class Auto {

    private double nivelCombustible;

    public Auto() {
        this.nivelCombustible = 0;
    }

    public void cargarCombustible(double cantidad) {
        nivelCombustible += cantidad;
    }

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public abstract void encender();
}
