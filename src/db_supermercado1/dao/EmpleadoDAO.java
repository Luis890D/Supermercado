/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1.dao;

import db_supermercado1.DBConnection;
import db_supermercado1.modelo.Empleado;
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

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm"); // Cambiar formato a 24 horas

        do {
            System.out.println("\n=== Gestión de Empleados ===");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Actualizar empleado");
            System.out.println("3. Eliminar empleado");
            System.out.println("4. Ver empleados");
            System.out.println("5. Volver atrás");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Empleado nuevoEmpleado = crearEmpleadoDesdeEntrada(scanner, formato);
                    if (nuevoEmpleado != null) {
                        addEmpleado(nuevoEmpleado);
                    }
                    break;

                case 2: // Actualizar empleado
                    System.out.print("Ingresa el código del empleado a actualizar: ");
                    String codigoActualizar = scanner.nextLine();
                    Empleado empleadoExistente = getEmpleadoByCodigo(codigoActualizar);
                    if (empleadoExistente != null) {
                        actualizarEmpleado(scanner, empleadoExistente, formato);
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 3: // Eliminar empleado
                    System.out.print("Ingresa el código del empleado a eliminar: ");
                    String codigoEliminar = scanner.nextLine();
                    Empleado empleadoEliminar = getEmpleadoByCodigo(codigoEliminar);
                    if (empleadoEliminar != null) {
                        System.out.print("¿Estás seguro de que deseas eliminar al empleado con el código " + codigoEliminar + "? (s/n): ");
                        String confirmacion = scanner.nextLine();
                        if (confirmacion.equalsIgnoreCase("s")) {
                            deleteEmpleado(empleadoEliminar.getIdEmpleado());
                        } else {
                            System.out.println("Eliminación cancelada.");
                        }
                    } else {
                        System.out.println("Empleado no encontrado.");
                    }
                    break;

                case 4: // Ver empleados
                    mostrarEmpleados(scanner);
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

    // Método para crear un empleado desde la entrada
    private Empleado crearEmpleadoDesdeEntrada(Scanner scanner, SimpleDateFormat formato) {
        System.out.print("Ingresa el nombre del empleado: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.print("Ingresa el apellido del empleado: ");
        String apellidoEmpleado = scanner.nextLine();
        System.out.print("Ingresa el código del empleado: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingresa la dirección del empleado: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingresa el número de teléfono del empleado: ");
        String numeroTelefono = scanner.nextLine();
        System.out.print("Ingresa la hora del horario del empleado (HH:mm): ");
        String horarioStr = scanner.nextLine();

        java.util.Date horarioDate = null;
        try {
            horarioDate = formato.parse(horarioStr);
        } catch (ParseException e) {
            System.out.println("Formato de horario incorrecto. Asegúrate de usar HH:mm.");
            return null; // Indicar que hubo un error
        }

        java.sql.Time horario = new java.sql.Time(horarioDate.getTime());
        return new Empleado(nombreEmpleado, apellidoEmpleado, codigo, direccion, numeroTelefono, horario);
    }

    // Método para actualizar un empleado
    private void actualizarEmpleado(Scanner scanner, Empleado empleado, SimpleDateFormat formato) {
        int opcion;
        do {
            System.out.println("\n=== Actualizar Empleado ===");
            System.out.println("1. Actualizar nombre");
            System.out.println("2. Actualizar apellido");
            System.out.println("3. Actualizar dirección");
            System.out.println("4. Actualizar número de teléfono");
            System.out.println("5. Actualizar horario");
            System.out.println("6. Guardar cambios y salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el nuevo nombre del empleado: ");
                    empleado.setNombreEmpleado(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Ingresa el nuevo apellido del empleado: ");
                    empleado.setApellidoEmpleado(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Ingresa la nueva dirección del empleado: ");
                    empleado.setDireccion(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Ingresa el nuevo número de teléfono del empleado: ");
                    empleado.setNumeroTelefono(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Ingresa la nueva fecha de horario (hh:mm a): ");
                    String horarioStr = scanner.nextLine();
                    try {
                        java.util.Date nuevoHorarioDate = formato.parse(horarioStr);
                        empleado.setHorario(new java.sql.Time(nuevoHorarioDate.getTime()));
                    } catch (ParseException e) {
                        System.out.println("Formato de horario incorrecto. Asegúrate de usar hh:mm AM/PM.");
                    }
                    break;
                case 6:
                    // Guardar los cambios en la base de datos
                    updateEmpleado(empleado);
                    System.out.println("Cambios guardados.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo nuevamente.");
            }
        } while (opcion != 6);
    }

    // Método para mostrar empleados
    private void mostrarEmpleados(Scanner scanner) {
        System.out.println("1. Ver todos los empleados");
        System.out.println("2. Buscar empleado por código");
        System.out.print("Selecciona una opción: ");
        int opcionVer = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea

        if (opcionVer == 1) {
            List<Empleado> empleados = getAllEmpleados();
            if (empleados.isEmpty()) {
                System.out.println("No hay empleados registrados.");
            } else {
                empleados.forEach(System.out::println);
            }
        } else if (opcionVer == 2) {
            System.out.print("Ingresa el código del empleado: ");
            String codigoBuscar = scanner.nextLine();
            Empleado empleadoBuscar = getEmpleadoByCodigo(codigoBuscar);
            if (empleadoBuscar != null) {
                System.out.println(empleadoBuscar);
            } else {
                System.out.println("Empleado no encontrado.");
            }
        } else {
            System.out.println("Opción inválida.");
        }
    }
}
