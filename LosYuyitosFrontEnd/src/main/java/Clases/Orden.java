/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Date;
/**
 *
 * @author User
 */
public class Orden {
    private int idOrden;
    private Date fechaOrden;
    private double totalOrden;
    private boolean recibida;
    private Date fechaRecepcion;
    private String usuario;
    private String pedidos;

    //constructor
    public Orden(int idOrden, Date fechaOrden, double totalOrden, boolean recibida, Date fechaRecepcion, String usuario, String pedidos) {
        this.idOrden = idOrden;
        this.fechaOrden = fechaOrden;
        this.totalOrden = totalOrden;
        this.recibida = recibida;
        this.fechaRecepcion = fechaRecepcion;
        this.usuario = usuario;
        this.pedidos = pedidos;
    }

    //getter and setter
    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public double getTotalOrden() {
        return totalOrden;
    }

    public void setTotalOrden(double totalOrden) {
        this.totalOrden = totalOrden;
    }

    public boolean isRecibida() {
        return recibida;
    }

    public void setRecibida(boolean recibida) {
        this.recibida = recibida;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }
    
    
    
}
