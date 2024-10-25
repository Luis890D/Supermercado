/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author luisd
 */
public class Empleado {

    private int idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private String codigo;
    private String direccion;
    private String caja;
    private String numeroTelefono;
    private Date horario;

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, String apellidoEmpleado, String codigo, String direccion, String numeroTelefono, Date horario) {
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.codigo = codigo;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.horario = horario;
    }

    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String codigo, String direccion, String numeroTelefono, Date horario) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.codigo = codigo;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.horario = horario;
    }

    public Empleado(String nombreEmpleado, String apellidoEmpleado, String codigo, String direccion, String caja, String numeroTelefono, Date horario) {
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.codigo = codigo;
        this.direccion = direccion;
        this.caja = caja;
        this.numeroTelefono = numeroTelefono;
        this.horario = horario;
    }

    public Empleado(int idEmpleado, String nombreEmpleado, String apellidoEmpleado, String codigo, String direccion, String caja, String numeroTelefono, Date horario) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.codigo = codigo;
        this.direccion = direccion;
        this.caja = caja;
        this.numeroTelefono = numeroTelefono;
        this.horario = horario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Empleado{"
                + "ID: " + idEmpleado
                + ", Nombre: '" + nombreEmpleado + '\''
                + ", Apellido: '" + apellidoEmpleado + '\''
                + ", Código: '" + codigo + '\''
                + ", Dirección: '" + direccion + '\''
                + ", Número de Teléfono: '" + numeroTelefono + '\''
                + ", Horario: '" + horario + '\''
                + '}';
    }

}
