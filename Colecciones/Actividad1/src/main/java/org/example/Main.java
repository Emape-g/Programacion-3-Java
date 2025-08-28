package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Alumno> alumnos= new ArrayList<>();

        Alumno a1 = new Alumno("Marcos",10);
        Alumno a2 = new Alumno("Emanuel",10);
        Alumno a3 = new Alumno("Martin",8);
        Alumno a4 = new Alumno("Andy",9);
        Alumno a5 = new Alumno("Santi",7);
        Alumno a6 = new Alumno("Momi",6);

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        alumnos.add(a6);

        for(Alumno a: alumnos){
            System.out.println(a);
        }

    }
}