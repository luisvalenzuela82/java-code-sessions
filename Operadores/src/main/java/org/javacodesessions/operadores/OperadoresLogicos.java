/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.operadores;

/**
 *
 * @author Luis Valenzuela
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Operador AND (&&)
        boolean resultadoAND = a && b;
        System.out.println("Resultado de a && b: " + resultadoAND);  // false

        // Operador OR (||)
        boolean resultadoOR = a || b;
        System.out.println("Resultado de a || b: " + resultadoOR);  // true

        // Operador NOT (!)
        boolean resultadoNOT = !a;
        System.out.println("Resultado de !a: " + resultadoNOT);  // false
    }
}
