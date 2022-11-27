
package com.mycompany.ejercicio3.entidades;

import com.mycompany.ejercicio3.entidades.enumeraciones.Palo;


public class Carta {
    private Integer numero;
    private Palo palo;

    public Carta() {
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
}
