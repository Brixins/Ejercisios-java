package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Carro();
        Vehiculo moto = new Moto();
        Vehiculo bicicleta = new Bicicleta();
        Vehiculo[] vehiculo = new Vehiculo[] {auto,moto,bicicleta};
        Viaje viaje = new Viaje();


        for (int i = 0; i < vehiculo.length; i++) {
            viaje.iniciarViaje(vehiculo[i]);
            System.out.println("--------------------------");
        }


    }
}