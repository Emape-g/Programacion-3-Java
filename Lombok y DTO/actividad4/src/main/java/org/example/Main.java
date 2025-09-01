package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("P001", "Libro A", "Proveedor X", 1200.50);
        Producto p2 = new Producto("P002", "Libro B", "Proveedor Y", 980.75);
        Producto p3 = new Producto("P003", "Revista C", "Proveedor Z", 450.00);

        ProductoRecord r1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord r2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord r3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());


        List<ProductoRecord> listaRecords = new ArrayList<>();
        listaRecords.add(r1);
        listaRecords.add(r2);
        listaRecords.add(r3);


        System.out.println("Productos (POJO con Lombok)");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        System.out.println("\n ProductoRecords (inmutables)");
        for (ProductoRecord record : listaRecords) {
            System.out.println(record);
        }
    }
}
