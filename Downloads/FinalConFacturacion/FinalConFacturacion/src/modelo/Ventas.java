/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appSuperMercado.modelo;

/**
 *
 * @author luisd
 */
public class Ventas {

    private int idVenta;
    private int idOrdenCompra;

    public Ventas() {
    }

    public Ventas(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public Ventas(int idVenta, int idOrdenCompra) {
        this.idVenta = idVenta;
        this.idOrdenCompra = idOrdenCompra;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(int idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

}
