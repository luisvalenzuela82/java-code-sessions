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
    Ciclomotor, Scooter, Triciclo,m Cuatriciclo, Moto Naked, Moto Trail, Deportiva, Turismo
    */
    private String tipo;

    public Motocicleta(String marca, String modelo, String tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta ha arrancado. Tipo: " + tipo);
    }

    // Getters y setters adicionales para atributos específicos de Motocicleta
    // ...
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
