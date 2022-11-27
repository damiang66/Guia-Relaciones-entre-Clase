package com.mycompany.ejercicio3.servicios;

import com.mycompany.ejercicio3.entidades.Carta;
import com.mycompany.ejercicio3.entidades.enumeraciones.Palo;
import java.util.ArrayList;
import java.util.List;

public class CartaService {

    List<Carta> lista = new ArrayList();

    public List<Carta> crear() {
       

        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                 Carta c = new Carta();
                c.setNumero(i);
                c.setPalo(Palo.BASTO);
                lista.add(c);

            }

        }
        for (int i = 1; i < 13; i++) {
            if (i != 8 && i != 9) {
                 Carta c = new Carta();
                c.setNumero(i);
                c.setPalo(Palo.COPA);
                lista.add(c);

            }

        }
        for (int i = 1; i < 13; i++) {
             Carta c = new Carta();
            if (i != 8 && i != 9) {
                
                c.setNumero(i);
                c.setPalo(Palo.ESPADA);
                lista.add(c);

            }

        }
        for (int i = 1; i < 13; i++) {
             Carta c = new Carta();
            if (i != 8 && i != 9) {
                c.setNumero(i);
                c.setPalo(Palo.ORO);
                lista.add(c);

            }

        }
        return lista;
    }
}
