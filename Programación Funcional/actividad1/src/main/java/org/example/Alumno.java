package org.example;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Alumno {
    private String nombre;
    private double nota;
    private String curso;
}
