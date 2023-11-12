/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions;

/**
 *
 * @author Luis Valenzuela
 */
public class NewMain2 {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo 2 " + args[0]);
        
        for (String s : args) {
            System.out.println(s);
        }
        
        NewMain1.main(new String[]{"X", "Y", "Z"});
    }
}
