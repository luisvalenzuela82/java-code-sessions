/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.excepciones;

import org.javacodesessions.excepciones.utils.*;

/**
 *
 * @author Luis Valenzuela
 */
public class D_CustomExceptionsExample {

    /*
    En general no recomeindo usar Exepciones Personalizadas
    para manejar reglas de negocio
     */
    public static void main(String[] args) {
        try {
            verificarEdad(17);
        } catch (MyException e) {
            System.out.println("Se capturó la excepción: " + e.getMessage());
        }
    }

    // Método que lanza la Excepción Personalizada
    static void verificarEdad(int edad)  throws MyException{
        if (edad < 18) {
            throw new MyException("Acceso denegado - Debes ser mayor de 18 años.");
        } else {
            System.out.println("Acceso permitido");
        }
    }

}
