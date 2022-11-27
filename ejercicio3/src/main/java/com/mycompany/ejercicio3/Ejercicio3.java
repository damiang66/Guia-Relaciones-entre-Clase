

package com.mycompany.ejercicio3;

import com.mycompany.ejercicio3.entidades.Baraja;
import com.mycompany.ejercicio3.entidades.Carta;
import com.mycompany.ejercicio3.servicios.BarajaService;
import com.mycompany.ejercicio3.servicios.CartaService;
import java.util.ArrayList;
import java.util.List;


public class Ejercicio3 {

    public static void main(String[] args) {
       List<Carta> lista = new ArrayList();
      CartaService cartaService = new CartaService();
      BarajaService barajaServicio = new BarajaService();
      Baraja b=barajaServicio.crear();
        System.out.println(b);
        System.out.println("------------------------");
      barajaServicio.menu();
              
    }
}
