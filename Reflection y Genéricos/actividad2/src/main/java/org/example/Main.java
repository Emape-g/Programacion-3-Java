package org.example;


import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Caja<Integer>  cajaInteger = new Caja<Integer>(5);
            Caja<String> cajaString = new Caja<String>("HOLA MUNDO");

        System.out.println(cajaInteger);
        System.out.println(cajaString);

        List lista = new ArrayList();
        lista.add(10);
        lista.add("Textoo");
        lista.add(3.14);
        lista.add(true);

        System.out.println("Lista "+ lista);

    }
}