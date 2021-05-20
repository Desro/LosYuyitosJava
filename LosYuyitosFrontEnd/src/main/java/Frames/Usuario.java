/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

/**
 *
 * @author Pato
 */
public class Usuario {
 //atributos
    private String idUsuario;
    private String nombreUsuario;
    private boolean administrador;
    private boolean vigente;
 
//constructor    
    public Usuario(String idUsuario, String nombreUsuario, boolean administrador, boolean vigente){
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.administrador = administrador;
        this.vigente = vigente;
    }

//accesadores y mutadores
    public String getIdUsuario(){
        return idUsuario;
    }    
    
    public void setIdUsuario(String idUsuario){
    
    }
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario){
    
    }
    
    public boolean getAdministrador(){
        return administrador;
    }
    
    public void setAdministrador(boolean administrador){
      
    }
    
    public boolean getVigente(){
        return vigente;
    }
    
    public void setVigente(boolean vigente){
    
    }
}

