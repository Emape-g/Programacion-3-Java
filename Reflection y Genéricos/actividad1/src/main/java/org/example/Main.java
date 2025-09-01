package org.example;

import java.lang.reflect.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Class<?> clasePersona = Persona.class;


        Constructor<?> constructorConArgs = clasePersona.getConstructor(String.class, int.class);


        Object persona1 = constructorConArgs.newInstance("Emanuel", 25);
        Object persona2 = constructorConArgs.newInstance("Ana", 30);
        Object persona3 = constructorConArgs.newInstance("Luis", 22);
        Object persona4 = constructorConArgs.newInstance("Marta", 28);

        Method metodoSaludar = clasePersona.getMethod("saludar");

        Field campoNombre = clasePersona.getDeclaredField("nombre");
        campoNombre.setAccessible(true);
        System.out.println("Saludando a las personas:");
        metodoSaludar.invoke(persona1);
        metodoSaludar.invoke(persona2);
        metodoSaludar.invoke(persona3);
        metodoSaludar.invoke(persona4);

        campoNombre.set(persona1, "Juan");
        campoNombre.set(persona2, "Lucía");
        campoNombre.set(persona3, "Carlos");
        campoNombre.set(persona4, "Sofía");




        System.out.println("Saludando a las personas:");
        metodoSaludar.invoke(persona1);
        metodoSaludar.invoke(persona2);
        metodoSaludar.invoke(persona3);
        metodoSaludar.invoke(persona4);
    }
}