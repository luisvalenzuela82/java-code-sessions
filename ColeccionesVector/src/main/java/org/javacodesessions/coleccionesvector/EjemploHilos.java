/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.coleccionesvector;

import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author Luis Valenzuela
 */
public class EjemploHilos {

    public static void main(String[] args) {
        Vector<Integer> listaCompartida = new Vector<>();

        // Hilo para agregar elementos a la lista
        Thread hiloAgregador = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                listaCompartida.add(i);
                try {
                    Thread.sleep(10); // Simula un procesamiento
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Hilo para iterar sobre la lista
        Thread hiloIterador = new Thread(() -> {
            try {
                while (true) {
                    for (Integer item : listaCompartida) {
                        System.out.println(item);
                    }
                }
            } catch (ConcurrentModificationException e) {
                e.printStackTrace();
            }
        });

        hiloAgregador.start();
        hiloIterador.start();
    }
}
