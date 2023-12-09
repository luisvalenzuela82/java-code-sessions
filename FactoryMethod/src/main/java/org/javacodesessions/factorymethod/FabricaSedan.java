/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.factorymethod;

/**
 *
 * @author Luis Valenzuela
 */
public class FabricaSedan extends FabricaAuto {

    @Override
    public Auto crearAuto() {
        return new Sedan();
    }
}
