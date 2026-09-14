package org.example;

public class Triangulo extends Figura implements Dibujar {
    private double altura;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void Dibujar() {
        System.out.println("Dibujando un triangulo de base "+ base +" \nY de altura "+altura);
    }

    @Override
    public double area() {
        return (base * altura)/2;
    }

    @Override
    public double perimetro() {
        return altura + altura + base;
    }
}
