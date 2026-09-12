package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);

        int op = 1;
        int totales = 0;

        while (op == 1) {

            System.out.println("Por favor digite el nombre del cliente");
            String clienteg = sc.nextLine();
            Cliente client = new Cliente(clienteg);

            System.out.println("¿Qué producto quiere llevar el cliente?");
            String nombre = sc.nextLine();

            System.out.println("¿Cuantos productos quiere llevar el cliente?");
            int cantidad = sc.nextInt();

            System.out.println("¿Cual es el precio del producto?");
            double precio = sc.nextDouble();sc.nextLine();

            Producto producto = new Producto(precio, nombre);
            Venta venta = new Venta(client, producto, cantidad);


            System.out.println("\n--- Resumen de Venta ---");
            System.out.println("Cliente: " + client.nombreCl);
            System.out.println("Producto: " + producto.nombreP);
            System.out.println("Total a pagar: $" + venta.total());
            System.out.println("------------------------\n");

            System.out.println("¿Quiere que vender más? \n 1.Si \n 2.No");
            op = sc.nextInt();

            totales = totales + 1;

        }

        System.out.println("Ventas totales: " + totales);
    }
}

