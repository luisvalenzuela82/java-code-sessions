/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions;

/**
 *
 * @author Luis Valenzuela
 */
public class Envoltorios {

    public static void main(String[] args) {
        // Clases envoltorio para los tipos de datos primitivos

        // Byte - envoltorio para el tipo primitivo byte
        Byte unByte = 127; // Autoboxing de byte a Byte

        // Short - envoltorio para el tipo primitivo short
        Short unShort = 32767; // Autoboxing de short a Short

        // Integer - envoltorio para el tipo primitivo int
        Integer unInt = 2147483647; // Autoboxing de int a Integer

        // Long - envoltorio para el tipo primitivo long
        Long unLong = 9223372036854775807L; // Autoboxing de long a Long

        // Float - envoltorio para el tipo primitivo float
        Float unFloat = 3.14f; // Autoboxing de float a Float

        // Double - envoltorio para el tipo primitivo double
        Double unDouble = 3.141592653589793; // Autoboxing de double a Double

        // Character - envoltorio para el tipo primitivo char
        Character unChar = 'A'; // Autoboxing de char a Character
        Character unChar2 = 64; // Autoboxing de char a Character

        // Boolean - envoltorio para el tipo primitivo boolean
        Boolean unBoolean = true; // Autoboxing de boolean a Boolean

        // Imprimir los valores de los objetos envoltorios
        System.out.println("Valor de Byte: " + unByte);
        System.out.println("Valor de Short: " + unShort);
        System.out.println("Valor de Integer: " + unInt);
        System.out.println("Valor de Long: " + unLong);
        System.out.println("Valor de Float: " + unFloat);
        System.out.println("Valor de Double: " + unDouble);
        System.out.println("Valor de Character: " + unChar);
        System.out.println("Valor de Character 2: " + unChar2);
        System.out.println("Valor de Boolean: " + unBoolean);
    }
}
