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
public class Orden_compras {
    
    private int idOrdenCompra;
    private int idEmplado;
    private int idCliente;
    private int idDetalles;
    private int idEstado;
    private java.util.Date FechaCrecion;

    public Orden_compras() {
    }

    public Orden_compras(int idEmplado, int idCliente, int idDetalles, int idEstado, Date FechaCrecion) {
        this.idEmplado = idEmplado;
        this.idCliente = idCliente;
        this.idDetalles = idDetalles;
        this.idEstado = idEstado;
        this.FechaCrecion = FechaCrecion;
    }

    public Orden_compras(int idOrdenCompra, int idEmplado, int idCliente, int idDetalles, int idEstado, Date FechaCrecion) {
        this.idOrdenCompra = idOrdenCompra;
        this.idEmplado = idEmplado;
        this.idCliente = idCliente;
        this.idDetalles = idDetalles;
        this.idEstado = idEstado;
        this.FechaCrecion = FechaCrecion;
    }

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public int getIdEmplado() {
        return idEmplado;
    }

    public void setIdEmplado(int idEmplado) {
        this.idEmplado = idEmplado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(int idDetalles) {
        this.idDetalles = idDetalles;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public Date getFechaCrecion() {
        return FechaCrecion;
    }

    public void setFechaCrecion(Date FechaCrecion) {
        this.FechaCrecion = FechaCrecion;
    }
    
    
}
