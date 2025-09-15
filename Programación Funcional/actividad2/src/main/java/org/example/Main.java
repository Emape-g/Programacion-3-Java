package org.example;

import java.util.*;
import java.util.stream.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Producto p1 = new Producto("Celular","Tecnología",150,13);
        Producto p2 = new Producto("Notebook","Tecnología",250,10);
        Producto p3 = new Producto("Auriculares","Tecnología",100,16);
        Producto p4 = new Producto("Remera","Indumentaria",30,20);
        Producto p5 = new Producto("Buzo","Indumentaria",80,30);
        Producto p6 = new Producto("Pantalon","Indumentaria",60,30);
        Producto p7 = new Producto("Protector Solar","Belleza y Cuidado personal",17,12);
        Producto p8 = new Producto("Crema Facial","Belleza y Cuidado personal",34,11);
        Producto p9 = new Producto("Crema para cuerpo","Belleza y Cuidado personal",40,20);
        Producto p10 = new Producto("Hidrolavadora","Herramientas",90,5);
        Producto p11 = new Producto("Soldadora","Herramientas",190,3);
        Producto p12 = new Producto("Taladro","Herramientas",150,8);


        List<Producto> productos=new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        productos.add(p9);
        productos.add(p10);

        System.out.println("Productos con precio mayor de 100");

        List<Producto> productosCaros = productos.stream()
                .filter(p-> p.getPrecio()>=100)
                .sorted(Comparator.comparing(Producto::getPrecio).reversed())
                        .toList();

        productosCaros.stream()
                .forEach(System.out::println);

        System.out.println("Productos por categoria y su stock total");
        Map<String,Double> productosPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria,Collectors.summingDouble(Producto::getStock)) );

        System.out.println(productosPorCategoria);

        String productosConStock = productos.stream()
                .map(p-> p.getNombre()+ " , "+ p.getPrecio())
                .collect(Collectors.joining("\n"));
        System.out.println(productosConStock);

        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);

        System.out.println(promedioGeneral);

        Map<String,Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria,Collectors.averagingDouble(Producto::getPrecio)));

        System.out.println(promedioPorCategoria);
    }
}