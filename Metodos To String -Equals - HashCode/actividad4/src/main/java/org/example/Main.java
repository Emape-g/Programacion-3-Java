package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Producto> listaProductos = new ArrayList<>();


        Producto noteBook = new Producto(101, "Notebook", 1200.00);
        Producto mouse = new Producto(102, "Mouse", 25.50);

        Producto noteBook2 = new Producto(101, "Notebook acer", 1300.00);

        listaProductos.add(noteBook);
        listaProductos.add(mouse);


        if (!listaProductos.contains(noteBook2)) {
            listaProductos.add(noteBook2);
            System.out.println("Producto Notebook acer agregado a la lista.");
        } else {
            System.out.println("El Notebook con código 101 ya existe en la lista y no será agregado.");
        }


        System.out.println(listaProductos);
    }
}