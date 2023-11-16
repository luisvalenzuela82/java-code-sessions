/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.coleccionesvector;

import java.util.Vector;

/**
 *
 * @author Luis Valenzuela
 */
public class EjemploVector {

    public static void main(String[] args) {
        
        
        /*
        ¡¡¡¡¡NO USEN VECTOR!!!!
        Principio de compatibilidad 
        "Thread safe": ConcurrentModificationException 
        Desempeño pobre, y otros problemillas...
        https://github.com/openjdk/jdk/blob/ffa35d8cf181cfbcb54497e997dbd18a9b62b97e/src/java.base/share/classes/java/util/Vector.java#L92
        */
       
        
        Vector<Tarea> tareas = new Vector<>();

        // Agregar tareas
        tareas.add(new Tarea("Comprar leche"));
        tareas.add(new Tarea("Enviar correo al jefe"));
        tareas.add(new Tarea("Llamar al doctor"));

        // Mostrar tareas pendientes
        System.out.println("Tareas pendientes:");
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }

        // Eliminar una tarea (la segunda)
        if (tareas.size() > 1) {
            tareas.remove(1);
        }

        // Mostrar tareas después de eliminar una
        System.out.println("\nTareas después de eliminar una:");
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
        
        
    }
}
