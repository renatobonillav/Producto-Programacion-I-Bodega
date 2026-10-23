package com.bodega.sistemabodega;

public class Producto {
    private static int totalproducto = 0;
    private String nombre;
    private String codigo;
    private String categoria;
    private double preciocompra;
    private double precioventa;
    private int stock;
    
    public Producto(String codigo, String nombre, String categoria, double preciocompra, double precioventa, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
        totalproducto++;
    }
    
    public Producto(String codigo, String nombre, String categoria, double preciocompra, double precioventa){
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        totalproducto ++;
    }
    
    public static int getTotalProductos(){
        return totalproducto;
    }
    
    public String getCodigo(){
        return codigo;    
    }
    
    public String getNombre() {
        return nombre;    
    }
    
    public String getCategoria() {
        return categoria;    
    }
    
    public double getPrecioCompra(){
        return preciocompra;    
    }
    
    public double getPrecioVenta(){
        return precioventa;    
    }
    
    public int getStock(){
        return stock;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCategoria(String categoria) {    
        this.categoria = categoria;
    }
    
    public void setPrecioCompra(double preciocompra) {
        if (preciocompra < 0){
            throw new IllegalArgumentException("PRECIO INVALIDO");
        }
        this.preciocompra = preciocompra;
    }
    
    public void setPrecioVenta(double precioventa) {
        if (precioventa < 0) {
            throw new IllegalArgumentException ("PRECIO INVALIDO");
        }
        this.precioventa = precioventa;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public boolean aumentarStock(int cantidad) {
        if (cantidad>0){
            this.stock +=cantidad;
            return true;
        }else {
            System.out.println("INGRESE UNA CANTIDAD VALIDA");
            return false;
        }
    }
    
    public boolean descontarStock(int cantidad) {
        if (cantidad<=0 || cantidad > this.stock) {
            return false;
        }
        this.stock -= cantidad;
        return true;
    }
}

