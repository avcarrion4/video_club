/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Constantes;
import Datos.ConsultaRegistro;
import Datos.ConsultasPersonas;
import Datos.ConsultasVideos;
import Datos.Persona;
import Datos.Registro;
import Datos.Video;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Andy
 */
public class ManejoRegistros {

    ManejoVideo manVid = new ManejoVideo();
    ManejoClientes manCli = new ManejoClientes();
    ConsultaRegistro consReg = new ConsultaRegistro();
    ConsultasPersonas consPers = new ConsultasPersonas();
    ConsultasVideos consVideo = new ConsultasVideos();

    public ArrayList<Registro> cargarDatosPrestamoUnico(int id) {

//        ArrayList<Registro> lisPrestamos = new ArrayList<>();
//        ArrayList<Video> lisVideo = new ArrayList<>();
        Registro reg = new Registro();
//        try {
//            
//
//            ResultSet rs = consReg.consultaCabeceraUnica(id);
//            while (rs.next()) {
//                reg.setCodigoPrestamo(rs.getInt(1));
//                reg.setFechaRegistro(rs.getDate(2));
//                reg.setFechaDevolucion(rs.getDate(3));
//                reg.setDiasPrestamo(rs.getInt(5));
//                reg.setTipo(rs.getInt(6));
//                reg.setEstado(rs.getInt(7));
//                
//                
//                //reg.setListaVideos(consVide//o.);
//
//                lisPrestamos.add(reg);
//            }
//
//            return lisPrestamos;
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ManejoRegistros.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ManejoRegistros.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return lisPrestamos;
        ArrayList<Registro> lisPrestamos = new ArrayList<>();
        String cad = "";
        try {
            ResultSet rs1 = consReg.consultaCabeceraUnica(id);
            while (rs1.next()) {
                ArrayList<Video> lisVideo = new ArrayList<>();
                ResultSet rs2 = consReg.consultaDetalle(rs1.getInt(1));
                while (rs2.next()) {
                    ResultSet rs3 = consVideo.buscarUnoId(rs2.getInt(2));
                    while (rs3.next()) {
                        Video vid = new Video();
                        vid.setIdVideo(rs3.getInt(1));
                        vid.setCantidad(rs3.getInt(9));
                        lisVideo.add(vid);
                    }
                }
                reg.setCodigoPrestamo(rs1.getInt(1));
                reg.setFechaRegistro(rs1.getDate(2));
                reg.setFechaDevolucion(rs1.getDate(3));
                reg.setDiasPrestamo(rs1.getInt(5));
                reg.setTipo(rs1.getInt(6));
                reg.setEstado(rs1.getInt(7));

                reg.setListaVideos(lisVideo);
                lisPrestamos.add(reg);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoRegistros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lisPrestamos;
    }

    public ArrayList<Persona> cargarDatosPrestamoNoDevueltos() {

//        ArrayList<Persona> lisPersona = new ArrayList<>();
//        String cad = "";
//        try {
//
//            ResultSet rsPrestamo = consPres.consultaCabeceraPrestada();
//            while (rsPrestamo.next()) {
//                ArrayList<Libro> lisLibros = new ArrayList<>();
//                ArrayList<Revista> lisRevistas = new ArrayList<>();
//                ArrayList<Tesis> lisTesis = new ArrayList<>();
//                Persona pers = consPers.seleccionUno(rsPrestamo.getInt(4));
//                lisPersona.add(pers);
//
//            }
//
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(ManejoRegistros.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(ManejoRegistros.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //return lisPersona;
        return null;

    }

    public Date calcularFecha(Date fechaSistema) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaSistema);
        Constantes cons = new Constantes();
        calendar.add(Calendar.DAY_OF_YEAR, cons.getDiasPrestamo());
        return calendar.getTime();
    }

    public int verificaDevolucion(Registro objPrest, Date fechaDevuelto) {
        int x = 0;
        int n = fechaDevuelto.compareTo(objPrest.getFechaDevolucion());
        if (n <= 0) {
            x = 1;

        } else {

            x = 0;

        }
        return x;

    }

    public void realizarDev(Registro objPrest) {
        int x = 0;
        try {
            ResultSet rs = consReg.consultaDetalle(objPrest.getCodigoPrestamo());
            consReg.editaEstadoPrestamo(objPrest.getCodigoPrestamo(), 0);
            while (rs.next()) {
                for (Video vid : objPrest.getListaVideos()) {
                    if (vid.getIdVideo() == rs.getInt(2)) {
                        consVideo.actualizar(rs.getInt(2), (vid.getCantidad() + 1));
                    }
                }

            }
            x = consReg.eliminarDetalle(objPrest.getCodigoPrestamo());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoRegistros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoRegistros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void InsertarPrestamo(Registro ObjReg) throws ClassNotFoundException, SQLException {
        int x = 0, y = 0;
        // cabecera
        ResultSet rs = consReg.ConsultarSecuenciaRegistro();
        while (rs.next()) {
            ObjReg.setCodigoPrestamo(rs.getInt(1));
        }

        x = consReg.InsertarCabecera(ObjReg.getFechaRegistro(), ObjReg.getFechaDevolucion(),
                ObjReg.getCliente().getIdPersona(), ObjReg.getDiasPrestamo(), ObjReg.getTipo(), ObjReg.getEstado());

        // detalle
        for (Video video : ObjReg.getListaVideos()) {
            y = consReg.InsertarDetalle(ObjReg.getCodigoPrestamo(), video.getIdVideo());
            consVideo.actualizar(video.getIdVideo(), (video.getCantidad() - 1));
        }

    }

    public double calcularPrecio(int precio, int descuento) {
        double preciototal = precio - descuento;
        return preciototal;

    }

    public void InsertarDevolucion(Registro ObjPres) throws ClassNotFoundException, SQLException {
//        int x = 0, y = 0;
//        // cabecera
//        java.util.Date fecha = new Date();
//        System.out.println(fecha);
//
//        // detalle
//        for (Video objMaterialL : ObjPres.getListaVideos()) {
//            Libro libro = (Libro) objMaterialL;
//            // se cambia el estado del materil y elimina de data pres
//            libro.cambiarEstado();
//            manMat.ActualizarMaterialesTxt(libro.getCodigoMaterial(), libro.getEstatus());
//            //y = ManejadorMaterial.UpdateEstadoMaterial(ObjMaterial.getIdmaterial(), ObjMaterial.getEstado());
//        }
//        
//
//        x = consPres.editaCabecera(ObjPres.getCodigoPrestamo(), fecha);
//        consPres.eliminarDetalle(ObjPres.getCodigoPrestamo());
//        //x = consPres.InsertarCabecera(IdPres, fecha, null, ObjPres.getPersona().getIdentificacion());
    }

}
