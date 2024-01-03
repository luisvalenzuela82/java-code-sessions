/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.observer;

/**
 *
 * @author Luis Valenzuela
 */
public class ObserverFlow {

    public static void main(String[] args) {
        System.out.println("Observer");

        /*
        La API Flow contiene varias interfaces importantes para implementar el patrón Observer:

        Flow.Publisher: Similar al "Subject" en el patrón Observer tradicional. 
        Publica elementos a uno o más suscriptores.
        
        Flow.Subscriber: Similar al "Observer". Un suscriptor se suscribe a un Publisher y 
        recibe notificaciones sobre nuevos elementos, errores o la finalización del flujo.
        
        Flow.Subscription: Un contrato entre el Publisher y el Subscriber que permite controlar cuántos 
        elementos se deben enviar y manejar la cancelación de la suscripción.
         */
    }
}
