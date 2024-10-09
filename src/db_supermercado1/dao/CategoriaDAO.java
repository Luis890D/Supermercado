/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1.dao;

import db_supermercado1.DBConnection;
import db_supermercado1.modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class CategoriaDAO {

    Connection conn = DBConnection.getConnection();

    // Método para obtener la lista de categorías desde la base de datos
    public List<Categoria> getCategoria() {
        List<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM Categoria";

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int idCategoria = rs.getInt("id_categoria");
                String nombreCategoria = rs.getString("nombre_categoria");

                Categoria categoria = new Categoria(idCategoria, nombreCategoria);
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener las categorías: " + e.getMessage());
        }

        return categorias;
    }

    // Método para agregar una nueva categoría
    public void addCategoria(String nombreCategoria) {
        String sql = "INSERT INTO Categoria (nombre_categoria) VALUES (?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreCategoria);
            stmt.executeUpdate();
            System.out.println("Categoría agregada con éxito.");
        } catch (SQLException e) {
            System.out.println("Error al agregar la categoría: " + e.getMessage());
        }
    }

    // Método para actualizar una categoría
    public void actualizarCategoria(int idCategoria, String nuevoNombre) {
        String sql = "UPDATE Categoria SET nombre_categoria = ? WHERE id_categoria = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nuevoNombre);
            stmt.setInt(2, idCategoria);
            int filasActualizadas = stmt.executeUpdate();
            if (filasActualizadas > 0) {
                System.out.println("Categoría actualizada con éxito.");
            } else {
                System.out.println("No se encontró una categoría con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar la categoría: " + e.getMessage());
        }
    }

    // Método para eliminar una categoría
    public void eliminarCategoria(int idCategoria) {
        String sql = "DELETE FROM Categoria WHERE id_categoria = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCategoria);
            int filasEliminadas = stmt.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Categoría eliminada con éxito.");
            } else {
                System.out.println("No se encontró una categoría con ese ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar la categoría: " + e.getMessage());
        }
    }

    // Método para mostrar todas las categorías
    public void mostrarCategorias() {
        List<Categoria> categorias = getCategoria();

        System.out.println("Listado de Categorías:");
        for (Categoria categoria : categorias) {
            System.out.println(categoria.getIdCategoria() + ". " + categoria.getNombreCategoria());
        }
    }

    // Método para mostrar los productos asociados a una categoría específica
    public void mostrarProductosPorCategoria(int idCategoriaSeleccionada) {
        String sql = "SELECT p.nombre_producto, p.codigo, p.precio, p.promocion "
                + "FROM Productos p "
                + "WHERE p.id_categoria = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idCategoriaSeleccionada);
            try (ResultSet rs = stmt.executeQuery()) {
                System.out.println("Productos de la categoría seleccionada:");

                boolean tieneProductos = false;

                while (rs.next()) {
                    String nombreProducto = rs.getString("nombre_producto");
                    int codigo = rs.getInt("codigo");
                    double precio = rs.getDouble("precio");
                    double promocion = rs.getDouble("promocion");

                    System.out.println("- Producto: " + nombreProducto);
                    System.out.println("Código: " + codigo);
                    System.out.println("Precio: Q" + precio);
                    System.out.println("Promoción: Q" + promocion);
                    System.out.println(); // Línea en blanco para mejorar la legibilidad

                    tieneProductos = true;
                }

                if (!tieneProductos) {
                    System.out.println("No hay productos asignados a esta categoría.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los productos de la categoría: " + e.getMessage());
        }
    }

    // Método para iniciar el menú de gestión de categorías y productos
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("\n=== Gestión de Categorías ===");
            System.out.println("1. Mostrar categorías y productos");
            System.out.println("2. Agregar nueva categoría");
            System.out.println("3. Actualizar categoría");
            System.out.println("4. Eliminar categoría");
            System.out.println("5. Volver atrás");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    mostrarCategorias();

                    System.out.print("Selecciona el ID de la categoría que deseas ver: ");
                    int idCategoriaSeleccionada = scanner.nextInt();
                    scanner.nextLine();

                    mostrarProductosPorCategoria(idCategoriaSeleccionada);
                    break;

                case "2":
                    System.out.print("Ingresa el nombre de la nueva categoría: ");
                    String nombreCategoria = scanner.nextLine();
                    addCategoria(nombreCategoria);
                    break;

                case "3":
                    System.out.print("Ingresa el ID de la categoría que deseas actualizar: ");
                    int idCategoriaActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingresa el nuevo nombre para la categoría: ");
                    String nuevoNombre = scanner.nextLine();
                    actualizarCategoria(idCategoriaActualizar, nuevoNombre);
                    break;

                case "4":
                    System.out.print("Ingresa el ID de la categoría que deseas eliminar: ");
                    int idCategoriaEliminar = scanner.nextInt();
                    scanner.nextLine();
                    eliminarCategoria(idCategoriaEliminar);
                    break;

                case "5":
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

        } while (!opcion.equals("5"));
    }
}
