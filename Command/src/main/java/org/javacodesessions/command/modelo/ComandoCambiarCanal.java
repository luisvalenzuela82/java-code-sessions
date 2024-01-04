/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.command.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class ComandoCambiarCanal implements Comando {

    private Television television;
    private int canal;

    public ComandoCambiarCanal(Television television, int canal) {
        this.television = television;
        this.canal = canal;
    }

    @Override
    public void ejecutar() {
        television.cambiarCanal(canal);
    }
}
