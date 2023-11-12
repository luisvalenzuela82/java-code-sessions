/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.estructurasselectivas;

/**
 *
 * @author Luis Valenzuela
 */
public class EstructurasSelectivas2 {

    //Un Enum en Java es un tipo especial de clase que se utiliza para 
    //definir colecciones de constantes.
    public enum Dia {
        DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO;
    }

    public static void main(String[] args) {
        //ejemplo1();
        //ejemplo2();
        ejemplo3();
    }

    private static void ejemplo1() {
        Dia dia = Dia.LUNES;  // Puedes cambiar este valor para probar diferentes días 

        //Antes de Java 14
        String nombreDia1;
        switch (dia) {
            case LUNES:
                hacerAlgo("1");
                nombreDia1 = "Lunes";
                break;
            case MARTES:
                nombreDia1 = "Martes";
                break;
            case MIERCOLES:
                nombreDia1 = "Miércoles";
                break;
            case JUEVES:
                nombreDia1 = "Jueves";
                break;
            case VIERNES:
                nombreDia1 = "Viernes";
                break;
            case SABADO:
                nombreDia1 = "Sábado";
                break;
            case DOMINGO:
                nombreDia1 = "Domingo";
                break;
            default:
                nombreDia1 = "Día desconocido";
                break;
        }
        System.out.println("El día de la semana es: " + nombreDia1);
    }

    private static void ejemplo2() {
        /*fall-through" en un switch de Java ocurre cuando, después de que se 
        ejecuta el código de un case, el control pasa directamente al siguiente case 
        sin encontrar una instrucción break.*/
        int number = 3; // Puedes cambiar este valor para probar diferentes operaciones
        int result = 1;

        switch (number) {
            case 3:
                result *= 3; // Si es 3, multiplica por 3. Resultado ahora es 3
                
            // Fall-through intencional al siguiente caso
            case 2:
                result += 2; // Si es 2 o ha caído del caso 3, suma 2. Resultado puede ser 5 o 2
            // Fall-through intencional al siguiente caso
            case 1:
                result -= 1; // Si es 1, ha caído del caso 2, o del caso 3, resta 1. Resultado puede ser 4, 1 o 0
                break;
            default:
                result = 0;
        }

        System.out.println("El resultado final es: " + result);
    }

    private static void ejemplo3() {
        Dia dia = Dia.DOMINGO;  // Puedes cambiar este valor para probar diferentes días 
        //A partir de Java 14 
        String nombreDia2 = switch (dia) {
            case DOMINGO -> {
                hacerAlgo("2");
                yield "Domingo";
            }
            case LUNES ->
                "Lunes";
            case MARTES ->
                "Miércoles";
            case MIERCOLES ->
                "Miércoles";
            case JUEVES ->
                "Miércoles";
            case VIERNES ->
                "Miércoles";
            case SABADO ->
                "Miércoles";
            default ->
                "Error, no válido";
        };
        System.out.println("El día de la semana es: " + nombreDia2);
    }

    private static void hacerAlgo(String s) {
        System.out.println("Hacer algo " + s);
    }
}
