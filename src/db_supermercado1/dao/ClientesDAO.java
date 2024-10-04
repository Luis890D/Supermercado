/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1.dao;

import db_supermercado1.DBConnection;
import db_supermercado1.modelo.Clientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisd
 */
public class ClientesDAO {

    private Connection conn;

    public ClientesDAO() {
        this.conn = DBConnection.getConnection();
    }

    public List<Clientes> getClientes() {

        List<Clientes> Cliente = new ArrayList<>();

        String sql = "select * from clientes";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                int idCliente = rs.getInt("id_cliente");
                String nombreCliente = rs.getString("nombre_cliente");
                String apellidoCliente = rs.getString("apellido_cliente");
                String direccion = rs.getString("dirección");
                String correoElectronico = rs.getString("correo_electronico");
                String numeroTelefonico = rs.getString("numero_telefonico");

                Clientes cliente = new Clientes(idCliente, nombreCliente, apellidoCliente, direccion, correoElectronico, numeroTelefonico);

                Cliente.add(cliente);

            }

        } catch (Exception e) {
            System.out.println("Error getCliente: " + e.getMessage());
        }

        return Cliente;

    }

    public void addClientes(Clientes cliente) {

        // DEFINIR LA SENTENCIA DE SQL PARA HACER INSERTAR EN LA TABLA
        String sql = "INSERT INTO Clientes (nombre_cliente, apellido_cliente, dirección, correo_electronico, numero_telefonico) VALUES (?, ?, ?, ?, ?)";

        try {

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cliente.getNombreCliente());
            stmt.setString(2, cliente.getApellidoCliente());
            stmt.setString(3, cliente.getDireccion());
            stmt.setString(4, cliente.getCorreoElectronico());
            stmt.setString(5, cliente.getNumeroTelefonico());

            stmt.executeUpdate();

            System.out.println("Cliente AGREGADO CORRECTAMENTE");

        } catch (Exception e) {
            System.out.println("Error addCLientes: " + e.getMessage());
        }

    }

    public void updateClientes(Clientes cliente) {
        String sql = "UPDATE clientes SET nombre = ?, apellido = ?, direccion = ?, correoElectronico = ?, numeroTelefonico = ? WHERE id = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cliente.getNombreCliente());
            pstmt.setString(2, cliente.getApellidoCliente());
            pstmt.setString(3, cliente.getDireccion());
            pstmt.setString(4, cliente.getCorreoElectronico());
            pstmt.setString(5, cliente.getNumeroTelefonico());
            pstmt.setInt(6, cliente.getIdCliente());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
