/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Andy
 */
public class Video {

    private int idVideo;
    private String titulo;
    private String director;
    private String genero;
    private String actor;
    private int anio;
    private int precioRenta;
    private int precioVenta;
    private int cantidad;
    private String resenia;

    public Video() {
    }

    public Video(int idVideo, String titulo, String director, String genero, String actor, 
            int anio, int precioRenta, int precioVenta, int cantidad) {
        this.idVideo = idVideo;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.actor = actor;
        this.anio = anio;
        this.precioRenta = precioRenta;
        this.precioVenta = precioVenta;
        this.cantidad = cantidad;
    }

    public int getIdVideo() {
        return idVideo;
    }

    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(int precioRenta) {
        this.precioRenta = precioRenta;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getResenia() {
        return resenia;
    }

    public void setResenia(String resenia) {
        this.resenia = resenia;
    }
    
    

}
