import org.example.Genereic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(4);
        listaEnteros.add(5);
        listaEnteros.add(6);
        listaEnteros.add(7);
        listaEnteros.add(8);
        listaEnteros.add(9);
        listaEnteros.add(10);


        List<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Java");


        System.out.println("Lista de enteros:");
        Genereic.imprimirLista(listaEnteros);

        System.out.println("\nLista de cadenas:");
        Genereic.imprimirLista(listaCadenas);
    }
}
