package com.bodega.sistemabodega;

public class Venta {
    private int contadorventa = 0;
    private int numero;
    private String dnicliente;
    private String tipopago;
    private double total;
    private double ganancia;
    private double montopagado;
    
    public Venta(String dnicliente){
        this.dnicliente = dnicliente;
    }

    public int getContadorventa() {
        return contadorventa;
    }

    public int getNumero() {
        return numero;
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
