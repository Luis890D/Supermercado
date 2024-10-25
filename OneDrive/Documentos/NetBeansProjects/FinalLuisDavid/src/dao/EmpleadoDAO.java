/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Connection.DBConnection;
import modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class EmpleadoDAO {

    Connection conn = DBConnection.getConnection();

    // Método para agregar un empleado a la base de datos
    public boolean addEmpleado(Empleado empleado) {
        String sql = "INSERT INTO Empleado (nombre_empleado, apellido_empleado, codigo, dirección, numero_telefonico, horario) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, empleado.getNombreEmpleado());
            stmt.setString(2, empleado.getApellidoEmpleado());
            stmt.setString(3, empleado.getCodigo());
            stmt.setString(4, empleado.getDireccion());
            stmt.setString(5, empleado.getNumeroTelefono());
            stmt.setTime(6, (Time) empleado.getHorario()); // Asegúrate de que getHorario devuelva java.sql.Time
            return stmt.executeUpdate() > 0; // Retorna true si se insertó exitosamente
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para obtener todos los empleados
    public List<Empleado> getAllEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        String sql = "SELECT * FROM Empleado";

        try (PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Empleado empleado = new Empleado(
                        rs.getInt("id_empleado"),
                        rs.getString("nombre_empleado"),
                        rs.getString("apellido_empleado"),
                        rs.getString("codigo"),
                        rs.getString("dirección"),
                        rs.getString("numero_telefonico"),
                        rs.getTime("horario") // Asegúrate de que getHorario devuelva java.sql.Time
                );
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    // Método para actualizar un empleado
    public boolean updateEmpleado(Empleado empleado) {
        String sql = "UPDATE Empleado SET nombre_empleado=?, apellido_empleado=?, codigo=?, dirección=?, numero_telefonico=?, horario=? WHERE id_empleado=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, empleado.getNombreEmpleado());
            stmt.setString(2, empleado.getApellidoEmpleado());
            stmt.setString(3, empleado.getCodigo());
            stmt.setString(4, empleado.getDireccion());
            stmt.setString(5, empleado.getNumeroTelefono());
            stmt.setTime(6, (Time) empleado.getHorario()); // Asegúrate de que getHorario devuelva java.sql.Time
            stmt.setInt(7, empleado.getIdEmpleado());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para eliminar un empleado
    public boolean deleteEmpleado(int idEmpleado) {
        String sql = "DELETE FROM Empleado WHERE id_empleado = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idEmpleado);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para buscar un empleado por su código
    public Empleado getEmpleadoByCodigo(String codigo) {
        String sql = "SELECT * FROM Empleado WHERE codigo = ?";
        Empleado empleado = null;

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, codigo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    empleado = new Empleado(
                            rs.getInt("id_empleado"),
                            rs.getString("nombre_empleado"),
                            rs.getString("apellido_empleado"),
                            rs.getString("codigo"),
                            rs.getString("dirección"),
                            rs.getString("numero_telefonico"),
                            rs.getTime("horario") // Asegúrate de que getHorario devuelva java.sql.Time
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleado;
    }

    public Empleado getEmpleadoById(int idEmpleado) {
        Empleado empleado = null;
        String sql = "SELECT * FROM empleados WHERE id_empleado = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idEmpleado);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    empleado = new Empleado(
                            rs.getInt("id_empleado"),
                            rs.getString("nombre_empleado"),
                            rs.getString("apellido_empleado"),
                            rs.getString("codigo"),
                            rs.getString("direccion"),
                            rs.getString("numero_telefono"),
                            rs.getDate("horario") // Asegúrate de que este campo exista en la tabla
                    );
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching employee by ID: " + e.getMessage());
        }
        return empleado;
    }
}
