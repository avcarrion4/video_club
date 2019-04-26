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
public class Vendedor extends Persona{
    private String codigoVendedor;

    public Vendedor(String codigoVendedor, int Cedula, String Nombre, String Direccion, String Correo) {
        super(Cedula, Nombre, Direccion, Correo);
        this.codigoVendedor = codigoVendedor;
    }

    public String getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(String codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }
    
    
    
}
