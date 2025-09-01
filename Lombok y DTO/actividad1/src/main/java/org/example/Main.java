package org.example;

public class Main {
    public static void main(String[] args) {


        Persona p1 = new Persona();
        p1.setNombre("Emanuel");
        p1.setEdad(25);

        Persona p2 = new Persona("Maria", 30);

        Persona p3 = new Persona();
        p3.setNombre("Juan");
        p3.setEdad(22);

        Persona p4 = new Persona("Carla", 28);


        System.out.println("Persona 1: " + p1.getNombre() + ", " + p1.getEdad());
        System.out.println("Persona 2: " + p2.getNombre() + ", " + p2.getEdad());
        System.out.println("Persona 3: " + p3.getNombre() + ", " + p3.getEdad());
        System.out.println("Persona 4: " + p4.getNombre() + ", " + p4.getEdad());
    }
}
