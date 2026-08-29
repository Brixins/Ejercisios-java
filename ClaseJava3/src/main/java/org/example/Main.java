package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculo = {
                new Carro(),
                new Moto(),
                new Bicicleta()};
        Viaje viaje = new Viaje();


        for (int i = 0; i < vehiculo.length; i++) {
            viaje.iniciarViaje(vehiculo[i]);
            System.out.println("--------------------------");
        }


    }
}