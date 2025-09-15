package org.example;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private double stock;
}
