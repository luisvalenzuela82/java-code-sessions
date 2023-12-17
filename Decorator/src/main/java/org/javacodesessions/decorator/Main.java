/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.decorator;

import org.javacodesessions.decorator.model.Texto;
import org.javacodesessions.decorator.model.TextoPlano;
import org.javacodesessions.decorator.model.decoradores.Cursiva;
import org.javacodesessions.decorator.model.decoradores.Negrita;
import org.javacodesessions.decorator.model.decoradores.Subrayado;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
        Texto miTexto = new TextoPlano("Hola, Mundo!");
        miTexto = new Negrita(miTexto);
        miTexto = new Cursiva(miTexto);
        miTexto = new Subrayado(miTexto);

        System.out.println(miTexto.obtenerContenido());
    }
}
