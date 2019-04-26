/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Cliente;
import Datos.ConsultasPersonas;
import Datos.Persona;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andy
 */
public class ManejoClientes {

    ConsultasPersonas consPer = new ConsultasPersonas();

    public int guardarCliente(Cliente cliente) throws IOException, SQLException {
        int x = 0;
        try {
            x = consPer.insercion(cliente.getIdPersona(), cliente.getCedula(), cliente.getNombre(),
                    cliente.getDireccion(), cliente.getCorreo(), cliente.getCodigoCliente(), cliente.getIdMembresia());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public Cliente CargarPersonaTxt(int cedula) {
        Cliente cliente = null;
        try {

            ResultSet rs = consPer.buscarUno(cedula);
            while (rs.next()) {
                cliente = new Cliente(rs.getString(9), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(10));
                cliente.setIdPersona(rs.getInt(1));

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public ArrayList<Cliente> CargarClientesTxt() {
        ArrayList<Cliente> lista = new ArrayList<>();
        Cliente cliente = null;
        try {
            ResultSet rs = consPer.buscarTodosSU();
            while (rs.next()) {
                if (rs.getString(6) == null) {
                    cliente = new Cliente(rs.getString(9), rs.getInt(2), rs.getString(3),
                            rs.getString(4), rs.getString(5), rs.getInt(10));
                    cliente.setIdPersona(rs.getInt(1));
                    lista.add(cliente);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public void ActualizarClienteTxt(int id, String usuario, String clave) {
        try {
            consPer.actualizar(id, usuario, clave);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
