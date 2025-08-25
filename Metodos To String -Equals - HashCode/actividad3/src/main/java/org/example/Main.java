package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Estudiante juan = new Estudiante("Juan", 20, "Ingeniería en Sistemas");
        Estudiante maria = new Estudiante("María", 22, "Tecnicatura en Programacion");
        Estudiante pedro = new Estudiante("Pedro", 21, "Ingenería en Sistemas");        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
            Curso Programacion = new Curso("Programacion 3");
            Curso BasedeDatos = new Curso("Base de datos");

            Programacion.agregarEstudiante(juan);
            Programacion.agregarEstudiante(maria);
            BasedeDatos.agregarEstudiante(pedro);

        System.out.println(Programacion);
        System.out.println(BasedeDatos);
    }
}