package org.example;

public class Guitarra implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Guitarra tocar");
    }
    @Override
    public void afinar(){
        System.out.println("Guitarra afinar");
    }
}
