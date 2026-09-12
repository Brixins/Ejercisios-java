package org.example;

public class Viaje {
    public void iniciarViaje(Vehiculo vehiculo){
        vehiculo.arrancar();
        vehiculo.detener();
        vehiculo.combustible();
    }
}
