/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appSuperMercado.dao;

import appSuperMercado.Connection.DBConnection;
import appSuperMercado.modelo.Clientes;
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

    public List<Clientes> getClientes() {
        List<Clientes> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Clientes cliente = new Clientes(
                        rs.getInt("id_cliente"),
                        rs.getString("nombre_cliente"),
                        rs.getString("apellido_cliente"),
                        rs.getString("nit"),
                        rs.getString("direccion"),
                        rs.getString("correo_electronico"),
                        rs.getString("numero_telefonico")
                );
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            // Use a logging framework here
            System.err.println("Error fetching clients: " + e.getMessage());
        }
        return clientes;
    }

    public void addClientes(Clientes cliente) {
        String sql = "INSERT INTO clientes (nombre_cliente, apellido_cliente, nit, direccion, correo_electronico, numero_telefonico) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNombreCliente());
            stmt.setString(2, cliente.getApellidoCliente());
            stmt.setString(3, cliente.getNit());
            stmt.setString(4, cliente.getDireccion());
            stmt.setString(5, cliente.getCorreoElectronico());
            stmt.setString(6, cliente.getNumeroTelefonico());
            stmt.executeUpdate();
            System.out.println("Cliente AGREGADO CORRECTAMENTE");
        } catch (SQLException e) {
            System.err.println("Error adding client: " + e.getMessage());
        }
    }

    public void updateClientes(Clientes cliente) {
        String sql = "UPDATE clientes SET nombre_cliente = ?, apellido_cliente = ?, nit = ?, direccion = ?, correo_electronico = ?, numero_telefonico = ? WHERE id_cliente = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, cliente.getNombreCliente());
            pstmt.setString(2, cliente.getApellidoCliente());
            pstmt.setString(3, cliente.getNit());
            pstmt.setString(4, cliente.getDireccion());
            pstmt.setString(5, cliente.getCorreoElectronico());
            pstmt.setString(6, cliente.getNumeroTelefonico());
            pstmt.setInt(7, cliente.getIdCliente());
            pstmt.executeUpdate();
            System.out.println("Cliente ACTUALIZADO correctamente.");
        } catch (SQLException e) {
            System.err.println("Error updating client: " + e.getMessage());
        }
    }

    public List<Clientes> getClientesByUsuario(String nitUsuario) {
        List<Clientes> clientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes WHERE nit = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nitUsuario);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Clientes cliente = new Clientes(
                            rs.getInt("id_cliente"),
                            rs.getString("nombre_cliente"),
                            rs.getString("apellido_cliente"),
                            rs.getString("nit"),
                            rs.getString("dirección"),
                            rs.getString("correo_electronico"),
                            rs.getString("numero_telefonico")
                    );
                    clientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching clients by usuario: " + e.getMessage());
        }
        return clientes;
    }
}
