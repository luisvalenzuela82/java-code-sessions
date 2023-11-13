/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author Luis Valenzuela
 */
public class Listas1 {

    public static void main(String[] args) {
        /*
        ArrayList:
        Basada en un arreglo dinámico.
        Ofrece acceso rápido a elementos por índice, ya que internamente utiliza un arreglo.
        Su capacidad aumenta automáticamente a medida que se agregan elementos.
        Es la opción predeterminada para la mayoría de usos debido a su versatilidad y eficiencia en operaciones de acceso y actualización.
        
        LinkedList:
        Implementa tanto la interfaz List como Deque (double ended queue).
        Basada en una lista doblemente enlazada.
        Ofrece mejor rendimiento en operaciones de adición y eliminación en los extremos de la lista.
        Menos eficiente para el acceso aleatorio en comparación con ArrayList.
        
        Vector:
        Similar a ArrayList, pero es sincronizado.
        Cada método es thread-safe, lo que significa que es seguro para el uso en entornos multihilo.
        Generalmente más lento que ArrayList debido a la sobrecarga de sincronización.
        Menos utilizado en aplicaciones modernas, reemplazado en gran medida por ArrayList.
        
        Stack:
        Una subclase de Vector que implementa una estructura de pila (LIFO - Last In, First Out).
        Proporciona operaciones para agregar y quitar elementos desde el final de la lista.
        Aunque técnicamente es una implementación de List, su uso como tal es poco común y está orientado a operaciones específicas de pila.
         */
        System.out.println("Seleccionar ejemplo: ");
        Scanner scanner = new Scanner(System.in);
        String ejemplo = scanner.next();
        switch (ejemplo) {
            case "ArrayList" ->
                arrayList();
            case "LinkedList" ->
                linkedList();
            case "Vector" ->
                vector();
            case "Stack" ->
                stack();
        }
    }

    public static void arrayList() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        System.out.println(frutas); // Imprime la lista
    }

    public static void linkedList() {
        LinkedList<String> frutas = new LinkedList<>();
        frutas.add("Manzana");
        frutas.addFirst("Fresa"); // Método específico de LinkedList
        frutas.addLast("Naranja");
        System.out.println(frutas); // Imprime la lista
    }

    public static void vector() {
        Vector<String> frutas = new Vector<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        System.out.println(frutas); // Imprime el vector
    }

    public static void stack() {
        Stack<String> pila = new Stack<>();
        pila.push("Libro1");
        pila.push("Libro2");
        pila.push("Libro3");
        System.out.println(pila.pop()); // Elimina y devuelve "Libro3"
        System.out.println(pila); // Imprime la pila restante
    }
}
