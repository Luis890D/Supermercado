package modelo;

import javax.swing.JTextField;

public class EncabezadoFactura {
    private int idCabeceraventa;
    private int idCliente;
    private double valorPagar;
    private String fechaVenta;
    private int estado;

    public EncabezadoFactura() {
        this.idCabeceraventa = 0;
        this.idCliente = 0;
        this.valorPagar = 0.0;
        this.fechaVenta = "";
        this.estado = 0;
    }

    //constructor con 
    public EncabezadoFactura(int idCabeceraventa, int idCliente, double valorPagar, String fechaVenta, int estado) {
        this.idCabeceraventa = idCabeceraventa;
        this.idCliente = idCliente;
        this.valorPagar = valorPagar;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }

    public int getIdCabeceraventa() {
        return idCabeceraventa;
    }

    public void setIdCabeceraventa(int idCabeceraventa) {
        this.idCabeceraventa = idCabeceraventa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "EncabezadoFactura{" + "idCabeceraventa=" + idCabeceraventa + ", idCliente=" + idCliente + ", valorPagar=" + valorPagar + ", fechaVenta=" + fechaVenta + ", estado=" + estado + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
