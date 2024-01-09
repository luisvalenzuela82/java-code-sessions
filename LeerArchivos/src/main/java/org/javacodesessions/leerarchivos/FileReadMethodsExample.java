/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.leerarchivos;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Valenzuela
 */
public class FileReadMethodsExample {

    public static void main(String[] args) {
        String filePath = "D:\\test2.txt"; // Reemplaza con la ruta de tu archivo

        // Leer archivo usando solo FileInputStream
        long startTime = System.nanoTime();
        readFileWithFileInputStream(filePath);
        long endTime = System.nanoTime();
        System.out.println("Tiempo con FileInputStream: " + (endTime - startTime) / 1_000_000_000.0 + " segundos\n");

        // Leer archivo usando FileInputStream y InputStreamReader
        startTime = System.nanoTime();
        readFileWithFileInputStreamAndInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("Tiempo con FileInputStream + InputStreamReader: " + (endTime - startTime) / 1_000_000_000.0 + " segundos\n");

        // Leer archivo usando FileInputStream, InputStreamReader y BufferedReader
        startTime = System.nanoTime();
        readFileWithFileInputStreamAndBufferedReader(filePath);
        endTime = System.nanoTime();
        System.out.println("Tiempo con FileInputStream + InputStreamReader + BufferedReader: " + (endTime - startTime) / 1_000_000_000.0 + " segundos\n");
    }

    private static void readFileWithFileInputStream(String filePath) {
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(filePath);
            int byteData;
            while ((byteData = fileStream.read()) != -1) {
                System.out.print((char) byteData);
            }
            System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fileStream!=null){
                try {
                    fileStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileReadMethodsExample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private static void readFileWithFileInputStreamAndInputStreamReader(String filePath) {
        try (FileInputStream fileStream = new FileInputStream(filePath); InputStreamReader inputReader = new InputStreamReader(fileStream, StandardCharsets.UTF_8)) {

            int character;
            while ((character = inputReader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileWithFileInputStreamAndBufferedReader(String filePath) {
        try (FileInputStream fileStream = new FileInputStream(filePath); InputStreamReader inputReader = new InputStreamReader(fileStream,StandardCharsets.UTF_8); BufferedReader reader = new BufferedReader(inputReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
