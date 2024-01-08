/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.visitor.model.visitors;

import org.javacodesessions.visitor.model.Circle;
import org.javacodesessions.visitor.model.Rectangle;
import org.javacodesessions.visitor.model.Triangle;
import org.javacodesessions.visitor.model.Visitor;

/**
 *
 * @author Luis Valenzuela
 */
// Visitor para dibujar las formas
public class ShapeRender implements Visitor {

    @Override
    public void visit(Circle circle) {
        System.out.println("Dibujando un Círculo con ASCII Art:");
        System.out.println("  ***  ");
        System.out.println(" *   * ");
        System.out.println("  ***  ");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Dibujando un Rectángulo con ASCII Art:");
        System.out.println(" ****");
        System.out.println(" *  *");
        System.out.println(" ****");
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println("Dibujando un Triángulo con ASCII Art:");
        System.out.println("  /\\  ");
        System.out.println(" /  \\ ");
        System.out.println("/____\\");
    }
}
