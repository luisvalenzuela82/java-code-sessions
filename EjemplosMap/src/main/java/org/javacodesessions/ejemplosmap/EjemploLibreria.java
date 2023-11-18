/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.ejemplosmap;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luis Valenzuela
 */
public class EjemploLibreria {

    public static void main(String[] args) {
        // Crear un HashMap
        Map<String, Libro> registroLibros = new HashMap<>();

        // Añadir libros al registro
        registroLibros.put("ISBN12345", new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 29.99));
        registroLibros.put("ISBN67890", new Libro("1984", "George Orwell", 19.99));
        registroLibros.put("ISBN54321", new Libro("Cien años de soledad", "Gabriel García Márquez", 24.99));

        // Acceder a un libro usando su ISBN
        System.out.println("Detalles del libro con ISBN12345: " + registroLibros.get("ISBN12345"));

        // Recorrer y mostrar todos los libros
        for (Map.Entry<String, Libro> entrada : registroLibros.entrySet()) {
            System.out.println("ISBN: " + entrada.getKey() + " - " + entrada.getValue());
        }
    }
}
