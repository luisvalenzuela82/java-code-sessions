/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.visitor.model;

import org.javacodesessions.visitor.model.visitors.AreaCalculator;
import org.javacodesessions.visitor.model.visitors.ShapeRender;

/**
 *
 * @author Luis Valenzuela
 */
public class GraphicsEditor {

    public static void main(String[] args) {
        // Creación de objetos de formas gráficas
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 4);
        Triangle triangle = new Triangle(6, 3);

        // Creación de objetos Visitor
        Visitor areaCalculator = new AreaCalculator();
        Visitor shapeRender = new ShapeRender();

        // Llamadas individuales a accept para Circle
        circle.accept(areaCalculator);
        circle.accept(shapeRender);

        // Llamadas individuales a accept para Rectangle
        rectangle.accept(areaCalculator);
        rectangle.accept(shapeRender);

        // Llamadas individuales a accept para Triangle
        triangle.accept(areaCalculator);
        triangle.accept(shapeRender);
    }
}
