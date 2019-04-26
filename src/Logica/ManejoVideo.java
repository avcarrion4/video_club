/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.ConsultasVideos;
import Datos.Video;
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
public class ManejoVideo {

    ConsultasVideos consVid = new ConsultasVideos();

    public int guardarVideo(Video video) throws IOException {
        int x = 0;
        try {
            x = consVid.insercion(video.getIdVideo(), video.getTitulo(), video.getDirector(),
                    video.getGenero(), video.getActor(), video.getAnio(), video.getPrecioRenta(),
                    video.getPrecioVenta(), video.getCantidad());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return x;
    }

    public void ActualizarMaterialesTxt(int id, String resenia) {
        try {
            consVid.actualizarResenia(id, resenia);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public ArrayList<Video> CargarMaterialesTxt() {
        ArrayList<Video> listVideo = new ArrayList<>();
        try {
            ResultSet rs = consVid.seleccionActivos();
            while (rs.next()) {
                Video vid = new Video(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7),
                        rs.getInt(8), rs.getInt(9));
                vid.setResenia(rs.getString(10));
                listVideo.add(vid);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoVideo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listVideo;
    }

    public Video CargarVideoTxt(String titulo) {
        Video vid = null;
        try {

            ResultSet rs = consVid.buscarUno(titulo);
            while (rs.next()) {
                vid = new Video(rs.getInt(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7),
                        rs.getInt(8), rs.getInt(9));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManejoClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ManejoClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vid;
    }
}
