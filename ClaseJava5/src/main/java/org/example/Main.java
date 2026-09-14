package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Figura[] fig = {
                new Circulo(0),
                new Rectangulo(0,0),
                new Triangulo(0,0),
        };

        try {
            System.out.println("Digite el radio del circulo: ");
            double radio = sc.nextDouble();
            ((Circulo) fig[0]).setRadio(radio);

            System.out.print("Digite la base del rectángulo: ");
            double baseR = sc.nextDouble();
            System.out.print("Digite la altura del rectángulo: ");
            double alturaR = sc.nextDouble();
            ((Rectangulo) fig[1]).setBase(baseR);
            ((Rectangulo) fig[1]).setAltura(alturaR);

            System.out.print("Digite la base del triángulo: ");
            double baseT = sc.nextDouble();
            System.out.print("Digite la altura del triángulo: ");
            double alturaT = sc.nextDouble();
            ((Triangulo) fig[2]).setBase(baseT);
            ((Triangulo) fig[2]).setAltura(alturaT);

            System.out.println("\n--- RESULTADOS ---");
            for (Figura f : fig) {
                ((Dibujar) f).Dibujar();
                System.out.println("Área: " + f.area());
                System.out.println("Perímetro: " + f.perimetro());
                System.out.println("-------------------");
            }

        } catch (Exception e) {
            System.out.println("Error: Ingrese numeros correctamente");;
        }
        sc.close();
    }
}
