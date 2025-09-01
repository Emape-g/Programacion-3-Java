package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private String autor;
}
