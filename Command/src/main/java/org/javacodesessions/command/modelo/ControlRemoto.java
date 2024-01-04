/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.command.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class ControlRemoto {

    private Comando comando;

    public void setCommand(Comando comando) {
        this.comando = comando;
    }

    public void pressButton() {
        comando.ejecutar();
    }
}
