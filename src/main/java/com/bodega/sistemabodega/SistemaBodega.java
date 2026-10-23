package com.bodega.sistemabodega;

import java.util.Scanner;
import java.util.ArrayList;

public class SistemaBodega {

    public static void main(String[] args) {
        String nombre;
        String categoria;
        double precioventa;
        double preciocompra;
        String codigo;
        int stock;

        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENIDO AL MENU");

        int op;
        ArrayList<Producto> productos = new ArrayList<>();

        do {
            System.out.println("\nQUE DESEAS REALIZAR");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Consultar Lista de Productos");
            System.out.println("3. Salir del Menu");
            System.out.print("Selecciona una opcion: ");

            op = Integer.parseInt(sc.nextLine());

            // Bombilla yo me encargo a partir de aqui :D

            // En esta parte se hace el proceso de registro
            switch (op) {

                case 1:

                    System.out.print(
                        "Ingresa el Nombre del Producto: "
                    );
                    nombre = sc.nextLine();

                    System.out.print(
                        "Ingresa la Categoria del Producto: "
                    );
                    categoria = sc.nextLine();

                    System.out.print(
                        "Ingresa el Codigo del Producto: "
                    );
                    codigo = sc.nextLine();

                    System.out.print(
                        "Ingresa el Precio de Compra del Producto: "
                    );
                    preciocompra =
                        Double.parseDouble(sc.nextLine());

                    System.out.print(
                        "Ingresa el Precio de Venta del Producto: "
                    );
                    precioventa =
                        Double.parseDouble(sc.nextLine());

                    System.out.print(
                        "Ingresa el Stock del Producto: "
                    );
                    stock = Integer.parseInt(sc.nextLine());

                    Producto p = new Producto(
                        codigo, nombre, categoria,
                        preciocompra, precioventa, stock
                    );

                    productos.add(p);

                    System.out.println(
                        "PRODUCTO REGISTRADO EXITOSAMENTE"
                    );

                    break;

                case 2:

                    if (productos.isEmpty()) {
                        System.out.println(
                            "No hay productos registrados"
                        );

                    } else {
                        String ls = "";

                        for (Producto producto : productos) {
                            ls += "Codigo: " + producto.getCodigo()
                                + "\nNombre: " + producto.getNombre()
                                + "\nCategoria: "
                                + producto.getCategoria()
                                + "\nPrecio de compra: S/ "
                                + producto.getPrecioCompra()
                                + "\nPrecio de venta: S/ "
                                + producto.getPrecioVenta()
                                + "\nStock: " + producto.getStock()
                                + "\n----------------------\n";
                        }

                        System.out.println("\n" + ls);
                    }

                    break;

                case 3:

                    System.out.println("Saliendo...");

                    break;

                default:

                    System.out.println("OPCION INVALIDA");

                    break;
            }

        } while (op != 3);

        sc.close();
    }
}

// Ya acabe mano :V
// Diogo, no lo toques porfavor, esta funcionando :v



//UPDATE: No vi el silabo y  tuve que cambiar el JOptionPane por consola