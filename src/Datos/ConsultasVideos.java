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
import java.util.ArrayList;

/**
 *
 * @author Andy
 */
public class ConsultasVideos {

    static conexiones con = new conexiones();
    static Statement st;

    public int insercion(int id, String titulo, String director, String genero, String actor,
            int anio, int renta, int venta, int cantidad)
            throws ClassNotFoundException, SQLException {
        int x = 0;
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "INSERT INTO `videos` "
                + "VALUES(" + id + ",'" + titulo + "','" + director + "','" + genero + "','" + actor + "'," + anio + ","
                + renta + "," + venta + "," + cantidad + ");";
        x = st.executeUpdate(sentencia);
        return x;
    }

    public void actualizar(int id, int cantidad) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "UPDATE `videos` SET `cantidad`='" + cantidad + "' WHERE idVideo=" + id + ";";
        st.executeUpdate(sentencia);
    }
    public void actualizarResenia(int id, String resenia) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "UPDATE `videos` SET `resenia`='" + resenia + "' WHERE idVideo=" + id + ";";
        st.executeUpdate(sentencia);
    }

    public ResultSet seleccionActivos() throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM videos where cantidad>0;";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }
    public ResultSet seleccionPrestamo() throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM videos where cantidad>0;";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }
    public ResultSet buscarUno(String titulo) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM videos where titulo='" + titulo + "';";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }
    public ResultSet buscarUnoId(int id) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM videos where idVideo='" + id + "';";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }
    

}
