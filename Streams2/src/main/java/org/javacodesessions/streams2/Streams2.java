/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Luis Valenzuela
 */
public class Streams2 {

    public static void main(String[] args) {
        System.out.println("Stream.map");
        /*
        La API de Stream en Java es una característica introducida en Java 8 
        que permite procesar secuencias de elementos de una manera funcional 
        y declarativa. 
        Piensa en un 'stream' (flujo) como una secuencia de datos que fluye a 
        través de una tubería de operaciones

        Elementos:
        - Streams: 
          Representan una secuencia de elementos. 
        - Operaciones Intermedias: 
          Transforman el stream original en otro stream.
          filter, map, sorted
        - Operaciones finales:
          Producen un resultado o un efecto secundario. 
          Collectors
        
        La función map en los Stream de Java es una operación intermedia 
        que te permite transformar los elementos de un Stream de una forma a 
        otra.
        
         */

        //Ejemplo
        //Una lista que contenga arrays de interos que representen colores rgb
        List<int[]> coloresRgb = Arrays.asList(
                new int[]{145, 119, 138}, //rojo
                new int[]{0, 255, 0},//verde
                new int[]{0, 0, 255} //azul
        );
        //Para cada elemento de la lista, obtener el String que represente el color
        //hexadecimal
        Stream<int[]> stream = coloresRgb.stream();
        Stream<String> map = stream.map(n -> getHexadecimal(n));
        //Guardar el resultado en una lista de String
        List<String> collect = map.collect(Collectors.toList());

        System.out.println(collect);
    }

    private static String getHexadecimal(int[] n) {
        return String.format("#%02X%02X%02X", n[0], n[1], n[2]);
    }
}
