package org.example;

public class Rectangulo extends Figura implements Dibujar {
    private double base;
    private double altura;

    public Rectangulo (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return base * altura;
    }
    @Override
    public double perimetro() {

        return base + base + altura + altura;
    }
    public void Dibujar() {
        System.out.println("Dibujando un rectangulo de base " + base + "\nY altura " + altura);
    }

}
