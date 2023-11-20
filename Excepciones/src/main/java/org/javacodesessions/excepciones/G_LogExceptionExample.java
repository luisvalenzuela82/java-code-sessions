/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Valenzuela
 */
public class G_LogExceptionExample {

    /*
    Logger en Java es una herramienta utilizada para registrar información 
    durante la ejecución de un programa. 
    
    Proporciona una manera de registrar mensajes que pueden incluir 
    información sobre el flujo de ejecución del programa, errores, 
    y otros datos relevantes. 
    
    Los mensajes de log pueden ser utilizados para propósitos de depuración, 
    monitoreo, y diagnóstico de problemas. 
    Logger permite definir diferentes niveles de importancia para los mensajes, 
    como SEVERE, WARNING, INFO, y otros, lo que facilita la clasificación 
    y el filtrado de la información registrada según su relevancia o gravedad.
     */
    private static final Logger LOGGER = Logger.getLogger(G_LogExceptionExample.class.getName());

    public static void main(String[] args) {
        try {
            // Código que puede lanzar una excepción
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            //Avisar al usuario
            System.out.println("Ha ocurrido un problema, contactar a personal de TI");
            //Registrar log
            LOGGER.log(Level.SEVERE, "Excepción", e);
        } catch (Exception e) {
            //Avisar al usuario
            System.out.println("Ha ocurrido un problema, contactar a personal de TI");
            //Registrar log
            LOGGER.log(Level.SEVERE, "Excepción", e);
        }
    }
}
