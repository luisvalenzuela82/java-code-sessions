/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.decorator.model.decoradores;

import org.javacodesessions.decorator.model.Texto;

/**
 *
 * @author Luis Valenzuela
 */
public abstract class DecoradorDeTexto implements Texto {

    protected Texto textoInterno;

    public DecoradorDeTexto(Texto textoInterno) {
        this.textoInterno = textoInterno;
    }
}
