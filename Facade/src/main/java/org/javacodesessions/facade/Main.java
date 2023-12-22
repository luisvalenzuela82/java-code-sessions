/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.facade;

import org.javacodesessions.facade.modelo.CineEnCasaFacade;
import org.javacodesessions.facade.modelo.Pantalla;
import org.javacodesessions.facade.modelo.ReproductorVideo;
import org.javacodesessions.facade.modelo.SistemaSonido;

/**
 *
 * @author Luis Valenzuela
 */
public class Main {

    public static void main(String[] args) {
        

        CineEnCasaFacade cineEnCasa = new CineEnCasaFacade();
        cineEnCasa.verPelicula("Volver al Futuro");
    }
}
