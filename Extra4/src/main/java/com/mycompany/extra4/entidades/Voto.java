
package com.mycompany.extra4.entidades;

import java.util.List;


public class Voto {
    private Alumno alumno;
    private List<Alumno> alumnovotados;

    public Voto() {
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getAlumnovotados() {
        return alumnovotados;
    }

    public void setAlumnovotados(List<Alumno> alumnovotados) {
        this.alumnovotados = alumnovotados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnovotados=" + alumnovotados + '}';
    }

    
    
    
}
