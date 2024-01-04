/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.command.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class ComandoProgramarApagar implements Comando {

    private Television television;
    private int minutos;

    public ComandoProgramarApagar(Television television, int minutos) {
        this.television = television;
        this.minutos = minutos;
    }

    @Override
    public void ejecutar() {
        television.programarApagar(minutos);
    }
}
