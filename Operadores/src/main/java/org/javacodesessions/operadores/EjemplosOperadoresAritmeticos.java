/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.operadores;

import java.util.Scanner;

/**
 *
 * @author Luis Valenzuela
 */
public class EjemplosOperadoresAritmeticos {

    public static void main(String[] args) {
        // Radio de un círculo
        double radio = 7.5;

        // Calculando el área del círculo
        double areaCirculo = Math.PI * radio * radio;
        double areaCirculo2 = Math.PI * Math.pow(radio, 2);
        double areaCirculo3 = 3.1416 * radio * radio;

        // Imprimir área del círculo
        System.out.println("Area del Circulo 1: " + areaCirculo);
        System.out.println("Area del Circulo 2: " + areaCirculo2);
        System.out.println("Area del Circulo 3: " + areaCirculo3);
        /*
        La Clase Math es una clase integrada en el lenguaje de programación 
        Java que forma parte del paquete java.lang. Esta clase es esencialmente 
        una biblioteca de funciones matemáticas y constantes que nos facilita 
        realizar cálculos y operaciones matemáticas comunes sin tener que implementarlos 
        desde cero.
         */

        Scanner scanner = new Scanner(System.in);
        /*
        
        Scanner: Es una clase en Java que se utiliza para obtener la entrada de los 
        tipos primitivos como int, double, string, etc., y strings.
        
        System.in: Es una referencia a la entrada estándar, que por lo general está vinculada 
        a la entrada del teclado. 
         */

        System.out.println("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.println("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area);
    }
}
