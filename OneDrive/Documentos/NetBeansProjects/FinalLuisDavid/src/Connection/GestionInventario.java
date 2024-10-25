///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package appSuperMercado;
//
//import appSuperMercado.dao.CategoriaDAO;
//import appSuperMercado.dao.ProductoDAO;
//import java.util.Scanner;
//
///**
// *
// * @author luisd
// */
//public class GestionInventario {
//
//    private ProductoDAO productoDAO;
//    private CategoriaDAO categoriaDAO;
//
//    public GestionInventario() {
//        productoDAO = new ProductoDAO();  // Utiliza ProductoDAO
//        categoriaDAO = new CategoriaDAO();  // Utiliza CategoriaDAO
//    }
//
//    public void iniciar() {
//        Scanner scanner = new Scanner(System.in);
//        String opcion;
//
//        do {
//            System.out.println("=== Gestión de Inventario ===");
//            System.out.println("1. Gestión de productos");
//            System.out.println("2. Gestión de categorías");
//            System.out.println("3. Salir");
//            System.out.print("Selecciona una opción: ");
//            opcion = scanner.nextLine();
//
//            switch (opcion) {
//                case "1":
//                    gestionarProductos();
//                    break;
//                case "2":
//                    gestionarCategorias();
//                    break;
//                case "3":
//                    System.out.println("Saliendo del sistema...");
//                    break;
//                default:
//                    System.out.println("Opción no válida. Intenta nuevamente.");
//            }
//
//        } while (!opcion.equals("3"));
//    }
//
//    private void gestionarProductos() {
//        productoDAO.iniciar();
//    }
//
//    private void gestionarCategorias() {
//        categoriaDAO.iniciar();
//    }
//}
