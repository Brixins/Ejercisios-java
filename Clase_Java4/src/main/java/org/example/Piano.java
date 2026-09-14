package org.example;

public class Piano implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Piano tocar");
    }
    @Override
    public void afinar(){
        System.out.println("Piano afinar");
    }
}
