/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author User
 */
public class Fiado {
    private int idFiado;
    private Date fechaFiado;
    private Date fechaVencimiento;
    private int idBoleta;
    private double totalAbonos;
    private double totalPago;
    private boolean vencido;
    private String rutCliente;
    //Hay que hacer la lista, el string no sirve...
    private String abonosRealizados;
    //private ArrayList<Abono> AbonoRealizado; 

    public Fiado(int idFiado, Date fechaFiado, Date fechaVencimiento, int idBoleta, double totalAbonos, double totalPago, boolean vencido, String rutCliente, String abonosRealizados) {
        this.idFiado = idFiado;
        this.fechaFiado = fechaFiado;
        this.fechaVencimiento = fechaVencimiento;
        this.idBoleta = idBoleta;
        this.totalAbonos = totalAbonos;
        this.totalPago = totalPago;
        this.vencido = vencido;
        this.rutCliente = rutCliente;
        this.abonosRealizados = abonosRealizados;
    }
    
    public Fiado()
    {
        
    }

    public int getIdFiado() {
        return idFiado;
    }

    public void setIdFiado(int idFiado) {
        this.idFiado = idFiado;
    }

    public Date getFechaFiado() {
        return fechaFiado;
    }

    public void setFechaFiado(Date fechaFiado) {
        this.fechaFiado = fechaFiado;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }

    public double getTotalAbonos() {
        return totalAbonos;
    }

    public void setTotalAbonos(double totalAbonos) {
        this.totalAbonos = totalAbonos;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public boolean isVencido() {
        return vencido;
    }

    public void setVencido(boolean vencido) {
        this.vencido = vencido;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getAbonosRealizados() {
        return abonosRealizados;
    }

    public void setAbonosRealizados(String abonosRealizados) {
        this.abonosRealizados = abonosRealizados;
    }
    
    
    
}
