package com.bodega.sistemabodega;

public class Cliente {
    private final String DNI;
    private String nombre;
    private String telefono;
    
    public Cliente(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }
    
    public Cliente(String DNI, String nombre, String telefono) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public boolean validarDNI(String DNI) {
        return true;
    }
    
    public String getDNI() {
        return DNI;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
