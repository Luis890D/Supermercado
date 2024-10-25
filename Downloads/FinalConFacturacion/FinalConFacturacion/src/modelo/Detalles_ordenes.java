/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appSuperMercado.modelo;

/**
 *
 * @author luisd
 */
public class Detalles_ordenes {
    
    private int idDetalle;
    private int idProducto;
    private int cantidadCompras;
    private double totalConsumido;

    public Detalles_ordenes() {
    }

    public Detalles_ordenes(int idProducto, int cantidadCompras, double totalConsumido) {
        this.idProducto = idProducto;
        this.cantidadCompras = cantidadCompras;
        this.totalConsumido = totalConsumido;
    }

    public Detalles_ordenes(int idDetalle, int idProducto, int cantidadCompras, double totalConsumido) {
        this.idDetalle = idDetalle;
        this.idProducto = idProducto;
        this.cantidadCompras = cantidadCompras;
        this.totalConsumido = totalConsumido;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidadCompras() {
        return cantidadCompras;
    }

    public void setCantidadCompras(int cantidadCompras) {
        this.cantidadCompras = cantidadCompras;
    }

    public double getTotalConsumido() {
        return totalConsumido;
    }

    public void setTotalConsumido(double totalConsumido) {
        this.totalConsumido = totalConsumido;
    }
    
    
}
