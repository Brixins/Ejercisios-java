package org.example;

public class Piano implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Del piano sale musica");
    }
    @Override
    public void afinar() {
        System.out.println("Se afina el piano");
    }
}
