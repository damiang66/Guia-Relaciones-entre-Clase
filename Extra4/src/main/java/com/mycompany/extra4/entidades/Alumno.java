
package com.mycompany.extra4.entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Alumno implements Comparator<Alumno>,Comparable<Alumno> {
    private String nombre;
    private Integer dni;
    private Integer cantidadVotos;
   // private List<String> votaron;
    public Alumno() {
        this.cantidadVotos=0;
       // this.votaron= new ArrayList();
    }
/*
   // public List<String> getVotaron() {
        return votaron;
    }

    public void setVotaron(List<String> votaron) {
        this.votaron = votaron;
    }
*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(Integer cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", dni=" + dni + ", cantidadVotos=" + cantidadVotos + '}';
    }

    @Override
    public int compare(Alumno t, Alumno t1) {
       return t1.cantidadVotos.compareTo(t.cantidadVotos);
    }

    @Override
    public int compareTo(Alumno t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

   

   
         
}
