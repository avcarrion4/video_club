/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.Date;

/**
 *
 * @author Andy
 */
public class Membresia {

    private int idMembresia;
    private String tipo;
    private int descuento;
    private Date fInicio;
    private Date fFin;
    private int estado;

    public Membresia() {
    }

    public Membresia(int idMembresia, String tipo, int descuento, Date fInicio, Date fFin, int estado) {
        this.idMembresia = idMembresia;
        this.tipo = tipo;
        this.descuento = descuento;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.estado = estado;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Date getfInicio() {
        return fInicio;
    }

    public void setfInicio(Date fInicio) {
        this.fInicio = fInicio;
    }

    public Date getfFin() {
        return fFin;
    }

    public void setfFin(Date fFin) {
        this.fFin = fFin;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
}
