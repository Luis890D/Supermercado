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
    private String Description;
    private Date Fecha;
    private int idEmpleado;

    public Inventario() {
    }

    public Inventario(String Description, Date Fecha) {
        this.Description = Description;
        this.Fecha = Fecha;
    }

    public Inventario(int idInventario, int idCategoria, String Description, Date Fecha, int idEmpleado) {
        this.idInventario = idInventario;
        this.idCategoria = idCategoria;
        this.Description = Description;
        this.Fecha = Fecha;
        this.idEmpleado = idEmpleado;
    }

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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    
}
