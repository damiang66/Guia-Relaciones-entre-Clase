
package com.mycompany.ejercicio3.entidades;

import java.util.ArrayList;
import java.util.List;


public class Baraja {
    private List<Carta> listaCarta;

    public Baraja() {
        this.listaCarta= new ArrayList();
    }

    public List<Carta> getListaCarta() {
        return listaCarta;
    }

    public void setListaCarta(List<Carta> listaCarta) {
        this.listaCarta = listaCarta;
    }

    @Override
    public String toString() {
        return "Baraja{" + "listaCarta=" + listaCarta + '}';
    }
    
}
