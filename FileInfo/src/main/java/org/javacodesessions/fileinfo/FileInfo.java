/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.fileinfo;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author Luis Valenzuela
 */
public class FileInfo {

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
        // Reemplaza esta ruta con la ruta del archivo que deseas analizar
        String filePath = "D:\\archivos\\Archvo de Ejemplo.txt";

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("Nombre del archivo: " + file.getName());
            System.out.println("Ruta absoluta: " + file.getAbsolutePath());
            

            System.out.println("Tamaño del archivo: " + getFileSize(file));

            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            System.out.println("Última modificación: " + sdf.format(file.lastModified()));

            System.out.println("Es archivo: " + file.isFile());
            System.out.println("Es directorio: " + file.isDirectory());
            System.out.println("Puede leerse: " + file.canRead());
            System.out.println("Puede escribirse: " + file.canWrite());

            double freeSpaceGB = file.getFreeSpace() / 1024.0 / 1024.0 / 1024.0;
            double totalSpaceGB = file.getTotalSpace() / 1024.0 / 1024.0 / 1024.0;
            double usableSpaceGB = file.getUsableSpace() / 1024.0 / 1024.0 / 1024.0;

            System.out.println(String.format("Espacio libre en disco: %.2f GB", freeSpaceGB));
            System.out.println(String.format("Espacio total en disco: %.2f GB", totalSpaceGB));
            System.out.println(String.format("Espacio utilizable en disco: %.2f GB", usableSpaceGB));
        } else {
            System.out.println("El archivo no existe.");
        }
        
        /*
            Recomendaciones clave
            - Manejo adecuado de excepciones: FileNotFoundException / IOException
            - Verificación de la existencia y estado de archivos/directorios
              canRead, canWrite, isFile, isDirectory
            - Try-With-Resources / .close()
            - Uso de BufferedReader, BufferedWriter, BufferedInputStream y  BufferedOutputStream
             */
    }

    private static String getFileSize(File file) {
        long size = file.length();
        DecimalFormat df = new DecimalFormat("#.##");

        if (size >= 1024 * 1024 * 1024) {
            return df.format(size / 1024.0 / 1024.0 / 1024.0) + " GB";
        } else if (size >= 1024 * 1024) {
            return df.format(size / 1024.0 / 1024.0) + " MB";
        } else if (size >= 1024) {
            return df.format(size / 1024.0) + " KB";
        } else {
            return size + " bytes";
        }
    }
}
