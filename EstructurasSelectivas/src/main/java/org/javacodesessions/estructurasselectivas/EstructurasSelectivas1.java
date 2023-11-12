/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.javacodesessions.estructurasselectivas;

/**
 *
 * @author Luis Valenzuela
 */
public class EstructurasSelectivas1 {

    public static void main(String[] args) {
        System.out.println("Estructuras selectivas");
        //ejemplo1();
        ejemplo2();
    }

    private static void ejemplo1() {
        int score = 75; // Cambia este valor para probar diferentes categorías

        if (score < 50) {
            System.out.println("Puntuación Baja");
        } else if (score < 70) {
            System.out.println("Puntuación Media");
        } else if (score < 90) {
            System.out.println("Puntuación Alta");
        } else {
            System.out.println("Puntuación Muy Alta");
        }
    }

    private static void ejemplo2() {
        /*Operador ternario*/
        //El operador ternario en Java es una forma 
        //concisa de realizar una operación if-else en una sola línea.
        int number = 7;
        String result;

        // Uso de if-else
        if (number % 2 == 0) {
            result = "Par";
        } else {
            result = "Impar";
        }
        System.out.println("El número " + number + " es " + result);

        // Uso del operador ternario
        //condición ? expresión1 : expresión2
        result = (number % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + number + " es " + result);
    }
}
