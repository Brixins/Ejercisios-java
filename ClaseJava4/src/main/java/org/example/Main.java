package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[]{ new Guitarra(), new Piano(), new Bateria()};

        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.afinar();
            instrumento.tocar();
            System.out.println("##################");
        }
    }
}
