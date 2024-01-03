/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.javacodesessions.observer;

/**
 *
 * @author Luis Valenzuela
 */
public class Observer {

    public static void main(String[] args) {
        System.out.println("Observer");
        
        /*
        Utilizado para permitir que un objeto (conocido como "sujeto") 
        notifique automáticamente a otros objetos (los "observadores") 
        sobre cambios en su estado.
        Los observadores se registran en el sujeto. Cuando el sujeto experimenta 
        un cambio (por ejemplo, una actualización de datos), recorre su lista 
        de observadores registrados y les envía una notificación llamando a 
        uno de sus métodos.
        
        Recomendaciones:
        - Es es importante desuscribir los observadores cuando ya no son 
          necesarios.
        - Agregar mecanismos para que los observadores indiquen qué tipos de 
          cambios les interesan.
        - Considera el Uso de APIs Existentes como Flow
        */
    }
}
