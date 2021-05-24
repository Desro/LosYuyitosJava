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
public class Pedido {
    private int idPedido;
    private int nroFactura;
    private String producto;
    private Date fechaPedido;
    private double total;

    //constructor
    public Pedido(int idPedido, int nroFactura, String producto, Date fechaPedido, double total) {
        this.idPedido = idPedido;
        this.nroFactura = nroFactura;
        this.producto = producto;
        this.fechaPedido = fechaPedido;
        this.total = total;
    }
    
    //getter and setter

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
