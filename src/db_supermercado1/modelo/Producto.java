/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_supermercado1.modelo;

/**
 *
 * @author luisd
 */
public class Producto {

    private int idProducto;
    private String nombreProducto;
    private int codigo;
    private double promocion;
    private double precio;
    private int idCategoria;
    private String nombreCategoria;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
    }

    public Producto(String nombreProducto, int codigo, double promocion, double precio, int idCategoria) {
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.promocion = promocion;
        this.precio = precio;
        this.idCategoria = idCategoria;
    }

    public Producto(String nombreProducto, int codigo, double promocion, double precio) {
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.promocion = promocion;
        this.precio = precio;
    }

    public Producto(int idProducto, String nombreProducto, int codigo, double promocion, double precio, int idCategoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.promocion = promocion;
        this.precio = precio;
        this.idCategoria = idCategoria;
    }

    public Producto(int idProducto, String nombreProducto, int codigo, double promocion, double precio, int idCategoria, String nombreCategoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.codigo = codigo;
        this.promocion = promocion;
        this.precio = precio;
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPromocion() {
        return promocion;
    }

    public void setPromocion(double promocion) {
        this.promocion = promocion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return String.format("Código: %s, Nombre: %s, Precio: Q%.2f, Promoción: Q%.2f, ID Categoría: %d, Nombre Categoría: %s",
                codigo, nombreProducto, precio, promocion, idCategoria, nombreCategoria);
    }

}
