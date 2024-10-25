/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luisd
 */
public class DBConnection {
    
    // DEFINIR LAS PROPIEDADES DE LA CONEXIÓN
    private static final String URL = "jdbc:mysql://localhost:3306/db_supermercado?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "umg$123456";

    // ESTABLECER LA CONEXIÓN
    public static Connection getConnection() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("successful in data base");
        } catch (SQLException e) {
            System.out.println("Error en la conexión de BD: " + e.getMessage());
        }

        return conn;

    }

}