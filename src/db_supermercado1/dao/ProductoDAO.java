/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1.dao;

import db_supermercado1.DBConnection;
import db_supermercado1.modelo.Producto;
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
public class ProductoDAO {

    Connection conn = DBConnection.getConnection();

    // Método para obtener todos los productos de la base de datos
    public List<Producto> getProducto() {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM Productos";

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int idProducto = rs.getInt("id_producto");
                String nombreProducto = rs.getString("nombre_producto");
                int codigo = rs.getInt("codigo");
                double promocion = rs.getDouble("promocion");
                double precio = rs.getDouble("precio");
                int idCategoria = rs.getInt("id_categoria");

                Producto producto = new Producto(idProducto, nombreProducto, codigo, promocion, precio, idCategoria);
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los productos: " + e.getMessage());
        }

        return productos;
    }

    // Método para mostrar todos los productos
    public void mostrarProductos() {
        String sql = "SELECT p.codigo, p.nombre_producto, p.precio, p.promocion, p.id_categoria, c.nombre_categoria "
                + "FROM Productos p "
                + "JOIN Categoria c ON p.id_categoria = c.id_categoria";

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            System.out.println("Listado de Productos:");

            while (rs.next()) {
                Long codigo = rs.getLong("codigo");
                String nombreProducto = rs.getString("nombre_producto");
                double precio = rs.getDouble("precio");
                double promocion = rs.getDouble("promocion");
                int idCategoria = rs.getInt("id_categoria");
                String nombreCategoria = rs.getString("nombre_categoria");

                System.out.printf("Código: %d, Nombre: %s, Precio: Q%.2f, Promoción: Q%.2f, ID Categoría: %d, Nombre Categoría: %s%n",
                        codigo, nombreProducto, precio, promocion, idCategoria, nombreCategoria);
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener los productos: " + e.getMessage());
        }
    }
    // Método para obtener un producto por su código

    public Producto getProductoPorCodigo(int codigoBuscado) {
        String sql = "SELECT p.codigo, p.nombre_producto, p.precio, p.promocion, p.id_categoria, c.nombre_categoria "
                + "FROM Productos p "
                + "JOIN Categoria c ON p.id_categoria = c.id_categoria "
                + "WHERE p.codigo = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigoBuscado);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    String nombreProducto = rs.getString("nombre_producto");
                    double precio = rs.getDouble("precio");
                    double promocion = rs.getDouble("promocion");
                    int idCategoria = rs.getInt("id_categoria");
                    String nombreCategoria = rs.getString("nombre_categoria");

                    return new Producto(0, nombreProducto, codigoBuscado, promocion, precio, idCategoria, nombreCategoria); // idProducto se asigna en la base de datos
                } else {
                    System.out.println("No se encontró el producto con el código especificado.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el producto: " + e.getMessage());
        }
        return null; // Si no se encuentra el producto
    }

// Método para agregar un nuevo producto
    public void addProducto(String nombreProducto, int codigo, double promocion, double precio, int idCategoria) {
        String sql = "INSERT INTO Productos (nombre_producto, codigo, promocion, precio, id_categoria) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nombreProducto);
            stmt.setInt(2, codigo);
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

    // Método para actualizar un producto
    public void updateProductoPorCodigo(int codigoProducto) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sql = new StringBuilder("UPDATE Productos SET ");
        boolean primerCampo = true;

        System.out.println("Seleccione el campo a actualizar:");
        System.out.println("1. Nombre del Producto");
        System.out.println("2. Código");
        System.out.println("3. Precio");
        System.out.println("4. Promoción");
        System.out.println("5. ID de la Categoría");
        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                sql.append("nombre_producto = '").append(nuevoNombre).append("'");
                primerCampo = false;
                break;

            case 2:
                System.out.print("Ingrese el nuevo código: ");
                int nuevoCodigo = scanner.nextInt();
                sql.append("codigo = ").append(nuevoCodigo);
                scanner.nextLine();  // Consumir nueva línea
                primerCampo = false;
                break;

            case 3:
                System.out.print("Ingrese el nuevo precio: ");
                double nuevoPrecio = scanner.nextDouble();
                sql.append("precio = ").append(nuevoPrecio);
                scanner.nextLine();  // Consumir nueva línea
                primerCampo = false;
                break;

            case 4:
                System.out.print("Ingrese la nueva promoción: ");
                double nuevaPromocion = scanner.nextDouble();
                sql.append("promocion = ").append(nuevaPromocion);
                scanner.nextLine();  // Consumir nueva línea
                primerCampo = false;
                break;

            case 5:
                System.out.print("Ingrese el nuevo ID de la categoría: ");
                int nuevaCategoria = scanner.nextInt();
                sql.append("id_categoria = ").append(nuevaCategoria);
                scanner.nextLine();  // Consumir nueva línea
                break;

            default:
                System.out.println("Opción inválida.");
                return;  // Salir del método si la opción no es válida
        }

        sql.append(" WHERE codigo = ").append(codigoProducto);

        try (PreparedStatement stmt = conn.prepareStatement(sql.toString())) {
            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Producto actualizado con éxito!");
            } else {
                System.out.println("No se encontró el producto con el código especificado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar el producto: " + e.getMessage());
        }
    }

    // Método para eliminar un producto por su código
    public void deleteProducto(int codigoProducto) {
        String sql = "DELETE FROM Productos WHERE codigo = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, codigoProducto);
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

    // Método para iniciar la interacción del usuario
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== Gestión de Productos ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Ver productos");
            System.out.println("5. Volver atrás");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingresa el código del producto: ");
                    int codigo = scanner.nextInt();
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
                    System.out.print("Ingresa el código del producto a actualizar: ");
                    int codigoProducto = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea
                    updateProductoPorCodigo(codigoProducto);
                    break;

                case 3:

                    System.out.print("Ingresa el código del producto a eliminar: ");
                    codigoProducto = scanner.nextInt();
                    scanner.nextLine();  // Consumir la nueva línea

                    // Confirmar eliminación
                    System.out.print("¿Estás seguro de que deseas eliminar el producto con el código " + codigoProducto + "? (s/n): ");
                    String confirmacion = scanner.nextLine();

                    if (confirmacion.equalsIgnoreCase("s")) {
                        deleteProducto(codigoProducto);
                    } else {
                        System.out.println("Eliminación cancelada.");
                    }
                    break;

                case 4:
                    System.out.println("1. Ver todos los productos");
                    System.out.println("2. Buscar producto por código");
                    System.out.print("Selecciona una opción: ");
                    int opcionVer = scanner.nextInt();
                    scanner.nextLine();  // Consumir nueva línea

                    if (opcionVer == 1) {
                        mostrarProductos(); // Cambié a mostrarProductos para listar en lugar de obtener
                    } else if (opcionVer == 2) {
                        System.out.print("Ingresa el código del producto: ");
                        int codigoBusqueda = scanner.nextInt();
                        scanner.nextLine();  // Consumir nueva línea
                        Producto producto = getProductoPorCodigo(codigoBusqueda);
                        if (producto != null) {
                            System.out.println(producto);
                        }
                    } else {
                        System.out.println("Opción inválida.");
                    }
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
}
