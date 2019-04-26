/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Administrador;
import Datos.Cliente;
import Datos.ConsultaRegistro;
import Datos.ConsultasAcceso;
import Datos.Reg_Acc;
import Datos.Vendedor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author salas
 */
public class ManejoAcceso {

    ConsultasAcceso consulta = new ConsultasAcceso();
    ConsultaRegistro consulta_Reg = new ConsultaRegistro();

    public ArrayList<Reg_Acc> CargarMaterialesTxt() {
        ArrayList<Reg_Acc> listAcc = new ArrayList<>();
        try {
            
            ResultSet rs = consulta_Reg.seleccionAccesos();
            
            while (rs.next()) {
                Reg_Acc acc = new Reg_Acc(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4));
                
                listAcc.add(acc);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listAcc;
    }
    
    public void lock(String usuario, String entrada) throws ClassNotFoundException, SQLException{
        Date now = new Date(System.currentTimeMillis());
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");
        String salida = date.format(now) + "---" + hour.format(now);
        int val = consulta.insercion(usuario, entrada, salida);
    }

    public Object ValidarCamposIngreso(String Usuario, String Clave, int rol) throws ClassNotFoundException, SQLException {

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
