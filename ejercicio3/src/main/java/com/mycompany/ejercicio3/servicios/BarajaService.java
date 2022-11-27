/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3.servicios;

import com.mycompany.ejercicio3.entidades.Baraja;
import com.mycompany.ejercicio3.entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BarajaService {

    CartaService cartaServicio = new CartaService();
    List<Carta> listaCartas = new ArrayList();
    List<Carta> salidas = new ArrayList();
    int contador = 0;
    Baraja baraja = new Baraja();

    public Baraja crear() {

        listaCartas = cartaServicio.crear();
        baraja.setListaCarta(listaCartas);
        return baraja;

    }

    public Baraja barajar(Baraja b) {
        Collections.shuffle(b.getListaCarta());
        return b;
    }

    public Carta siguiente(Baraja b) {
        contador = 0;
        Carta c = null;
        if (b.getListaCarta().size() == 0) {
            System.out.println("no tenemos mas cartas");
        } else {
            c = b.getListaCarta().get(contador);
            salidas.add(c);
            listaCartas.remove(c);
            contador++;
            // System.out.println(c);
            // System.out.println(b);  
        }

        return c;
    }

    public int disponible(Baraja b) {
        return 40-salidas.size();
    }

    public List<Carta> darCartas(Baraja b, int cantidad) {
        List<Carta> lista = new ArrayList();
    
        
        if (listaCartas.size() > cantidad) {
            for (int i = 0; i < cantidad; i++) {
                if (salidas.size() == 40) {
                    System.out.println("termino");
                } else {
                    salidas.add(b.getListaCarta().get(i));
                   

                }
                

            }
            for (int i = 0; i < cantidad; i++) {
                listaCartas.remove(i);
            }
            return salidas;
        } else {
            System.out.println("tenemos menos cartas disponibles de las que esta pidiendo");
            return salidas;
        }

    }

    public List<Carta> cartasMonton(List<Carta> lista) {
        if (lista.size() == 40) {
            System.out.println("todavia no salio ninguna carta");
            return lista;
        } else {
            return lista;
        }
    }

    public void mostarBaraja(Baraja b) {
        List<Carta> lista = baraja.getListaCarta();
        for (Carta carta : lista) {
           System.out.println(carta);
        }
        System.out.println(lista.size());
    }

    public void menu() {
        Scanner leer = new Scanner(System.in);
        int salir = 0;
        while (salir == 0) {
            System.out.println("Menu\n"
                    + "1- Barajar\n"
                    + "2- Siguiente carta\n"
                    + "3- Numero de Cartas disponibles\n"
                    + "4- Dar cartas\n"
                    + "5- Mostar cartas entregadas\n"
                    + "6- Mostrar Baraja\n"
                    + "7- Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    barajar(baraja);
                    break;
                case 2:
                    System.out.println("la siguiente carta es: " + siguiente(baraja));
                    break;
                case 3:
                    System.out.println("las cartas disponibles son " + disponible(baraja));
                    ;
                    break;
                case 4:
                    System.out.println("indique la cantidad de cartas para darle");
                    darCartas(baraja, leer.nextInt());
                    break;
                case 5:
                    System.out.println(cartasMonton(salidas));
                    ;
                    System.out.println(cartasMonton(salidas).size());

                    break;
                case 6:
                    mostarBaraja(baraja);
                    break;

                case 7:
                    salir = 1;
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
            }
        }

    }
}
