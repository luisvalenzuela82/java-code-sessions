/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos2.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class Motocicleta extends Vehiculo {

    /*
    En Java, un enum (enumeración) es un tipo especial que define 
    un grupo fijo de constantes. 
     */
    public static enum TipoMotocicleta {
        CICLOMOTOR, SCOOTER, TRICICLO, CUATRICICLO, MOTO_NAKED, MOTO_TRAIL, DEPORTIVA, TURISMO
    }

    private TipoMotocicleta tipo;

    public Motocicleta(String marca, String modelo, TipoMotocicleta tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta ha arrancado. Tipo: " + tipo);
    }

    // Getters y setters adicionales para atributos específicos de Motocicleta
    // ...
    public TipoMotocicleta getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotocicleta tipo) {
        this.tipo = tipo;
    }

}
