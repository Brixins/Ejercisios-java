package org.example;

public class Venta {
    public Cliente cliente;
    public Producto producto;
    public double cantidad;

    public Venta(Cliente cliente, Producto producto, double cantidad ){
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;


    }

    public double total (){
        return cantidad * producto.precio;
    }


}
