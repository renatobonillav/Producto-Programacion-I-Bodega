package com.bodega.sistemabodega;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class SistemaBodega {

    public static void main(String[] args) {
        String nombre;
        String categoria;
        double precioventa;
        double preciocompra;
        String codigo;
        int stock;
        
        JOptionPane.showMessageDialog(null, "BIENVENIDO AL MENU");
        int op;
        ArrayList<Producto> productos = new ArrayList<>();
        
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"QUE DESEAS REALIZAR\n"
                    + "1.Registrar Producto\n"
                    + "2.Consultar Lista de Productos\n"
                    + "3.Salir del Menu"));
                    //Bombilla yo me encargo a partir de aqui :D
                    
                    //En esta parte de aqui se hace el proceso de registro de 
            switch (op){
                case 1:
                    
                   nombre = JOptionPane.showInputDialog(null,"Ingresa el Nombre del Producto");
                   categoria = JOptionPane.showInputDialog(null, "Ingresa la Categoria del Producto");
                   codigo = JOptionPane.showInputDialog(null, "Ingresa el Codigo del Prodcuto");
                   preciocompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el Precio de Compra del Producto"));       
                   precioventa = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el Precio de Venta del Producto"));   
                   stock =  Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el Stock del Producto"));
                   
                           
                    
                   Producto p = new Producto(
                   codigo, nombre, categoria,
                   preciocompra, precioventa, stock);
                   
                   productos.add(p);
                   
                   JOptionPane.showMessageDialog(null, "PRODUCTO REGISTRADO EXITOSAMENTE");
                   
                   break; 
                   
                case 2:
                   if (productos.isEmpty()) {
                       JOptionPane.showMessageDialog(null, "No hay productos registrados");
                       
                   } else {
                       String ls = "";
                        for (Producto producto : productos) {
                            ls += "Código: " + producto.getCodigo()
                                + "\nNombre: " + producto.getNombre()
                                + "\nCategoría: " + producto.getCategoria()
                                + "\nPrecio de compra: S/ " + producto.getPrecioCompra()
                                + "\nPrecio de venta: S/ " + producto.getPrecioVenta()
                                + "\nStock: " + producto.getStock()
                                + "\n----------------------\n";
                        }

                        JOptionPane.showMessageDialog(null, ls);
                   }
                   break;  
                   
                case 3:
                   JOptionPane.showMessageDialog(null, "Saliendo...");
                   break; 
                
                default:
                    JOptionPane.showMessageDialog(null, "OPCION INVALIDA");
                    break; 
                    
            }
        
        
        } while (op !=3);
        
    }
}
//Ya acabe mano :V
//Diogo, no lo toques porfavor, esta funcionando :v