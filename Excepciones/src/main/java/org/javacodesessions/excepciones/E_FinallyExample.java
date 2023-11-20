/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Luis Valenzuela
 */
public class E_FinallyExample {

    /*
    El bloque finally en Java se utiliza para ejecutar código importante 
    que debe correrse siempre, independientemente de si una excepción 
    ha sido lanzada o no. (por ejemplo Liberar recursos)
     */
    public static void main(String[] args) {
        BufferedReader reader1 = null;
        try {
            reader1 = new BufferedReader(new FileReader("D:\\testX.txt"));
            String firstLine = reader1.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } finally {
            try {
                if (reader1 != null) {
                    reader1.close();
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

}
