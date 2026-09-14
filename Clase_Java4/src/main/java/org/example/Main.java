package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        InstrumentoMusical[] IM = {new Guitarra(), new Piano(), new Bateria()};

        for (InstrumentoMusical InsM: IM ){
            InsM.tocar();
            InsM.afinar();
            System.out.println("############");
        }
    }
}
