package org.example;

public class Rectangulo extends Figura implements Dibujar {
    private double base;
    private double altura;

    public Rectangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
    @Override
    public double perimetro() {
        return base + base + altura + altura;
    }

}
