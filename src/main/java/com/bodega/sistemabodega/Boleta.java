package com.bodega.sistemabodega;

public class Boleta {
    private int numeroventa;
    final String codigo="B001";
    private String fechaB;
    private String numeroB;
    private String codigoproducto;
    private int cantidad;
    private double preciounitario;
    
    private static int contador =0;

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
    
    //Genera un codigo de boleta automatico
    public void generarBoleta(String fecha){
        contador++;
        
        this.fechaB=fecha;
        this.numeroB= String.format("%04d", contador);
        
        System.out.println(codigo+"-"+fechaB+"-"+numeroB);
    }
    
    public double calcularSubtotal(){
        return this.cantidad * this.preciounitario;
    }
}
