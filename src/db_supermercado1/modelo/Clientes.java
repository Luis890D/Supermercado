/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1.modelo;

/**
 *
 * @author luisd
 */
public class Clientes {
    
    private int idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccion;
    private String correoElectronico;
    private String numeroTelefonico;

    public Clientes() {
    }
    
    public Clientes(String nombreCliente, String apellidoCliente, String direccion, String correoElectronico, String numeroTelefonico) {
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
    }

    public Clientes(int idCliente, String nombreCliente, String apellidoCliente, String direccion, String correoElectronico, String numeroTelefonico) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.numeroTelefonico = numeroTelefonico;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    
    
}
