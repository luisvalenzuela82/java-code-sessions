/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.factorymethod;

/**
 *
 * @author Luis Valenzuela
 */
public class BatallaEspacial {

    public static void main(String[] args) {
        FabricaNaveEspacial fabricaCaza = new FabricaCazaEspacial();
        NaveEspacial caza = fabricaCaza.crearNave();
        caza.disparar();

        FabricaNaveEspacial fabricaBombardero = new FabricaBombarderoEspacial();
        NaveEspacial bombardero = fabricaBombardero.crearNave();
        bombardero.disparar();

        FabricaNaveEspacial fabricaReconocimiento = new FabricaNaveReconocimiento();
        NaveEspacial reconocimiento = fabricaReconocimiento.crearNave();
        reconocimiento.disparar();
    }
}
