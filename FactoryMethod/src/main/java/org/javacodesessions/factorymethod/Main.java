/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.factorymethod;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
        FabricaAuto fabricaSedan = new FabricaSedan();
        Auto miSedan = fabricaSedan.crearAuto();
        miSedan.encender();
        EstacionGasolina.cargarCombustible(miSedan, 50);

        FabricaAuto fabricaSUV = new FabricaSUV();
        Auto miSUV = fabricaSUV.crearAuto();
        miSUV.encender();
        EstacionGasolina.cargarCombustible(miSUV, 70);
        
        FabricaAuto fabricaPickups= new FabricaPickup();
        Auto miPickup = fabricaPickups.crearAuto();
        miPickup.encender();
        EstacionGasolina.cargarCombustible(miPickup, 30);
    }
}
