/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.excepciones;

/**
 *
 * @author Luis Valenzuela
 */
public class B_UncheckedExceptionsExample {

    /*
    "Unchecked" significa "no verificado".
    * Estas excepciones no son verificadas en tiempo de compilación. 
    * El compilador no requiere que sean manejadas o declaradas.
    * Por lo general, representan errores de programación que deben 
      corregirse en el código y no son situaciones de las que se espera 
      que el programa se recupere.
     */
    public static void main(String[] args) {
        String texto = null;
        try {
            int longitud = texto.length();
        } catch (NullPointerException e) {
            System.out.println("Se ha intentado acceder a un objeto que es null.");
        }
    }
}
