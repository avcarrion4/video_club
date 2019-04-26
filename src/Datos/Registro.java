/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andy
 */
public class Registro {

    private int codigoPrestamo;
    private Date fechaRegistro;
    private Date fechaDevolucion;
    private Cliente cliente;
    private int diasPrestamo;
    private ArrayList<Video> listaVideos;
    private int estado;
    private int tipo;

    public Registro() {
    }

    public Registro(int codigoPrestamo, Date fechaRegistro, Date fechaDevolucion, Cliente cliente, int diasPrestamo, ArrayList<Video> listaVideos, int estado, int tipo) {
        this.codigoPrestamo = codigoPrestamo;
        this.fechaRegistro = fechaRegistro;
        this.fechaDevolucion = fechaDevolucion;
        this.cliente = cliente;
        this.diasPrestamo = diasPrestamo;
        this.listaVideos = listaVideos;
        this.estado = estado;
        this.tipo = tipo;
    }

    

    public ArrayList<Video> getListaVideos() {
        return listaVideos;
    }

    public void setListaVideos(ArrayList<Video> listaVideos) {
        this.listaVideos = listaVideos;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCodigoPrestamo() {
        return codigoPrestamo;
    }

    public void setCodigoPrestamo(int codigoPrestamo) {
        this.codigoPrestamo = codigoPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
}
