/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class mnProducto {

    Connection conn = DBConnection.getConnection();

    public void addProducto(String nombreProducto, double codigo, double promocion, double precio, int idCategoria) {
        String sql = "INSERT INTO Productos (nombre_producto, codigo, promocion, precio, id_categoria) VALUES (?, ?, ?, ?, ?)";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nombreProducto);
            stmt.setDouble(2, codigo);
            stmt.setDouble(3, promocion);
            stmt.setDouble(4, precio);
            stmt.setInt(5, idCategoria);

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Producto agregado con éxito!");
            }

        } catch (SQLException e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
        }
    }

    public void updateProducto(int idProducto) {
        Scanner scanner = new Scanner(System.in);

        // Construir la consulta de actualización de manera dinámica
        StringBuilder sql = new StringBuilder("UPDATE Productos SET ");
        boolean primerCampo = true;

        // Opciones para cambiar campos
        System.out.println("¿Deseas cambiar el nombre del producto? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Ingresa el nuevo nombre: ");
            String nuevoNombre = scanner.nextLine();
            sql.append("nombre_producto = '").append(nuevoNombre).append("'");
            primerCampo = false;
        }

        System.out.println("¿Deseas cambiar el código del producto? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Ingresa el nuevo código: ");
            double nuevoCodigo = scanner.nextDouble();
            if (!primerCampo) {
                sql.append(", ");
            }
            sql.append("codigo = ").append(nuevoCodigo);
            primerCampo = false;
            scanner.nextLine();
        }

        System.out.println("¿Deseas cambiar el precio del producto? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Ingresa el nuevo precio: ");
            double nuevoPrecio = scanner.nextDouble();
            if (!primerCampo) {
                sql.append(", ");
            }
            sql.append("precio = ").append(nuevoPrecio);
            primerCampo = false;
            scanner.nextLine();
        }

        System.out.println("¿Deseas cambiar la promoción del producto? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Ingresa la nueva promoción: ");
            double nuevaPromocion = scanner.nextDouble();
            if (!primerCampo) {
                sql.append(", ");
            }
            sql.append("promocion = ").append(nuevaPromocion);
            primerCampo = false;
            scanner.nextLine();
        }

        System.out.println("¿Deseas cambiar la categoría del producto? (s/n)");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            System.out.print("Ingresa el nuevo ID de la categoría: ");
            int nuevaCategoria = scanner.nextInt();
            if (!primerCampo) {
                sql.append(", ");
            }
            sql.append("id_categoria = ").append(nuevaCategoria);
            scanner.nextLine();  // Consumir nueva línea
        }

        sql.append(" WHERE id_producto = ").append(idProducto);

        try (PreparedStatement stmt = conn.prepareStatement(sql.toString())) {
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Producto actualizado con éxito!");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar el producto: " + e.getMessage());
        }
    }

    public void deleteProducto(double codigoProducto) {
        String sql = "DELETE FROM Productos WHERE codigo = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, codigoProducto);
            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Producto eliminado con éxito!");
            } else {
                System.out.println("No se encontró el producto con el código especificado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar el producto: " + e.getMessage());
        }
    }

    public void iniciar() {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestión de Productos ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Volver atrás");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();

                    System.out.print("Ingresa el código del producto: ");
                    double codigo = scanner.nextDouble();

                    System.out.print("Ingresa el precio del producto: ");
                    double precio = scanner.nextDouble();

                    System.out.print("Ingresa la promoción del producto: ");
                    double promocion = scanner.nextDouble();

                    System.out.print("Ingresa el id de la categoría: ");
                    int idCategoria = scanner.nextInt();

                    scanner.nextLine();
                    addProducto(nombreProducto, codigo, promocion, precio, idCategoria);
                    break;

                case 2:
                    System.out.print("Ingresa el ID del producto a actualizar: ");
                    int idProducto = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    updateProducto(idProducto);
                    break;

                case 3:
                    System.out.print("Ingresa el código del producto a eliminar: ");
                    double codigoProducto = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva línea
                    deleteProducto(codigoProducto);
                    break;

                case 4:
                    System.out.println("Volviendo atrás...");
                    break;

                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
                    break;
            }
        } while (opcion != 4);  // Termina el bucle cuando se selecciona "volver atrás"
    }
}
