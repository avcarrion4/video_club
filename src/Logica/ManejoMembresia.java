/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Constantes;
import Datos.ConsultasMembresia;
import Datos.Membresia;
import Datos.Video;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andy
 */
public class ManejoMembresia {

    ConsultasMembresia consMem = new ConsultasMembresia();

    public Date calcularFecha(Date fechaSistema) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaSistema);
        Constantes cons = new Constantes();
        calendar.add(Calendar.DAY_OF_YEAR, cons.getDiasMembresia());
        return calendar.getTime();
    }

    public int guardarmembresia(Membresia membresia) throws IOException {
        int x = 0;
        try {
            x = consMem.insercion(membresia.getIdMembresia(), membresia.getTipo(),
                    membresia.getDescuento(), membresia.getfInicio(), membresia.getfFin(),
                    membresia.getEstado());
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    public int editarMembresia(Membresia membresia) throws IOException {
        int x = 0;
        try {
            x = consMem.actualizar(membresia.getIdMembresia(), membresia.getTipo(),
                    membresia.getDescuento(), membresia.getEstado());
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }
    public int idMembresia(){
        int id=0;
        try {
            ResultSet rs= consMem.ConsultarSecuenciaMembresia();
            while (rs.next()) {
                id= rs.getInt(1);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public Membresia CargarMembresiaTxt(int idM) {
        Membresia memb = null;
        try {

            ResultSet rs = consMem.buscarUno(idM);
            while (rs.next()) {
                memb = new Membresia(rs.getInt(1), rs.getString(2), rs.getInt(3), 
                        rs.getDate(4), rs.getDate(5), rs.getInt(6));

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoMembresia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return memb;
    }
    
    
}
