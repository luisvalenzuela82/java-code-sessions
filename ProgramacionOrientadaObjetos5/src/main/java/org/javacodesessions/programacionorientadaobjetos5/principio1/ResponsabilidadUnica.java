/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.programacionorientadaobjetos5.principio1;

/**
 *
 * @author Luis Valenzuela
 */
public class ResponsabilidadUnica {

    /*
    S - Principio de Responsabilidad Única (Single Responsibility Principle): 
    Cada clase debe encargarse de una sola parte de la funcionalidad del software.
     */
    public static void main(String[] args) {
        //MALA IDEA
        UserService userService = new UserService("1", "Luis", "luis.valenzuela@abacus.mx");
        userService.saveUserToDatabase();
        
        //BUENA IDEA
        User user = new User("1", "Luis", "luis.valenzuela@abacus.mx");
        new UserDBService().saveUserToDatabase(user);
    }

    /*
    Beneficios:
    1.- Facilidad de Mantenimiento
    2.- Menos Errores (no relacionados)
    3.- Reutilización de Código
    4.- Pruebas Más Sencillas
    5.- Flexibilidad y Escalabilidad
    6.- Organización del Código
    */
}
