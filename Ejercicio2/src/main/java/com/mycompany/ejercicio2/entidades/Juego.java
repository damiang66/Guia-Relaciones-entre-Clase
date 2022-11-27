
package com.mycompany.ejercicio2.entidades;

import java.util.List;

public class Juego {
   private List<Persona> persona; 
   private Revolver revolver;

    public Juego() {
    }

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "persona=" + persona + ", revolver=" + revolver + '}';
    }
 
}
