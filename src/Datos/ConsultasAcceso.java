/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Conexion.conexiones;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author salas
 */
public class ConsultasAcceso {

    static conexiones con = new conexiones();
    static Statement st;

    public ResultSet seleccion(String usuario, String clave, int rol)
            throws ClassNotFoundException, SQLException {
        st = con.AbrirConexion().createStatement();
        String sentencia;
        sentencia = "SELECT * FROM personas where usuario='" + usuario + "' and clave='"
                + clave + "' and rol=" + rol + ";";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;

    }

}
