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
// Visitor para calcular el área
public class AreaCalculator implements Visitor {
    // Métodos para Círculo y Rectángulo permanecen iguales...

    @Override
    public void visit(Triangle triangle) {
        double area = 0.5 * triangle.getBase() * triangle.getHeight();
        System.out.println("Área del Triángulo: " + area);
    }

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Área del Círculo: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        int area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Área del Rectángulo: " + area);
    }
}
