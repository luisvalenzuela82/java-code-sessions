/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.directoriodemo;

import java.io.File;

/**
 *
 * @author Luis Valenzuela
 */
public class DirectorioDemo {

    public static void main(String[] args) {
        System.out.println("Directorios");
        /*
        
        java.io proporciona clases e interfaces para el manejo de operaciones 
        de entrada/salida (I/O) de datos en archivos, redes y otros recursos.
        Permiten trabajar con flujos de datos (streams), archivos y directorios,
        facilitando la manipulación de datos en aplicaciones Java.
        
        La clase java.io.File en Java se utiliza para representar y manipular 
        rutas de archivos y directorios en el sistema de archivos. 
         */

        // Define la ruta al directorio
        String ruta = "D:\\java-code-sessions\\miDirectorio";
        // Verifica si el directorio existe
        File dir = new File(ruta);

        if (!dir.exists()) {
            System.out.println("El directorio no existe, vamos a intentar crearlo");
            // Si no existe, crearlo
            if (dir.mkdir()) {
                System.out.println("El directorio se creo correctamente");
            } else {
                System.out.println("El directorio no se pudo crear");
            }
        } else {
            System.out.println("El directorio ya existe");
        }
        // Verifica si el objeto File es un directorio
        if (dir.isDirectory()) {
            System.out.println("Si es un directorio");
            // Lista archivos y subdirectorios
            String[] files = dir.list();
            if (files != null) {
                for (String file : files) {
                    System.out.println(file);
                }
            }

        }

        // Renombrar el directorio
        File nuevoDir = new File("D:\\java-code-sessions\\miDirectorio2");
        if (dir.renameTo(nuevoDir)) {
            System.out.println("El directorio se renombro corectamente");
        }else{
            System.out.println("No se pudo renombrar el dirctorio");
        }
    }

    /*
    Recomendaciones clave:
    - Manejo de Excepciones y Verificaciones de Seguridad
    - Uso de Rutas Relativas y Absolutas
     */
}
