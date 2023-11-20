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
public class F_TryWiithResourceExample {

    /*
    Try-with-Resources es una característica en Java que facilita 
    el manejo automático de recursos como archivos, conexiones de red, 
    o cualquier recurso que necesite ser cerrado después de su uso. 
     */
    public static void main(String[] args) {
        // Uso de Try-with-Resources para manejar un BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\test.txt"))) {
            String firstLine = reader.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }finally{
            System.out.println("Bloque Finally");
        }
    }

    /*
    Entrada/Salida de Archivos:
    FileInputStream
    FileOutputStream
    FileReader
    FileWriter
    BufferedReader
    BufferedWriter
    PrintWriter
    
    Entrada/Salida de Datos:
    InputStream
    OutputStream
    InputStreamReader
    OutputStreamWriter
    
    Conexiones de Red:
    Socket
    ServerSocket
    
    Trabajo con Bases de Datos:
    Connection (de JDBC)
    Statement
    PreparedStatement
    ResultSet
     */
}
