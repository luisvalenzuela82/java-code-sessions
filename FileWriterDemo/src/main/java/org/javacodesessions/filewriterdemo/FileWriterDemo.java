/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.filewriterdemo;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import static org.javacodesessions.filewriterdemo.WavByteGenerator.generateHeader;

/**
 *
 * @author Luis Valenzuela
 */
public class FileWriterDemo {

    /*
    java.io proporciona clases e interfaces para el manejo de operaciones 
    de entrada/salida (I/O) de datos en archivos, redes y otros recursos.
    Permiten trabajar con flujos de datos (streams), archivos y directorios,
    facilitando la manipulación de datos en aplicaciones Java.
    
    FileOutputStream se usa para escribir datos crudos (como bytes) en archivos. 
    Es especialmente útil para escribir datos binarios, como imágenes o cualquier 
    otro tipo de archivo que no sea texto.
    
    OutputStreamWriter es una clase en Java que actúa como un adaptador 
    entre flujos de salida basados en bytes (OutputStream) y escritores 
    basados en caracteres (Writer). 
    
    BufferedWriter es una clase en Java que proporciona una forma eficiente 
    de escribir texto en un destino de salida, como un archivo.
    Es especialmente útil cuando se realizan muchas operaciones de escritura 
    pequeñas, ya que reduce la cantidad de accesos al sistema de archivos.
    
    
    
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        

        //Audio
        //createSimpleWavFile("D:\\test.wav");
        
        
        //Escribir texto sin buffer
        
        // Datos para los ejemplos
        String fileName = "D:\\ejemplo.txt";
        String text = "Hola Mundo!";
        //writeTextToFileNoBuffer(fileName, text);
        //Escribir texto con buffer
        //writeTextToFileWithBuffer(fileName, text);

        //Agregar texto a un archivo
        appendTextToFile(fileName, "\nEsto es un texto agregado.");
        /*
        Recomendaciones: 
        - Manejo Correcto de Excepciones y Cierre de Recursos
        - Selección Adecuada de la Codificación de Caracteres
        - Uso de Buffered Writing para Mejorar el Rendimiento
         */
    }
    
    public static void createSimpleWavFile(String fileName) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            // Escribe el encabezado del archivo WAV
            byte[] headerData = WavByteGenerator.generateHeader();
            fos.write(headerData);

            // Genera un tono simple y escribe los datos del audio
            byte[] audioData = WavByteGenerator.generateTone(44100, 440, 1);
            fos.write(audioData);

            // Actualiza los tamaños en el encabezado
            WavByteGenerator.updateChunkSizes(fos, audioData.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeTextToFileNoBuffer(String fileName, String text) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8")) {
            osw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void writeTextToFileWithBuffer(String fileName, String text) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "UTF-8"))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void appendTextToFile(String fileName, String text) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true), "UTF-8"))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
