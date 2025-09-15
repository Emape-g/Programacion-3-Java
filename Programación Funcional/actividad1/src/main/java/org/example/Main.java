package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.stream.*;


public class Main {
    public static void main(String[] args) {


        Alumno a1 = new Alumno("Marcos",9,"Programacion2");
        Alumno a2 = new Alumno("Martin",8,"Programacion4");
        Alumno a3 = new Alumno("Andres",7,"Programacion3");
        Alumno a4 = new Alumno("Emanuel",6,"Programacion4");
        Alumno a5 = new Alumno("Matias",10,"Programacion2");
        Alumno a6 = new Alumno("Melisa",4,"Programacion4");
        Alumno a7 = new Alumno("Mercedes",9,"Programacion3");
        Alumno a8 = new Alumno("Ramon",10,"Programacion1");
        Alumno a9 = new Alumno("Paula",9,"Programacion1");
        Alumno a10 = new Alumno("Laura",9,"Programacion3");

        List<Alumno> alumnos = new ArrayList();

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);
        alumnos.add(a7);
        alumnos.add(a8);
        alumnos.add(a9);
        alumnos.add(a10);

        alumnos.stream()
                .filter(a -> a.getNota()>= 7)
                .map(Alumno::getNombre)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        double promedio = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0);

        System.out.println("El promedio de Notas es "+ promedio);


        Map<String,List<Alumno>>  alumnosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));

        System.out.println("Los alumnos por curso son "+ alumnosPorCurso);

        Map<String, Double> promedioPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(
                        Alumno::getCurso,
                        Collectors.averagingDouble(Alumno::getNota)

                ));

        System.out.println("Promedio por curso "+promedioPorCurso);

        promedioPorCurso.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .limit(3)
                .forEach(System.out::println);






    }
}