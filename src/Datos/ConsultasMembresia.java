/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Conexion.conexiones;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Andy
 */
public class ConsultasMembresia {

    static conexiones con = new conexiones();
    static Statement st;
    SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");

    public int insercion(int id, String tipo, int descuento, Date finicio,
            Date fFin, int esatado) throws ClassNotFoundException, SQLException {
        int x = 0;
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "INSERT INTO `membresia` VALUES(" + id + ",'" + tipo + "'," + descuento + ",'"
                + df2.format(finicio) + "','" + df2.format(fFin) + "',1);";
        x = st.executeUpdate(sentencia);
        return x;
    }

    public int actualizar(int id, String tipo, int descuento, int estado) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "UPDATE `membresia` SET `tipo`='" + tipo + "',`descuento`=" + descuento
                + ",`estado`=" + estado + "  WHERE idMembresia=" + id + ";";
        System.out.println(sentencia);
        return st.executeUpdate(sentencia);
    }

    public ResultSet ConsultarSecuenciaMembresia() throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT max(idMembresia) FROM membresia";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public ResultSet buscarUno(int idM) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM membresia where idMembresia=" + idM + ";";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }
}
