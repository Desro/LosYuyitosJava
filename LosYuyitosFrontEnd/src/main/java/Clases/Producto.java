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
public class Producto {
    
    private String CodigoBarra;
    private Date fechaVencimiento;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    private int stockCritico;
    private boolean vigencia;
    private String proveedor;
    private int idTipo;
    private int idFamilia;
    
    //Constuctor
    public Producto(String CodigoBarra, Date fechaVencimiento, String descripcion, double precioCompra, double precioVenta, int stock, int stockCritico, boolean vigencia, String proveedor, int idTipo, int idFamilia) {
        this.CodigoBarra = CodigoBarra;
        this.fechaVencimiento = fechaVencimiento;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.stockCritico = stockCritico;
        this.vigencia = vigencia;
        this.proveedor = proveedor;
        this.idTipo = idTipo;
        this.idFamilia = idFamilia;
    }
    //Constructor sin parametros, no me acuerdo si va así y no se si será necesario
    public Producto() {
        this.CodigoBarra = CodigoBarra;
        this.fechaVencimiento = fechaVencimiento;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.stockCritico = stockCritico;
        this.vigencia = vigencia;
        this.proveedor = proveedor;
        this.idTipo = idTipo;
        this.idFamilia = idFamilia;
    }
    
    //Getter and Setter
    public String getCodigoBarra() {
        return CodigoBarra;
    }

    public void setCodigoBarra(String CodigoBarra) {
        this.CodigoBarra = CodigoBarra;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockCritico() {
        return stockCritico;
    }

    public void setStockCritico(int stockCritico) {
        this.stockCritico = stockCritico;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigencia) {
        this.vigencia = vigencia;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }
    
}
