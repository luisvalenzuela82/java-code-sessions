/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.command.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class ComandoEncender implements Comando {
    private Television television;

    public ComandoEncender(Television television) {
        this.television = television;
    }

    @Override
    public void ejecutar() {
        television.encender();
    }
}
