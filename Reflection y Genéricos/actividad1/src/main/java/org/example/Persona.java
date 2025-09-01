package org.example;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona {
    private String nombre;
    private int edad;

    public void saludar(){
        System.out.println("Hola soy "+ nombre+" y tengo "+edad+" años");
    }
}
