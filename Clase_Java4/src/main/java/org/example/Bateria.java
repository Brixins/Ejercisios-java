package org.example;

public class Bateria implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Bateria tocar");
    }
    @Override
    public void afinar(){
        System.out.println("Bateria afinar");
    }
}
