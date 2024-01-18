/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.javacodesessions.serializable.modelo.MiObjeto;

/**
 *
 * @author Luis Valenzuela
 */
public class Serializable {

    public static void main(String[] args) {
        System.out.println("Serializable");
        /*
        
        java.io proporciona clases e interfaces para el manejo de operaciones 
        de entrada/salida (I/O) de datos en archivos, redes y otros recursos.
        Permiten trabajar con flujos de datos (streams), archivos y directorios,
        facilitando la manipulación de datos en aplicaciones Java.
        
        java.io.Serializable es una interface que se utiliza para marcar clases 
        cuyos objetos pueden ser convertidos en una secuencia de bytes y 
        viceversa. 
        Esta capacidad es especialmente útil cuando necesitas enviar un objeto 
        a través de una red, guardarlo en un archivo o almacenarlo en alguna 
        otra forma que requiera una representación compacta

         */

        //Ejemplo: serializar un objeto y escribir los bytes en un archivo
        //Crear una clase con atributos que implemente la interface Serializable
        MiObjeto miObjeto = new MiObjeto(1, "Luis", "123");
        try {
            //Serializar:
            // Crear un ObjectOutputStream (que envuelva un FileOutputStream)
            FileOutputStream fileOut = new FileOutputStream("D:\\java-code-sessions\\miobjeto.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // Escribir el objeto
            out.writeObject(miObjeto);

            // Cerrar el flujo
            out.close();
            fileOut.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            // Desserializar:
            // Crear un ObjectInputStream (que envuelva un FileInputStream)
            FileInputStream fileIn = new FileInputStream("D:\\java-code-sessions\\miobjeto2.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            // Leer el objeto
            MiObjeto miObjeto2 = (MiObjeto) in.readObject();

            // Cerrar el flujo
            in.close();
            fileIn.close();

            // Imprimir el objeto en consola
            System.err.println(miObjeto2.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*
            
            Recomendaciones clave:
            - Usa el Campo serialVersionUID
            - Maneja Cambios en las Clases con Cuidado
            - Valida los Objetos Después de la Deserialización
            - Marca Campos Sensibles o No Serializables con transient
         */
    }
}
