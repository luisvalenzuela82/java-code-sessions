/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.composite;

import org.javacodesessions.composite.modelo.Directory;
import org.javacodesessions.composite.modelo.File;

/**
 *
 * @author Luis Valenzuela
 */
public class FileSystemClient {

    public static void main(String[] args) {
        Directory mainFolder = new Directory("MainFolder");
        Directory subFolder1 = new Directory("SubFolder1");
        Directory subFolder2 = new Directory("SubFolder2");

        File file1 = new File("File1.txt", 1.5);
        File file2 = new File("File2.txt", 2.0);
        File file3 = new File("File3.txt", 2.5);
        File file4 = new File("File4.txt", 3.0);

        mainFolder.addComponent(subFolder1);
        mainFolder.addComponent(subFolder2);
        mainFolder.addComponent(file1);

        subFolder1.addComponent(file2);
        subFolder1.addComponent(file3);

        subFolder2.addComponent(file4);

        mainFolder.showSizeInfo();
        file1.showSizeInfo();
    }
}
