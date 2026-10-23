package com.bodega.sistemabodega;
import java.util.Scanner;


public class Venta {
    private int contadorventa = 0;
    private int numero;
    private String fecha;
    private String dnicliente;
    private String tipopago;
    private double total;
    private double ganancia;
    private double montopagado;
    
    public Venta(String fecha){
        this.fecha = fecha;
    }
    public Venta(String fecha, String dnicliente){
        this.fecha = fecha;
        this.dnicliente = dnicliente;
        
    }

    public int getContadorventa() {
        return contadorventa;
    }

    public int getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDnicliente() {
        return dnicliente;
    }

    public String getTipopago() {
        return tipopago;
    }

    public double getTotal() {
        return total;
    }

    public double getGanancia() {
        return ganancia;
    }

    public double getMontopagado() {
        return montopagado;
    }

    public void setFecha(String fecha) {
        
        this.fecha = fecha;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }
    public void agregarItem(double subtotal, double gananciaitem) {
        this.total += subtotal;
        this.ganancia += gananciaitem;
    }
    public boolean registrarPago(double monto) {
        if (monto >= total && total > 0) {
            this.montopagado = monto;
            return true;
        }
        return false;
    }
    
    public double calcularVuelto(){
        
        return this.montopagado - this.total;
    }
}
