/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.estructurasselectivas;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author Luis Valenzuela
 */
public class EstructurasSelectivas3 {

    public static void main(String[] args) {
        int errorCode = 404; // Cambia este valor para probar diferentes mensajes

        /*Un HashMap en Java es una estructura de datos que almacena elementos en 
        pares de clave-valor.*/
        Map<Integer, String> errorMessages = new HashMap<>();
        errorMessages.put(200, "OK");
        errorMessages.put(404, "Not Found");
        errorMessages.put(500, "Internal Server Error");
        errorMessages.put(800, "New code error");

        String message = errorMessages.getOrDefault(errorCode, "Unknown Error");
        System.out.println("Error Code " + errorCode + ": " + message);
    }
}
