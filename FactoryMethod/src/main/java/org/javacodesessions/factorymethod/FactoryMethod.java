/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.javacodesessions.factorymethod;

/**
 *
 * @author Luis Valenzuela
 */
public class FactoryMethod {
 
    public static void main(String[] args) {
        System.out.println("Factory Method!");
        /*
        El patrón de diseño Factory Method es un patrón de diseño creacional que 
        proporciona una interfaz para crear objetos en una superclase, 
        pero permite que las subclases alteren el tipo de objetos que se crearán.

        Imagínalo como si fuera una fábrica real: la "fábrica" (método de fábrica) 
        es una parte del programa que se encarga de la creación de objetos. 
        En lugar de llamar a un constructor directamente, le pides a la fábrica 
        que te cree un objeto.
        */
        
        /*
        Mejores Prácticas
        Usar cuando la creación de objetos es compleja.
        Cuando el tipo exacto de objeto no se conoce de antemano.
        Encapsular la lógica de creación.
        Promover la extensibilidad.
        Separar la creación de objetos de su uso.

        Errores Comunes
        Sobrecargar de responsabilidades a la fábrica.
        Uso innecesario en situaciones simples.
        Crear una jerarquía de clases excesivamente compleja.
        Depender demasiado de las subclases.
        Ignorar los principios de diseño SOLID.
        */
    }
}
