/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio4.bad;

import javax.naming.OperationNotSupportedException;

/**
 *
 * @author Luis Valenzuela
 */
public class JugadorSantosLaguna implements MiembroEquipoFutbol {

    private String numero;
    private String nombre;
    private String posicion;

    public JugadorSantosLaguna(String numero, String nombre, String posicion) {
        this.numero = numero;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    @Override
    public void jugarPartido() {
        System.out.println("El jugador " + nombre + " esta jugando el partido como " + posicion + " con el numero " + numero);
    }

    @Override
    public void entrenarJugadores() {
        throw new UnsupportedOperationException("Un jugador no entrena jugadores");
    }

    @Override
    public void coordinarLogistica() {
        throw new UnsupportedOperationException("Un jugador no coordina logistica del equipo");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}
