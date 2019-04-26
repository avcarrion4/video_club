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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andy
 */
public class ConsultaRegistro {

    static conexiones con = new conexiones();
    static Statement st;

    public ResultSet consultaCabecera() throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM `prestamos`";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public ResultSet consultaCabeceraUnica(int id) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM `registro` where idCliente=" + id + "  and estado=1;";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public ResultSet consultaCabeceraPrestada() throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM `registro`where estado=0;";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public ResultSet consultaDetalle(int IntIdPres) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM `detareg` WHERE idPrestamo=" + IntIdPres + ";";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public int InsertarCabecera(Date fechaRegistro, Date fechaDevolucion, int idCliente,
            int dias, int tipo, int estado)
            throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        String Sentencia = "INSERT INTO registro "
                + " (idPrestamo,fregistro,fdevolucion,idCliente,dias,tipo,estado)"
                + "VALUES (0,'" + df2.format(fechaRegistro) + "','" + df2.format(fechaDevolucion)
                + "'," + idCliente + "," + dias + "," + tipo + "," + estado + ");";
        return st.executeUpdate(Sentencia);
    }

    public int editaEstadoPrestamo(int IntIdpres, int estado)
            throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "UPDATE `registro` SET estado=" + estado + " WHERE idPrestamo=" + IntIdpres + ";";
        return st.executeUpdate(Sentencia);
    }

    public int InsertarDetalle(int IntIdPres, int IntIdVideo) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO detareg "
                + " (idPrestamo, idVideo)"
                + " VALUES (" + IntIdPres + "," + IntIdVideo + ")";
        return st.executeUpdate(Sentencia);
    }

    public int eliminarDetalle(int IntIdPres) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "DELETE FROM `detareg` WHERE idPrestamo=" + IntIdPres + ";";
        return st.executeUpdate(Sentencia);
    }

    public ResultSet ConsultarSecuenciaRegistro() throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String Sentencia = "SELECT max(idPrestamo)+1 FROM registro";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
}
