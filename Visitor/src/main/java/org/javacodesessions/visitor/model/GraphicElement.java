/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.visitor.model;

/**
 *
 * @author Luis Valenzuela
 */
// Interfaz de elemento que puede ser visitado
public interface GraphicElement {

    void accept(Visitor visitor);
}
