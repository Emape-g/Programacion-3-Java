package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("P001", "Libro A", 1200.50, "Autor X");
        Producto p2 = new Producto("P002", "Libro B", 980.75, "Autor Y");
        Producto p3 = new Producto("P003", "Revista C", 450.00, "Autor Z");
        Producto p4 = new Producto("P004", "Manual D", 1500.00, "Autor W");
        Producto p5 = new Producto("P005", "Enciclopedia E", 3200.90, "Autor V");


        List<ProductoDTO> listaDTO = new ArrayList<>();


        ProductoDTO dto1 = new ProductoDTO();
        dto1.setCodigo("P001");
        dto1.setNombre("Libro A");
        dto1.setPrecio(1200.50);

        ProductoDTO dto2 = new ProductoDTO();
        dto2.setCodigo("P002");
        dto2.setNombre("Libro B");
        dto2.setPrecio(980.75);

        ProductoDTO dto3 = new ProductoDTO();
        dto3.setCodigo("P003");
        dto3.setNombre("Revista C");
        dto3.setPrecio(450.00);

        ProductoDTO dto4 = new ProductoDTO();
        dto4.setCodigo("P004");
        dto4.setNombre("Manual D");
        dto4.setPrecio(1500.00);

        ProductoDTO dto5 = new ProductoDTO();
        dto5.setCodigo("P005");
        dto5.setNombre("Enciclopedia E");
        dto5.setPrecio(3200.90);


        listaDTO.add(dto1);
        listaDTO.add(dto2);
        listaDTO.add(dto3);
        listaDTO.add(dto4);
        listaDTO.add(dto5);


        System.out.println("Lista de ProductoDTO:");
        for (ProductoDTO dto : listaDTO) {
            System.out.println(dto);
        }


        System.out.println("\nProductos originales:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}

