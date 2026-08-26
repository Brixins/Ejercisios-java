package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new  Scanner(System.in);
        Libro[] libros = new Libro[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el titulo del libro "+ (i+1));
            String titulo = sc.nextLine();
            sc.nextLine();
            System.out.println("Introduce el autor del libro "+ (i+1) );
            String autor = sc.nextLine();
            sc.nextLine();
            System.out.println("Introduce el año del libro "+ (i+1) );
            int anioDePublicacion = sc.nextInt();
            sc.nextLine();

            libros[i] = new Libro(titulo, autor, anioDePublicacion);
            System.out.println();
        }
        for (int i = 0; i < 5; i++) {
            libros[i].mostrarinformacion();
        }
    }
}
