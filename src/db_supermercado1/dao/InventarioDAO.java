/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1.dao;

import db_supermercado1.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class InventarioDAO {

    Connection conn = DBConnection.getConnection();
    EmpleadoDAO empleadoDAO = new EmpleadoDAO(); // Instancia de EmpleadoDAO
    CategoriaDAO categoriaDAO = new CategoriaDAO(); // Instancia de CategoriaDAO

    // Método para agregar un nuevo registro en el inventario
    public void agregarRegistro(int idCategoria, String descripcion, int idEmpleado) {
        // Verifica si el empleado existe
        if (empleadoDAO.getAllEmpleados().stream().noneMatch(emp -> emp.getIdEmpleado() == idEmpleado)) {
            System.out.println("Empleado no encontrado.");
            return;
        }

        String sql = "INSERT INTO Inventario (id_categoria, descripcion, fecha, id_empleado) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idCategoria);
            pstmt.setString(2, descripcion);
            pstmt.setTimestamp(3, new Timestamp(System.currentTimeMillis())); // Fecha y hora actual
            pstmt.setInt(4, idEmpleado);
            pstmt.executeUpdate();
            System.out.println("Registro de inventario agregado con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al agregar el registro: " + e.getMessage());
        }
    }

    // Método para mostrar registros del inventario
    public void mostrarInventario() {
        String sql = "SELECT * FROM Inventario";
        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            System.out.println("Listado de Registros de Inventario:");
            while (rs.next()) {
                int idInventario = rs.getInt("id_inventario");
                int idCategoria = rs.getInt("id_categoria");
                String descripcion = rs.getString("descripcion");
                Timestamp fecha = rs.getTimestamp("fecha");
                int idEmpleado = rs.getInt("id_empleado");

                System.out.println("ID: " + idInventario + ", Categoría: " + idCategoria
                        + ", Descripción: " + descripcion + ", Fecha: " + fecha + ", Empleado ID: " + idEmpleado);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar el inventario: " + e.getMessage());
        }
    }

    // Método para mostrar categorías
    public void mostrarCategorias() {
        categoriaDAO.mostrarCategorias(); // Usar el método de CategoriaDAO
    }

    // Método para iniciar el menú de gestión de inventario
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestión de Inventario ===");
            System.out.println("1. Agregar registro de inventario");
            System.out.println("2. Mostrar registros de inventario");
            System.out.println("3. Mostrar categorías");
            System.out.println("4. Volver atrás");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ID de la categoría: ");
                    int idCategoria = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingresa la descripción: ");
                    String descripcion = scanner.nextLine();
                    System.out.print("Ingresa el ID del empleado: ");
                    int idEmpleado = scanner.nextInt();
                    agregarRegistro(idCategoria, descripcion, idEmpleado);
                    break;

                case 2:
                    mostrarInventario();
                    break;

                case 3:
                    mostrarCategorias();
                    break;

                case 4:
                    System.out.println("Volviendo atrás...");
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
            }
        } while (opcion != 4);
    }
}
