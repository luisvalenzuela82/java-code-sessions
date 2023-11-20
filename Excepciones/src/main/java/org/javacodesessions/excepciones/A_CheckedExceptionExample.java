/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Luis Valenzuela
 */
public class A_CheckedExceptionExample {

    /*
    "Checked" significa "verificado".
    Estas excepciones son verificadas en tiempo de compilación, 
    lo que significa que el compilador de Java verifica que estas 
    excepciones sean manejadas o declaradas en el código.
     */
    
    public static void main(String[] args) {
        try {
            File file = new File("D:\\test.txt");
            FileReader fr = new FileReader(file);
            // Operaciones de lectura del archivo
        } catch (FileNotFoundException e) {
            System.err.println("El archivo especificado no fue encontrado.");
        }
    }
}
