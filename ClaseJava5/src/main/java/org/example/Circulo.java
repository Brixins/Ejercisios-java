package org.example;

public class Circulo extends Figura implements Dibujar {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando un Circulo de radio "+ radio);
    }
}
