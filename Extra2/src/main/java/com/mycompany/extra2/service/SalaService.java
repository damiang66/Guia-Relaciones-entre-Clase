package com.mycompany.extra2.service;

import com.mycompany.extra2.entidades.Espectador;
import com.mycompany.extra2.entidades.Pelicula;
import com.mycompany.extra2.entidades.Sala;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SalaService {

    Sala sala = new Sala();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PeliculaService peliculaServicio = new PeliculaService();
    List<Pelicula> listaPeliculas = new ArrayList();
    List<Espectador> listaEspectador = new ArrayList();
    HashMap<String, String> mapa = sala.getSillas();

    public void sentar(Espectador e) {
        Pelicula p = new Pelicula();
        listaPeliculas.removeAll(listaPeliculas);
        Pelicula pelicula = peliculaServicio.crear();
        boolean validar = false;
        System.out.println("Las peliculas disponibles son" + pelicula);

        System.out.println("Ingrese el nombre de la pelicula");
        String nombre = leer.next();

        if (pelicula.getTitulo().equalsIgnoreCase(nombre)) {
            if (pelicula.getEdad() < e.getEdad()) {
                if (sala.getPrecio() < e.getDinero()) {

                    sala.setPelicula(pelicula);
                    validar = true;
                } else {
                    System.out.println("usted no tiene dinero suficiente para ver la pelicula");
                    validar = false;
                }

            } else {
                System.out.println("Usted no tiene edad para ver esta pelicula");
                validar = false;
            }

        } else {
            System.out.println("pelicula no encontrada");
            validar = false;
        }

        if (validar) {
            for (Map.Entry<String, String> entry : mapa.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (value == null) {
                    entry.setValue("X");
                    break;
                }
                sala.setSillas(mapa);
            }
        }
        listaEspectador.add(e);
        sala.setEspectadores(listaEspectador);

        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.print(" asiento: " + key + " ocupado: " + value);
            System.out.println("");

        }
    }

}
