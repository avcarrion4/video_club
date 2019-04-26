/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Andy
 */
public class Administrador extends Persona{
    
    private String codigoAdm;

    public Administrador(String codigoAdm, int Cedula, String Nombre, String Direccion, String Correo) {
        super(Cedula, Nombre, Direccion, Correo);
        this.codigoAdm = codigoAdm;
    }

    public String getCodigoAdm() {
        return codigoAdm;
    }

    public void setCodigoAdm(String codigoAdm) {
        this.codigoAdm = codigoAdm;
    }
    
    
    
}
