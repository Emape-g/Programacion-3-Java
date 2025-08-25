package org.example;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Producto> inventario = new HashSet<>();

        Producto notebook = new Producto(101, "Notebook", 1200.00);
        Producto mouse = new Producto(102, "Mouse", 25.50);
        Producto notebook2 = new Producto(101, "Notebook de otra marca", 1300.00);
        Producto teclado = new Producto(103, "Teclado", 50.00);

        inventario.add(notebook);
        inventario.add(mouse);
        inventario.add(notebook2); 
        inventario.add(teclado);

        System.out.println("Tamaño del inventario: " + inventario.size());
        System.out.println("Inventario: " + inventario);
    }
}