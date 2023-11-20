/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.excepciones;

import java.io.IOException;
import org.javacodesessions.excepciones.utils.MyStringUtils;

/**
 *
 * @author Luis Valenzuela
 */
public class C_ManejoExcepcionesExample {

    /*
    Uso de try-catch:
    Usa try-catch cuando quieras manejar la excepción de manera inmediata 
    en el lugar donde podría ocurrir.
    
    Uso de throws
    Usa throws en la firma del método cuando no quieras o no puedas manejar 
    la excepción en el método actual.
     */
    public static void main(String[] args) {
        String filePath = "D:\\test.txt";

        // Uso de 'try-catch' para manejar la excepción directamente
        try {
            String content = MyStringUtils.readFile(filePath);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
