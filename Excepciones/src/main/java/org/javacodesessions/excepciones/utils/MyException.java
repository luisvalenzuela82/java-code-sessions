/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.excepciones.utils;
 
/**
 *
 * @author Luis Valenzuela
 */
// Definiendo una Excepción Personalizada
public class MyException extends Exception {

    public MyException(String mensaje) {
        super(mensaje);
    }
}
