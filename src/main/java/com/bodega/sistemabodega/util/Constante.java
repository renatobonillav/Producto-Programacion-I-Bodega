/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bodega.sistemabodega.util;

/**
 *
 * @author Lerovix
 */
public class Constante {
    
    //esto de aca es para que no se puedan cambiar los datos desde otro lado, sean serios y tampoco creen setters o getters
    private Constante(){}
    
        //Constantes de impuestos
        public static final double IGV = 0.18;
        
        //codigos de la sunat
        public static final String Serie_Boleta = "B001";
        public static final String Serie_Factura = "F001"; // esto es por si se llega a necesitar
        
        //Tipos de pago
        public static final String Tipo_Efectivo = "EFECTIVO";
        public static final String Tipo_Tarjeta = "TARJETA"; //desconosco si lo usan si alguien lo ve innecesario lo borra
        public static final String Tipo_Yape = "YAPE";
        public static final String Tipo_Plin = "PLIN";
        
        //estados
        public static final String Estado_Activo = "ACTIVO";
        public static final String Estado_Inactivo = "INACTIVO";
        
    
    
    
    
    
    
    
    
    
}
