package org.example;

public class Bateria implements InstrumentoMusical{
    @Override
    public void afinar() {
        System.out.println("Se afina la bateria");
    }

    @Override
    public void tocar() {
        System.out.println("Suena la bateria");
    }
}
