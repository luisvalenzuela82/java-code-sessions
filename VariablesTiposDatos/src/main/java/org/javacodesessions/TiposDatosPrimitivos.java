/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions;

/**
 *
 * @author Luis Valenzuela
 */
public class TiposDatosPrimitivos {

    public static void main(String[] args) {
        // Tipos de datos primitivos en Java

        // Tipo byte - Entero de 8 bits
        byte unByte = 127; // Rango: -128 a 127

        // Tipo short - Entero de 16 bits
        short unShort = 32767; // Rango: -32768 a 32767

        // Tipo int - Entero de 32 bits
        int unInt = 2147483647; // Rango: -2147483648 a 2147483647

        // Tipo long - Entero de 64 bits
        long unLong = 9223372036854775807L; // Rango: -9223372036854775808 a 9223372036854775807

        // Tipo float - Número de punto flotante de 32 bits
        float unFloat = 3.14f; // Nota: la 'f' al final denota un literal float

        // Tipo double - Número de punto flotante de 64 bits
        double unDouble = 3.141592653589793; // Doble precisión

        // Tipo char - Carácter Unicode de 16 bits
        char unChar = 'A'; // Puede almacenar cualquier carácter Unicode
        char unChar2 = 64; // Puede almacenar cualquier carácter Unicode

        // Tipo boolean - True o false
        boolean unBoolean = true; // Puede ser true o false

        // Imprimir los valores
        System.out.println("Valor de byte: " + unByte);
        System.out.println("Valor de short: " + unShort);
        System.out.println("Valor de int: " + unInt);
        System.out.println("Valor de long: " + unLong);
        System.out.println("Valor de float: " + unFloat);
        System.out.println("Valor de double: " + unDouble);
        System.out.println("Valor de char: " + unChar);
        System.out.println("Valor de char2: " + unChar2);
        System.out.println("Valor de boolean: " + unBoolean);
    }
}
