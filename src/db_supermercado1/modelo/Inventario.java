/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1.modelo;

import java.util.Date;

/**
 *
 * @author luisd
 */

public class Inventario {

    private int idInventario;
    private int idCategoria;
    private int cantidad;
    private String descripcion; // Ajuste: nombres de variables en español y en minúscula
    private Date fecha;
    private int idEmpleado;

    // Constructor vacío
    public Inventario() {
    }

    // Constructor con descripción y fecha
    public Inventario(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    // Constructor completo
    public Inventario(int idInventario, int idCategoria, String descripcion, Date fecha, int idEmpleado) {
        this.idInventario = idInventario;
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.idEmpleado = idEmpleado;
    }

    // Getters y Setters
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() { // Ajuste: nombre en minúscula
        return descripcion;
    }

    public void setDescripcion(String descripcion) { // Ajuste: nombre en minúscula
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
