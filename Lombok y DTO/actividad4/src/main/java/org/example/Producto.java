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
    private String proveedor;
    private double precio;
}
