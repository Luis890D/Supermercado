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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisd
 */
public class ProductoDAO {

    Connection conn = DBConnection.getConnection();

    public List<Producto> getProducto() {

        List<Producto> Productos = new ArrayList<>();

        String sql = "select * from Productos";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int idProducto = rs.getInt("id_producto");
                String nombreProducto = rs.getString("nombre_producto");
                double codigo = rs.getDouble("codigo");
                double promocion = rs.getDouble("promocion");
                double precio = rs.getDouble("precio");
                int idCategoria = rs.getInt("id_categoria");

                Producto producto = new Producto(idProducto, nombreProducto, codigo, promocion, precio, idCategoria );

                Productos.add(producto);

            }

        } catch (Exception e) {
            System.out.println("Error getProducto: " + e.getMessage());
        }

        return Productos;

    }
}
