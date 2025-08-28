package org.example;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Map<String, Curso> cursos = new HashMap<>();

        // 3. Agregar 10 cursos
        cursos.put("J101", new Curso("Java Básico", "Ana García"));
        cursos.put("P202", new Curso("Python Intermedio", "Luis Pérez"));
        cursos.put("D303", new Curso("Bases de Datos", "María López"));
        cursos.put("C404", new Curso("C++ Avanzado", "Carlos Ruiz"));
        cursos.put("W505", new Curso("Desarrollo Web", "Laura Fernández"));
        cursos.put("A606", new Curso("Algoritmos y Estructuras de Datos", "Ricardo Morales"));
        cursos.put("S707", new Curso("Seguridad Informática", "Sofía Mendoza"));
        cursos.put("N808", new Curso("Redes de Computadoras", "Javier Ramos"));
        cursos.put("M909", new Curso("Machine Learning", "Elena Domínguez"));
        cursos.put("R110", new Curso("React JS", "Pedro Jiménez"));



        String codigoBuscado = "M909";
        if (cursos.containsKey(codigoBuscado)) {
            Curso cursoRecuperado = cursos.get(codigoBuscado);
            System.out.println("Curso recuperado con la clave " + codigoBuscado + ": " + cursoRecuperado);
        } else {
            System.out.println("No se encontró el curso con el código " + codigoBuscado + ".");
        }

        for (Map.Entry<String, Curso> entrada : cursos.entrySet()) {
            System.out.println("Clave (código): " + entrada.getKey() + " -> " + "Valor (curso): " + entrada.getValue());
        }
    }
}