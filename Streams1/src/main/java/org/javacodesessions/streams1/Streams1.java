/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Luis Valenzuela
 */
public class Streams1 {

    public static void main(String[] args) {
        System.out.println("Java Stream API!");

        /*
        La API de Stream en Java es una característica introducida en Java 8 
        que permite procesar secuencias de elementos de una manera funcional 
        y declarativa. 
        Piensa en un 'stream' (flujo) como una secuencia de datos que fluye a 
        través de una tubería de operaciones.

        Elementos:
        - Streams: 
          Representan una secuencia de elementos. 
        - Operaciones Intermedias: 
          Transforman el stream original en otro stream.
          filter, map, sorted
        - Operaciones finales:
          Producen un resultado o un efecto secundario. 
          forEach, collect
        
         */
        //Ejemplo:
        //Crear un List de Integers
        List<Integer> enteros = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            enteros.add(i);
        }

        //Craer un Stram
        Stream<Integer> stream = enteros.stream();

        //Filtrar los elementos que sean pares
        Stream<Integer> filter = stream.filter(n -> esPar(n));
        //filter tiene la forma (argumento) -> { expresión },
        //donde argumento es un elemento del stream y expresión es una 
        //condición que devuelve un valor booleano.

        //Guardar el resultado en una List 
        List<Integer> pares = filter.collect(Collectors.toList());
        System.out.println(pares);
    }

    private static boolean esPar(Integer n) {
        return n % 2 == 0;
    }

}
