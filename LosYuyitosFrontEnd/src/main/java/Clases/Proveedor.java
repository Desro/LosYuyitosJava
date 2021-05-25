/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author User
 */
public class Proveedor {
    private int idProveedor;
    private String nombreProveedor;
    private String telefono;
    private String email;
    private String direccion;
    private int idRubro;
    private int idRegion;
    private int idProvincia;
    private int idComuna;
    private boolean vigencia;

    public Proveedor(int idProveedor, String nombreProveedor, String telefono, String email, String direccion, int idRubro, int idRegion, int idProvincia, int idComuna, boolean vigencia) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.idRubro = idRubro;
        this.idRegion = idRegion;
        this.idProvincia = idProvincia;
        this.idComuna = idComuna;
        this.vigencia = vigencia;
    }

    public Proveedor()
    {
        
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(int idRubro) {
        this.idRubro = idRubro;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public boolean isVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean vigeancia) {
        this.vigencia = vigeancia;
    }

    
    
}
