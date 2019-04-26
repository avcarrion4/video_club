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

/**
 *
 * @author Andy
 */
public class ConsultasPersonas {

    static conexiones con = new conexiones();
    static Statement st;

    public int insercion(int id, int cedula, String nombres, String direccion, String correo,
            String codigo, int idMembresia)
            throws ClassNotFoundException, SQLException {
        int x = 0;
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "INSERT INTO `personas` (`idPersona`, `cedula`, `nombres`, "
                + "`direccion`, `correo`, `rol`, `codigo`, `idMembresia`) VALUES("
                + id + "," + cedula + ",'" + nombres + "','" + direccion
                + "','" + correo + "',2,'" + codigo + "'," + idMembresia + ");";
        x = st.executeUpdate(sentencia);
        return x;
    }

    public void actualizar(int id, String usuario, String clave) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "UPDATE `personas` SET `usuario`='" + usuario + "', `clave`= '"+clave+"' WHERE idPersona=" + id + ";";
        System.out.println(sentencia);
        st.executeUpdate(sentencia);
    }
    
    public ResultSet buscarTodosSU() throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM personas where rol=2;";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }
    public ResultSet buscarUno(int cedula) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM personas where cedula=" + cedula + ";";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }
    public ResultSet buscarUnoId(int id) throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM personas where idPersona=" + id + ";";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }

}
