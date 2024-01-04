/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.command.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class Cliente {

    public static void main(String[] args) {
        Television tv = new Television();
        ControlRemoto controlRemoto = new ControlRemoto();

        // Turn on the TV
        Comando encender = new ComandoEncender(tv);
        controlRemoto.setCommand(encender);
        controlRemoto.pressButton();

        // Change channel
        Comando cambiarCanal = new ComandoCambiarCanal(tv, 5);
        controlRemoto.setCommand(cambiarCanal);
        controlRemoto.pressButton();

        // Schedule turn off in 30 minutes
        Comando programarApagar = new ComandoProgramarApagar(tv, 30);
        controlRemoto.setCommand(programarApagar);
        controlRemoto.pressButton();
    }
}
