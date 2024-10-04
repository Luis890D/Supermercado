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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisd
 */
public class CategoriaDAO {

    private Connection conn;

    public CategoriaDAO() {
        this.conn = DBConnection.getConnection();
    }

    public List<Categoria> getCategoria() {

        List<Categoria> Categoria = new ArrayList<>();

        String sql = "select * from Categoria";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int idCategoria = rs.getInt("id_categoria");
                String nombreCategoria = rs.getString("nombre_categoria");

                Categoria categoria = new Categoria(idCategoria, nombreCategoria);

                Categoria.add(categoria);

            }

        } catch (Exception e) {
            System.out.println("Error getCategoria: " + e.getMessage());
        }

        return Categoria;

    }

    public void addCategoria(String nombreCategoria) {

        // DEFINIR LA SENTENCIA DE SQL PARA HACER INSERTAR EN LA TABLA
        String sql = "insert into Categoria (nombre_categoria) values (?)";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, nombreCategoria);

            stmt.executeUpdate();

            System.out.println("CATEGORIA AGREGADA");

        } catch (Exception e) {
            System.out.println("Error addCategoria: " + e.getMessage());
        }

    }

}
