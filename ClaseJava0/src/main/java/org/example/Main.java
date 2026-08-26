package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite el segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite el tercer numero: ");
        int num3 = sc.nextInt();

        process process = new process(num1,num2,num3);
        System.out.println("La suma de los numeros es: "+process.suma());
        System.out.println("La media de los numeros es: "+process.avgerage());
        System.out.println("El numero mayor es: "+process.mayor());

    }
}
