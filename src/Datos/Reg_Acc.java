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
public class Reg_Acc {
    int id_Acc;
    String nombre;
    String entrada;
    String salida;

    public Reg_Acc() {
    }

    public Reg_Acc(int id_Acc, String nombre, String entrada, String salida) {
        this.id_Acc = id_Acc;
        this.nombre = nombre;
        this.entrada = entrada;
        this.salida = salida;
    }

    public int getId_Acc() {
        return id_Acc;
    }

    public void setId_Acc(int id_Acc) {
        this.id_Acc = id_Acc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }
    
    
}
