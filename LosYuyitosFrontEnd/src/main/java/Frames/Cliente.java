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
public class Cliente {
//Atributos
   private String rutCliente;
   private String nombreCliente;
   private String telefonoCliente;
   private String correoCliente;
   private boolean autorizadoParaFiar;
   private String direccionCliente;
   private int idComuna;
   private int idProvincia;
   private int idRegion;
   
//constructor
public Cliente(String rutCliente, String nombreCliente, String telefonoCliente, String correoCliente, boolean autorizadoParaFiar, String direccionCliente, int idComuna, int idProvincia, int idRegion){
    this.rutCliente = rutCliente;
    this.nombreCliente = nombreCliente;
    this.telefonoCliente = telefonoCliente;
    this.correoCliente = correoCliente;
    this.autorizadoParaFiar = autorizadoParaFiar;
    this.direccionCliente = direccionCliente;
    this.idComuna = idComuna;
    this.idProvincia = idProvincia;
    this.idRegion = idRegion;
}

//accesadores y mutadores
public String getRutCliente(){
    return rutCliente;
}

public void setRutCliente(String rutCliente){

}

public String getNombreCliente(){
    return nombreCliente;
}

public void setNombreCliente(String nombreCliente){

}

public String getTelefonoCliente(){
    return telefonoCliente;
}

public void setTelefonoCliente(String telefonoCliente){

}

public String getCorreoCliente(){
    return correoCliente;
}

public void setCorreoCliente(String correoCliente){

}

public boolean getAutorizadoParaFiar(){
    return autorizadoParaFiar;
}

public void setAutorizadoParaFiar(boolean autorizadoParaFiar){

}

public String getDireccionCliente(){
    return direccionCliente;
}

public void setDireccionCliente(String direccionCliente){

}

public int getIdComuna(){
    return idComuna;
}

public void setIdComuna(int idComuna){

}

public int getIdProvincia(){
    return idProvincia;
}

public void setIdProvincia(int idProvincia){

}

public int getIdRegion(){
    return idRegion;
}

public void setIdRegion(int idRegion){

}

}

