package com.edu.uce.negocio;

public class Pedido {

    private String cliente;
    private String producto;
    private double total;
    private String correo;
    private String int numero;

    public Pedido() {
    }

    public Pedido(String cliente, String producto, double total, String correo int numero) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
        this.correo = correo;
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
