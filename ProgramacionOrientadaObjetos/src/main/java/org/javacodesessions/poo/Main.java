/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.poo;
import org.javacodesessions.poo.modelo.Auto;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
        // Creando un objeto de la clase Auto
        Auto miAuto = new Auto("Rojo", "Toyota", "Corolla");
        
        Auto miAuto2= new Auto();
        miAuto2.setColor("Negro");
        miAuto2.setMarca("Nissan");
        miAuto2.setModelo("Sentra 2018");
        
        
        System.out.println(miAuto.toString());
        System.out.println(miAuto2.toString());

        // Usando métodos del objeto
        miAuto.arrancar();
        miAuto.detener();
        
        Auto miAuto3 = new Auto(200);
        System.out.println(miAuto3.getKilometrosRecorridos());
        
        System.err.println(Auto.FACTOR_CONVERSION_MI_A_KM);
        
    }
}
