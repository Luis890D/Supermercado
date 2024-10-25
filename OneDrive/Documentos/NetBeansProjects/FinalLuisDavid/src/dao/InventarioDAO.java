/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connection.DBConnection;
import modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

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

    public List<Producto> obtenerModificaciones() {
        List<Producto> productosModificados = new ArrayList<>();
        String sql = "SELECT p.*, c.nombre_categoria FROM Productos p "
                + "JOIN Categoria c ON p.id_categoria = c.id_categoria "
                + "WHERE p.existencias <> (SELECT existencias FROM Productos WHERE codigo = p.codigo)"; // Ajusta según tu lógica

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Producto producto = new Producto(
                        rs.getInt("idProducto"),
                        rs.getString("nombreProducto"),
                        rs.getInt("codigo"),
                        rs.getDouble("promocion"),
                        rs.getDouble("precio"),
                        rs.getInt("id_categoria"),
                        rs.getString("nombre_categoria") // Obtener el nombre de la categoría
                );
                producto.setExistencias(rs.getInt("existencias")); // Asignar existencias
                productosModificados.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener modificaciones: " + e.getMessage());
        }
        return productosModificados;
    }
}
