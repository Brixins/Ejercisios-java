package org.example;

public class Guitarra implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("De la guitarra sale musica");
    }
    @Override
    public void afinar() {
        System.out.println("Se afina la guitarra");
    }
}
