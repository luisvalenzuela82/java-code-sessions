/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Luis Valenzuela
 */
public class Streams2A {

    public static void main(String[] args) {
        System.out.println("Stream.map");

        //Ejemplo
        //Una lista que contenga arrays de interos que representen colores rgb
        List<int[]> coloresRgb = Arrays.asList(
                new int[]{145, 119, 138}, //rojo
                new int[]{0, 255, 0},//verde
                new int[]{0, 0, 255} //azul
        );
        //Para cada elemento de la lista, obtener el String que represente el color
        //hexadecimal
        List<String> collect = coloresRgb
                .stream()
                .map(n -> String.format("#%02X%02X%02X", n[0], n[1], n[2]))
                .collect(Collectors.toList());
        
        System.out.println(collect);

    }
}
