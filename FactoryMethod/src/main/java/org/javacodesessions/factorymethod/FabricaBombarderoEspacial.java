/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.factorymethod;

/**
 *
 * @author Luis Valenzuela
 */
public class FabricaBombarderoEspacial extends FabricaNaveEspacial {
    @Override
    public NaveEspacial crearNave() {
        return new BombarderoEspacial();
    }
}
