package com.bodega.sistemabodega;
import java.util.Scanner;



public class Boleta {
    private int numeroventa;
    private String codigoproducto;
    private int cantidad;
    private double preciounitario;
    private double costounitario;
    
    static Scanner sc = new Scanner(System.in);
    public Boleta(int numeroventa, String codigoproducto, int cantidad, double preciounitario, double costounitario){
        this.numeroventa = numeroventa;
        this.codigoproducto = codigoproducto;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.costounitario = costounitario;
        
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

    public double getCostounitario() {
        return costounitario;
    }
    
    public void setCantidad(int cantidad) {
        System.out.println("INGRESA LA CANTIDAD VENDIDA");
        cantidad = sc.nextInt();
        this.cantidad = cantidad;
        
    }
    public double calcularSubtotal(){
        
        return this.cantidad * this.costounitario;
        
    }
    
    public double calcularGanancia() {
        return cantidad * (preciounitario - costounitario);
    }
}
