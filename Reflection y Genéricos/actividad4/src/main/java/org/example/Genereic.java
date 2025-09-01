package org.example;

import java.util.List;

public class Genereic {
    public static <T> void imprimirLista(List<T> lista){
        for(T elemento: lista){
            System.out.println(elemento);
        }
    }
}
