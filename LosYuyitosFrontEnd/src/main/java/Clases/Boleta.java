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
public class Boleta {
    private int nroBoleta;
    private Date fechaVenta;
    private double totalBoleta;
    private boolean boletaFiada;
    private String producto;
    private String vendedor;
    private boolean anulada;

    //constructor
    public Boleta(int nroBoleta, Date fechaVenta, double totalBoleta, boolean boletaFiada, String producto, String vendedor, boolean anulada) {
        this.nroBoleta = nroBoleta;
        this.fechaVenta = fechaVenta;
        this.totalBoleta = totalBoleta;
        this.boletaFiada = boletaFiada;
        this.producto = producto;
        this.vendedor = vendedor;
        this.anulada = anulada;
    }
    
    //getter and setter
    public int getNroBoleta() {
        return nroBoleta;
    }

    public void setNroBoleta(int nroBoleta) {
        this.nroBoleta = nroBoleta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getTotalBoleta() {
        return totalBoleta;
    }

    public void setTotalBoleta(double totalBoleta) {
        this.totalBoleta = totalBoleta;
    }

    public boolean isBoletaFiada() {
        return boletaFiada;
    }

    public void setBoletaFiada(boolean boletaFiada) {
        this.boletaFiada = boletaFiada;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public boolean isAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }
    
    
}
