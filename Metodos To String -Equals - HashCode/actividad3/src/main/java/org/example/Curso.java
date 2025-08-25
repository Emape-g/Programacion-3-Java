package org.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Estudiante> listaDeEstudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listaDeEstudiantes = new ArrayList<>();
    }
    public Curso(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaDeEstudiantes() {
        return listaDeEstudiantes;
    }

    public void setListaDeEstudiantes(List<Estudiante> listaDeEstudiantes) {
        this.listaDeEstudiantes = listaDeEstudiantes;
    }
    public void agregarEstudiante(Estudiante estudiante) {
        this.listaDeEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Curso: " +
                " nombre: " + nombre + '\'' +
                ", listaDeEstudiantes :" + listaDeEstudiantes ;
    }
}
