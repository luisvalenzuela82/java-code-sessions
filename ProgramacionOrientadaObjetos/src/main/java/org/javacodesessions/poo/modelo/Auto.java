/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.poo.modelo;

import java.util.Objects;

/**
 *
 * @author Luis Valenzuela
 */
public class Auto {

    // Atributos
    /*
    Los modificadores de acceso en Java determinan cómo otros elementos 
    del código pueden acceder a clases, métodos y variables:
    
    public: Accesible desde cualquier parte del programa.
    protected: Accesible dentro de la misma clase, paquete, y subclases.
    private: Accesible solo dentro de la clase donde se declara.
    Sin modificador (default): Accesible solo dentro del mismo paquete.
     */
 /*
    Atributos "static" son valores compartidos por todas las instancias de una clase.
     */
    public static final double FACTOR_CONVERSION_MI_A_KM = 1.60934;

    private String color;
    private String marca;
    private String modelo;
    private double millasRecorridas;

    //Constructor
    /*
    Un constructor en Java es un método especial usado para crear e 
    inicializar un objeto de una clase. 
    Tiene el mismo nombre que la clase y se ejecuta automáticamente 
    al crear una nueva instancia del objeto, permitiendo establecer 
    valores iniciales para sus atributos.
     */
    public Auto() {

    }

    // Sobrecarga de Constructor
    /*
    La sobrecarga de métodos en Java ocurre cuando una clase tiene varios 
    métodos con el mismo nombre pero con diferentes listas de parámetros. 
    Estos parámetros pueden variar en número, tipo o ambos.
    Si tienes varios constructores, considera el uso del patrón de 
    diseño Builder para una mejor legibilidad y mantenimiento.
     */
    public Auto(double millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }

    public Auto(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    
    // Método para convertir millas recorridas a kilómetros
    public double getKilometrosRecorridos() {
        return millasRecorridas * FACTOR_CONVERSION_MI_A_KM;
    }

    // Método para arrancar el auto
    //Un método son acciones que un objeto o clase puede realizazr
    public void arrancar() {
        System.out.println("El auto ha arrancado.");
    }

    // Método para detener el auto
    public void detener() {
        System.out.println("El auto se ha detenido.");
    }

    //Getters y Setters
    /*
    Los getters y setters son métodos en una clase de Java que te 
    permiten leer (get) y modificar (set) los valores de las 
    variables de la clase de manera controlada.
    
    Encapsulamiento: Técnica que consiste en ocultar los detalles internos 
    del funcionamiento de una clase y exponer solo lo necesario al mundo 
    exterior.
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMillasRecorridas() {
        return millasRecorridas;
    }

    public void setMillasRecorridas(double millasRecorridas) {
        this.millasRecorridas = millasRecorridas;
    }

    //equals, hashCode, toString
    /*
    equals:     Compara dos objetos para determinar si son iguales en contenido.
    
    hashCode:   Genera un número entero único para representar el objeto, 
                importante para el uso en colecciones como HashMap.

    toString:   Devuelve una representación en cadena de texto del objeto, 
                usualmente mostrando información relevante sobre sus atributos.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.color);
        hash = 71 * hash + Objects.hashCode(this.marca);
        hash = 71 * hash + Objects.hashCode(this.modelo);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.millasRecorridas) ^ (Double.doubleToLongBits(this.millasRecorridas) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if (Double.doubleToLongBits(this.millasRecorridas) != Double.doubleToLongBits(other.millasRecorridas)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.modelo, other.modelo);
    }

    @Override
    public String toString() {
        return "Auto{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", millasRecorridas=" + millasRecorridas + '}';
    }

}
