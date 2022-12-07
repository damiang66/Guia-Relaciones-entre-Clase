package com.mycompany.extra2.service;

import com.mycompany.extra2.entidades.Espectador;
import com.mycompany.extra2.entidades.Pelicula;
import com.mycompany.extra2.entidades.Sala;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SalaService {

    Sala sala = new Sala();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PeliculaService peliculaServicio = new PeliculaService();
    List<String> salas = new ArrayList();
    List<Pelicula> listaPeliculas = new ArrayList();
    List<Espectador> listaEspectador = new ArrayList();
    HashMap<String, String> mapa = sala.getSillas();
    Random Aleatorio = new Random();

    public void sentar(Espectador e) {
        int contador=0;
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
            aleatorio();
            int asiento =Aleatorio.nextInt(47);
            
            
            salas.get(asiento);
            for (Map.Entry<String, String> entry : mapa.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                
                if (key.equalsIgnoreCase(salas.get(asiento)) && value == null) {
                    entry.setValue("X");
                    System.out.println("usted estara ubicado en el asiento " + key);
                    contador=1;
                    break;
                    
                }
                sala.setSillas(mapa);
            }
                if (contador==0){
                    for (Map.Entry<String, String> entry1 : mapa.entrySet()) {
                        String key1 = entry1.getKey();
                        String value1 = entry1.getValue();
                        if(value1==null){
                            entry1.setValue("X");
                           System.out.println("usted estara ubicado en el asiento " + key1); 
                           break;
                    }
                     sala.setSillas(mapa);   
                    }
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

    public void aleatorio() {
        salas.add("1 A");
        salas.add("1 B");
        salas.add("1 C");
        salas.add("1 D");
        salas.add("1 E");
        salas.add("1 F");

        salas.add("2 A");
        salas.add("2 B");
        salas.add("2 C");
        salas.add("2 D");
        salas.add("2 E");
        salas.add("2 F");

        salas.add("3 A");
        salas.add("3 B");
        salas.add("3 C");
        salas.add("3 D");
        salas.add("3 E");
        salas.add("3 F");

        salas.add("4 A");
        salas.add("4 B");
        salas.add("4 C");
        salas.add("4 D");
        salas.add("4 E");
        salas.add("4 F");

        salas.add("5 A");
        salas.add("5 B");
        salas.add("5 C");
        salas.add("5 D");
        salas.add("5 E");
        salas.add("5 F");

        salas.add("6 A");
        salas.add("6 B");
        salas.add("6 C");
        salas.add("6 D");
        salas.add("6 E");
        salas.add("6 F");

        salas.add("7 A");
        salas.add("7 B");
        salas.add("7 C");
        salas.add("7 D");
        salas.add("7 E");
        salas.add("7 F");

        salas.add("8 A");
        salas.add("8 B");
        salas.add("8 C");
        salas.add("8 D");
        salas.add("8 E");
        salas.add("8 F");

    }

}
