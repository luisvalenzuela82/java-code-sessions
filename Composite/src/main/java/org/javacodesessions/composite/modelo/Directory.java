/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.composite.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis Valenzuela
 */
public class Directory implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void showSizeInfo() {
        double totalSize = 0;
        for (FileSystemComponent component : components) {
            if (component instanceof File) {
                totalSize += ((File) component).getSize();
            } else if (component instanceof Directory) {
                totalSize += ((Directory) component).getTotalSize();
            }
        }
        System.out.println("Directory: " + name + ", Total Size: " + totalSize + " MB");
        for (FileSystemComponent component : components) {
            component.showSizeInfo();
        }
    }

    private double getTotalSize() {
        double totalSize = 0;
        for (FileSystemComponent component : components) {
            if (component instanceof File) {
                totalSize += ((File) component).getSize();
            } else if (component instanceof Directory) {
                totalSize += ((Directory) component).getTotalSize();
            }
        }
        return totalSize;
    }
}
