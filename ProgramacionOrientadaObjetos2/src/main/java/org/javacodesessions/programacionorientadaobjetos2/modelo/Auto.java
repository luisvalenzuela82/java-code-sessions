/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos2.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class Auto extends Vehiculo {

    private String tipoCombustible;

    public Auto(String marca, String modelo, String tipoCombustible) {
        super(marca, modelo); // Llamada al constructor de la superclase
        this.tipoCombustible = tipoCombustible;
    }

    /*
    @Override es una anotación que indica que un método está 
    sobrescribiendo un método de su clase superclase. 
    Se usa para asegurar que estás extendiendo o modificando un método 
    existente en la clase padre. 
    Si el método no coincide con un método en la superclase, 
    el compilador generará un error. 
    Esto ayuda a evitar errores comunes en la sobrescritura de métodos y 
    mejora la claridad del código.
     */
    
    @Override
    public void arrancar() {
        System.out.println("El auto ha arrancado con " + tipoCombustible + " como combustible.");
    }

    // Getters y setters adicionales para atributos específicos de Auto
    // ...
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

}
