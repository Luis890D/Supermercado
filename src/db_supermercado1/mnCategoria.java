/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class mnCategoria {

    Connection conn = DBConnection.getConnection();

    public void mostrarCategorias() {
        String sql = "SELECT id_categoria, nombre_categoria FROM Categoria";

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            System.out.println("Listado de Categorías:");
            while (rs.next()) {
                int idCategoria = rs.getInt("id_categoria");
                String nombreCategoria = rs.getString("nombre_categoria");

                System.out.println(idCategoria + ". " + nombreCategoria);
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener las categorías: " + e.getMessage());
        }
    }

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
                    Long codigo = rs.getLong("codigo");
                    double precio = rs.getDouble("precio");
                    double promocion = rs.getDouble("promocion");

                    System.out.println("- Producto: " + nombreProducto);
                    System.out.println("Código: " + codigo);
                    System.out.println("Precio: Q" + precio);
                    System.out.println("Promoción: Q" + promocion);

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

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        // Mostrar las categorías
        mostrarCategorias();

        // Solicitar al usuario que seleccione una categoría
        System.out.print("Selecciona el ID de la categoría que deseas ver: ");
        int idCategoriaSeleccionada = scanner.nextInt();

        // Mostrar los productos de la categoría seleccionada
        mostrarProductosPorCategoria(idCategoriaSeleccionada);
    }
}
