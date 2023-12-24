/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.javacodesessions.composite;

/**
 *
 * @author Luis Valenzuela
 */
public class Composite {

    public static void main(String[] args) {
        System.out.println("Composite");
        /*
        Se utiliza para tratar un grupo de objetos (estructuras de arbol) de la misma manera que se 
        trataría a un objeto individual.
        
        El uso del patrón Composite sólo tiene sentido cuando el modelo 
        puede representarse en forma de árbol (estructura gerarquica).
        
        Por ejemplo el sistema de archivos de una computadora o una estrcura organizacinal.

        Recomendaciones
        - Mantener El componente compuesto (Interfaz o clase abstracta) uniforme.
          Que los métodos apliquen para los componentes simples y los compuestos.
        - Gestionar las relaciones padre/hijo y no ingoar recursividad infinita.
        - Cuidado con la recursividad profunda y su impacto en el desempeño.
        
        */
    }
}
