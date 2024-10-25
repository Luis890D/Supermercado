/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connection.DBConnection;
import modelo.Categoria;
import modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class InventarioDAO {

    Connection conn = DBConnection.getConnection();
    private ProductoDAO productoDAO = new ProductoDAO();
    private CategoriaDAO categoriaDAO = new CategoriaDAO();
    private EmpleadoDAO empleadoDAO = new EmpleadoDAO();

    public void mostrarInventario() {
        System.out.println("=== Inventario ===");
        List<Categoria> categorias = categoriaDAO.getCategoria();

        for (Categoria categoria : categorias) {
            int totalProductos = contarProductosPorCategoria(categoria.getIdCategoria());
            int totalExistencias = contarExistenciasPorCategoria(categoria.getIdCategoria()); // Nueva línea para contar existencias
            System.out.printf("Categoría: %s, Total de productos: %d, Total de existencias: %d%n",
                    categoria.getNombreCategoria(), totalProductos, totalExistencias);
        }
    }

    private int contarExistenciasPorCategoria(int idCategoria) {
        String sql = "SELECT SUM(existencias) FROM Productos WHERE id_categoria = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCategoria);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al contar existencias: " + e.getMessage());
        }
        return 0;
    }

    private int contarProductosPorCategoria(int idCategoria) {
        String sql = "SELECT COUNT(*) FROM Productos WHERE id_categoria = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCategoria);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Error al contar productos: " + e.getMessage());
        }
        return 0;
    }

//    public void agregarProducto(String nombreProducto, int codigo, double promocion, double precio, int idCategoria) {
//        productoDAO.addProducto(nombreProducto, codigo, promocion, precio, idCategoria);
//    }

    public void actualizarExistencia(int codigoProducto, int cantidad, String usuario, String motivo, boolean aumentar) {
        if (!productoDAO.productoExiste(codigoProducto)) {
            System.out.println("No se encontró el producto con el código especificado.");
            return;
        }

        String sql = "UPDATE Productos SET existencias = existencias " + (aumentar ? "+" : "-") + " ? WHERE codigo = ?";
        System.out.printf("Consulta SQL: %s, Cantidad: %d, Código Producto: %d%n", sql, cantidad, codigoProducto); // Debug

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cantidad);
            stmt.setInt(2, codigoProducto);

            int rowsUpdated = stmt.executeUpdate();
            System.out.printf("Filas actualizadas: %d%n", rowsUpdated); // Debug
            if (rowsUpdated > 0) {
                System.out.println("Existencias actualizadas con éxito!");
                System.out.printf("Usuario: %s, Motivo: %s, Cantidad %s: %d%n", usuario, motivo, aumentar ? "aumentada" : "disminuida", cantidad);
            } else {
                System.out.println("No se encontró el producto con el código especificado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar existencias: " + e.getMessage());
        }
    }

    public void eliminarProducto(int codigoProducto) {
        productoDAO.deleteProducto(codigoProducto);
    }

    // Método para iniciar la interacción del usuario
   /* public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n=== Gestión de Inventario ===");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Actualizar existencias");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Volver atrás");
            System.out.print("Selecciona una opción: ");

            opcion = obtenerOpcion(scanner); // Método para obtener la opción

            switch (opcion) {
                case 1:
                    mostrarInventario();
                    break;

                case 2:
                    agregarProducto(scanner);
                    break;

                case 3:
                    actualizarExistencias(scanner);
                    break;

                case 4:
                    eliminarProducto(scanner);
                    break;

                case 5:
                    System.out.println("Volviendo atrás...");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }
        } while (opcion != 5);
    }

    private int obtenerOpcion(Scanner scanner) {
        while (true) {
            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir nueva línea
                return opcion;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }

    private void agregarProducto(Scanner scanner) {
        System.out.print("Ingresa el nombre del producto: ");
        String nombreProducto = scanner.nextLine();
        System.out.print("Ingresa el código del producto: ");
        int codigo = obtenerNumero(scanner);
        System.out.print("Ingresa el precio del producto: ");
        double precio = obtenerDecimal(scanner);
        System.out.print("Ingresa la promoción del producto: ");
        double promocion = obtenerDecimal(scanner);
        System.out.print("Ingresa el id de la categoría: ");
        int idCategoria = obtenerNumero(scanner);
//        agregarProducto(nombreProducto, codigo, promocion, precio, idCategoria);
    }

    private void actualizarExistencias(Scanner scanner) {
        System.out.print("Ingresa el código del empleado: ");
        String codigoEmpleado = scanner.nextLine();
        Empleado empleado = empleadoDAO.getEmpleadoByCodigo(codigoEmpleado);

        if (empleado == null) {
            System.out.println("No se encontró un empleado con el código ingresado.");
            return;
        }

        System.out.print("Ingresa el código del producto a actualizar existencias: ");
        int codigoProducto = obtenerNumero(scanner);
        System.out.print("Ingresa la cantidad a actualizar (puede ser negativa para reducir): ");
        int cantidad = obtenerNumero(scanner);
        scanner.nextLine();
        System.out.print("Ingresa el motivo de la actualización: ");
        String motivo = scanner.nextLine();

        // Actualizar existencias usando el nombre del empleado
        actualizarExistencia(codigoProducto, cantidad, empleado.getNombreEmpleado(), motivo, cantidad > 0);
    }

    private void eliminarProducto(Scanner scanner) {
        System.out.print("Ingresa el código del producto a eliminar: ");
        int codigoProducto = obtenerNumero(scanner);

        // Confirmar eliminación
        System.out.print("¿Estás seguro de que deseas eliminar el producto con el código " + codigoProducto + "? (s/n): ");
        String confirmacion = scanner.nextLine();

        if (confirmacion.equalsIgnoreCase("s")) {
            eliminarProducto(codigoProducto);
        } else {
            System.out.println("Eliminación cancelada.");
        }
    }

    private int obtenerNumero(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }

    private double obtenerDecimal(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, ingresa un número decimal.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }*/
}
