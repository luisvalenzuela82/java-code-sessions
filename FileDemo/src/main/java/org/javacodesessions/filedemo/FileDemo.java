/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.filedemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Luis Valenzuela
 */
public class FileDemo {

    public static void main(String[] args) {
        System.out.println("java.io.File");
        /*
        java.io proporciona clases e interfaces para el manejo de operaciones 
        de entrada/salida (I/O) de datos en archivos, redes y otros recursos.
        Permiten trabajar con flujos de datos (streams), archivos y directorios,
        facilitando la manipulación de datos en aplicaciones Java.
        
        La clase File es una representación abstracta de rutas de archivos y 
        directorios. Esta clase no se usa para leer o escribir datos en archivos;
        su propósito principal es manejar información sobre archivos y 
        directorios, como sus nombres, rutas y propiedades.
         */
        try {
            // Crear un archivo
            File archivo = new File("D:" + File.separator + "archivos" + File.separator + "archivoOriginal.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }

            // Renombrar el archivo
            File archivoRenombrado = new File("D:" + File.separator + "archivos" + File.separator + "archivoRenombrado.txt");
            if (archivo.renameTo(archivoRenombrado)) {
                System.out.println("Archivo renombrado a: " + archivoRenombrado.getName());
            } else {
                System.out.println("No se pudo renombrar el archivo.");
            }

            // Copiar el archivo
            File archivoCopia = new File("D:" + File.separator + "archivos" + File.separator + "archivoCopia.txt");
            copiarArchivo(archivoRenombrado, archivoCopia);
            System.out.println("Archivo copiado a: " + archivoCopia.getName());

            // Mover el archivo
            File archivoMovido = new File("D:" + File.separator + "archivos" + File.separator + "copia" + File.separator + "archivoMovido.txt");
            if (archivoCopia.renameTo(archivoMovido)) {
                System.out.println("Archivo movido a: " + archivoMovido.getName());
            } else {
                System.out.println("No se pudo mover el archivo.");
            }

            // Eliminar el archivo
            if (archivoMovido.delete()) {
                System.out.println("Archivo eliminado: " + archivoMovido.getName());
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }

            /*
            Recomendaciones clave
            - Manejo adecuado de excepciones: FileNotFoundException / IOException
            - Verificación de la existencia y estado de archivos/directorios
              canRead, canWrite, isFile, isDirectory
            - Try-With-Resources / .close()
            - Uso de BufferedReader, BufferedWriter, BufferedInputStream y  BufferedOutputStream
             */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copiarArchivo(File fuente, File destino) throws IOException {
        try 
        (
            InputStream in = new BufferedInputStream(new FileInputStream(fuente)); 
            OutputStream out = new BufferedOutputStream(new FileOutputStream(destino))
            ) 
        {
                byte[] buffer = new byte[1024];
                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
        }
    }
}
