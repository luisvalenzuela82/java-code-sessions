/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.javacodesessions.prototype;

/**
 *
 * @author Luis Valenzuela
 */
public class Prototype {

    public static void main(String[] args) {
        System.out.println("Prototype!");
        /*
        Se utiliza para crear objetos duplicados con el objetivo de que sea más eficiente
        clonarlo que crearlo "de cero". 
        Este patrón es útil cuando la creación de un objeto es más costosa que su 
        clonación.
        
        Recomendaciones
        Manejar correctamente la clonación superficial y profunda.
        Mantener la simplicidad de los objetos.
        Documentar el uso del patrón en el código
        
        Evitar
        Modificar el objeto original en la clonación
        No manejar correctamente las expepciones.
        */
    }
}
