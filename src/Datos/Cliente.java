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
public class Cliente extends Persona{
    
    private String codigoCliente;

    public Cliente(String codigoCliente, int Cedula, String Nombre, String Direccion, String Correo, int idMembresia) {
        super(Cedula, Nombre, Direccion, Correo, idMembresia);
        this.codigoCliente = codigoCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    
    
    
}
