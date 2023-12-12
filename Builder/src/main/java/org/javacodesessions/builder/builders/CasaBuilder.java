/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.builder.builders;

import org.javacodesessions.builder.modelo.Alberca;
import org.javacodesessions.builder.modelo.Banio;
import org.javacodesessions.builder.modelo.Casa;
import org.javacodesessions.builder.modelo.Cocina;

/**
 *
 * @author Luis Valenzuela
 */
public interface CasaBuilder {

    CasaBuilder conNumHabitaciones(int numHabitaciones);

    CasaBuilder conCocina(Cocina cocina);

    CasaBuilder conBanio(Banio banio);

    CasaBuilder conAlberca(Alberca alberca);

    CasaBuilder conNumPisos(int numPisos);

    CasaBuilder conTieneGaraje(boolean tieneGaraje);

    CasaBuilder conTamanioJardin(int tamanioJardin);

    CasaBuilder conTipoDePintura(String tipoDePintura);

    CasaBuilder conTipoDeTecho(String tipoDeTecho);

    CasaBuilder conSistemaDeSeguridad(boolean sistemaDeSeguridad);

    Casa construir();
}
