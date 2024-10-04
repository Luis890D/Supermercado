/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1;

import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class GestionInventario {

    private mnProducto productoManager;
    private mnCategoria categoriaManager;

    public GestionInventario() {
        productoManager = new mnProducto();
        categoriaManager = new mnCategoria();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("=== Gestión de Inventario ===");
            System.out.println("1. Gestión de productos");
            System.out.println("2. Gestión de categorías");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    gestionarProductos();
                    break;
                case "2":
                    gestionarCategorias();
                    break;
                case "3":
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

        } while (!opcion.equals("3"));
    }

    private void gestionarProductos() {
        productoManager.iniciar();
    }

    private void gestionarCategorias() {
        categoriaManager.iniciar();
    }
}
