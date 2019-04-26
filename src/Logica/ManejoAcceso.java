/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Administrador;
import Datos.Cliente;
import Datos.ConsultasAcceso;
import Datos.Vendedor;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author salas
 */
public class ManejoAcceso {

    public Object ValidarCamposIngreso(String Usuario, String Clave, int rol) throws ClassNotFoundException, SQLException {
        ConsultasAcceso consulta = new ConsultasAcceso();
        ResultSet rs = consulta.seleccion(Usuario, Clave, rol);
        Object obj = null;
        if (rs != null) {
            switch (rol) {
                case 0:
                    while (rs.next()) {
                        Administrador admin = new Administrador(rs.getString(9),
                                rs.getInt(2), rs.getString(3), rs.getString(4),
                                rs.getString(5));
                        admin.setIdPersona(rs.getInt(1));
                        obj = admin;
                    }

                    break;
                case 1:
                    while (rs.next()) {
                        Vendedor vendedor = new Vendedor(rs.getString(9),
                                rs.getInt(2), rs.getString(3), rs.getString(4),
                                rs.getString(5));
                        vendedor.setIdPersona(rs.getInt(1));
                        obj = vendedor;
                    }

                    break;
                case 2:
                    while (rs.next()) {
                        Cliente cliente = new Cliente(rs.getString(9),
                                rs.getInt(2), rs.getString(3), rs.getString(4),
                                rs.getString(5), rs.getInt(10));
                        cliente.setIdPersona(rs.getInt(1));
                        obj = cliente;
                    }
                    break;

                default:
                    break;

            }
            return obj;
        }
        return null;
    }

}
