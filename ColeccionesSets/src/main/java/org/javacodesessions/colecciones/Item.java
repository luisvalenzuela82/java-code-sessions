/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.javacodesessions.colecciones;

import java.util.Objects;

/**
 *
 * @author Luis Valenzuela
 */
public class Item {

    private String name;
    private Integer id;

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /*
    Todos los objetos en Java tienen equals y hashCode porque estos métodos son 
    parte de la clase Object, que es la clase raíz de todas las clases en Java.
     */
    @Override
    public boolean equals(Object o) {
        // Implementación incorrecta: solo compara nombres
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return name.equals(item.name) && id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);

    }

    @Override
    public String toString() {
        return "Item{"
                + "name='" + name + '\''
                + ", id=" + id
                + '}';
    }
}
