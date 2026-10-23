package com.bodega.sistemabodega;

public class Boleta {
    private int numeroventa;
    private String codigoproducto;
    private int cantidad;
    private double preciounitario;

    public Boleta(int numeroventa, String codigoproducto, int cantidad, double preciounitario, double costounitario){
        this.numeroventa = numeroventa;
        this.codigoproducto = codigoproducto;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;        
    }

    public int getNumeroventa() {
        return numeroventa;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setCantidad(int cantidad) {
        System.out.println("INGRESA LA CANTIDAD VENDIDA");
        this.cantidad = cantidad;
    }

    public double calcularSubtotal(){
        return this.cantidad * this.preciounitario;
    }
}
