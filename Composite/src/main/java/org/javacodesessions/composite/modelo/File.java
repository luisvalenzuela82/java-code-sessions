/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.composite.modelo;

/**
 *
 * @author Luis Valenzuela
 */
public class File implements FileSystemComponent {
    private String name;
    private double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showSizeInfo() {
        System.out.println("File: " + name + ", Size: " + size + " MB");
    }

    public double getSize() {
        return size;
    }

    
    
    
}
