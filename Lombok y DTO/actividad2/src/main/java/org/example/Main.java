package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = Usuario.builder()
                .id(1)
                .nombre("Emanuel Perez")
                .email("emanuel@example.com")
                .build();

        Usuario u2 = Usuario.builder()
                .id(2)
                .nombre("María Lopez")
                .email("maria.lopez@example.com")
                .build();

        Usuario u3 = Usuario.builder()
                .id(3)
                .nombre("Juan Gomez")
                .email("juan.gomez@example.com")
                .build();


        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
