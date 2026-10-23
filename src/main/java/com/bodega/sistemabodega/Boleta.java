package com.bodega.sistemabodega;

public class Boleta {
    private int numeroventa;
    private String fechaB;
    private String numeroB;
    private String codigoproducto;
    private int cantidad;
    private double preciounitario;
    
    
    // Nuevo contador para cada boleta creada pero falta poner en
    // formato para la SUNAT xd
    private static final String CODIGO_BOLETA = "B001";
    private String codigo;
    private static int contador = 0;

    public Boleta(int numeroventa, String codigoproducto, int cantidad, double preciounitario, double costounitario){
        this.numeroventa = numeroventa;
        this.codigoproducto = codigoproducto;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.codigo = "N-" + contador;
        contador++;
    }
    
    public String getCodigoBoleta() {
        return codigo;
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
        
        System.out.println(codigo + "-"+fechaB+"-"+numeroB);
    }
    
    public double calcularSubtotal(){
        return this.cantidad * this.preciounitario;
    }
}
