/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1;

import db_supermercado1.dao.ClientesDAO;
import db_supermercado1.modelo.Clientes;
import db_supermercado1.dao.CategoriaDAO;
import db_supermercado1.modelo.Categoria;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author luisd
 */
public class Menu {

    // creacion de instancias de los DAOs
    private CategoriaDAO categoriaDAO;
    private ClientesDAO clientesDAO;

    private Scanner leer = new Scanner(System.in);
    private int eleccion;

    // Constructor por defecto
    public Menu() {
        this.categoriaDAO = new CategoriaDAO();
        this.clientesDAO = new ClientesDAO();
    }

    public void menu() {

        do {

            System.out.println("--------------------------");
            System.out.println("0- Salir");
            System.out.println("1- Creacion de Categoria");
            System.out.println("2- Ver Categoria ");
            System.out.println("3- Agregar Cliente");
            System.out.println("4- ver lista cliente");
            System.out.println("5- Actualizar Cliente");
            System.out.println("--------------------------");

            System.out.println("\ningresa su eleccion: ");
            eleccion = leer.nextInt();

            switch (eleccion) {

                case 0:
                    System.out.println("QUE TENGA UN BONITO DIA");
                    break;

                case 1:
                    agregarCategoria();
                    break;
                case 2:
                    leerDatos();
                    break;
                case 3:
                    agregarClientes();
                    break;
                case 4:
                    leerDatos2();
                case 5:
                    actualizarClientes();
                    break;
                default:
                    System.out.println("Esta eleccion no es correcta");

            }

        } while (eleccion != 0);

    }

    public void leerDatos() {

        List<Categoria> categorias = categoriaDAO.getCategoria();

        for (Categoria e : categorias) {
            System.out.println(e.getIdCategoria() + " - " + e.getNombreCategoria());
        }

    }

    public void agregarCategoria() {

        Scanner leer2 = new Scanner(System.in);

        System.out.println("INGRESE EL NOMBRE DE LA CATEGORIA");

        String nombreCategoria = leer2.nextLine();
        categoriaDAO.addCategoria(nombreCategoria);

    }

    public void leerDatos2() {

        List<Clientes> Clientes = clientesDAO.getClientes();

        for (Clientes e : Clientes) {
            System.out.println(e.getIdCliente() + " - " + e.getNombreCliente() + " - " + e.getApellidoCliente() + " - " + e.getDireccion() + " - " + e.getCorreoElectronico() + " - " + e.getNumeroTelefonico());
        }

    }

    public void agregarClientes() {

        Scanner leer3 = new Scanner(System.in);

        // Solicitar los datos del cliente
        System.out.println("INGRESE EL NOMBRE DEL CLIENTE:");
        String nombreCliente = leer3.nextLine();

        System.out.println("INGRESE EL APELLIDO DEL CLIENTE:");
        String apellidoCliente = leer3.nextLine();

        System.out.println("INGRESE LA DIRECCIÓN DEL CLIENTE:");
        String direccion = leer3.nextLine();

        System.out.println("INGRESE EL CORREO ELECTRÓNICO DEL CLIENTE:");
        String correoElectronico = leer3.nextLine();

        System.out.println("INGRESE EL NÚMERO TELEFÓNICO DEL CLIENTE:");
        String numeroTelefonico = leer3.nextLine();

        Clientes cliente = new Clientes(nombreCliente, apellidoCliente, direccion, correoElectronico, numeroTelefonico);

        clientesDAO.addClientes(cliente);

        System.out.println("Cliente agregado correctamente.");
    }

    public void actualizarClientes() {
        Scanner leer3 = new Scanner(System.in);

        // Solicitar el ID del cliente que se desea actualizar
        System.out.println("INGRESE EL ID DEL CLIENTE A ACTUALIZAR:");
        int idCliente = leer3.nextInt();

        // Solicitar los nuevos datos del cliente
        System.out.println("INGRESE EL NUEVO NOMBRE DEL CLIENTE:");
        String nombreCliente = leer3.nextLine();

        System.out.println("INGRESE EL NUEVO APELLIDO DEL CLIENTE:");
        String apellidoCliente = leer3.nextLine();

        System.out.println("INGRESE LA NUEVA DIRECCIÓN DEL CLIENTE:");
        String direccion = leer3.nextLine();

        System.out.println("INGRESE EL NUEVO CORREO ELECTRÓNICO DEL CLIENTE:");
        String correoElectronico = leer3.nextLine();

        System.out.println("INGRESE EL NUEVO NÚMERO TELEFÓNICO DEL CLIENTE:");
        String numeroTelefonico = leer3.nextLine();

        // Crear un objeto Cliente con los nuevos datos
        Clientes clienteActualizado = new Clientes(idCliente, nombreCliente, apellidoCliente, direccion, correoElectronico, numeroTelefonico);

        // Llamar al método de actualización en el DAO
        clientesDAO.updateClientes(clienteActualizado);

        System.out.println("Cliente actualizado correctamente.");
    }

}
