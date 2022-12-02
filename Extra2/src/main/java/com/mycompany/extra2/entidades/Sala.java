package com.mycompany.extra2.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sala {

    private HashMap<String,String> sillas = new HashMap();
    private Pelicula pelicula;
    private List<Espectador> espectadores;
    private Double precio;
    public Sala() {
        sillas.put("1 A", null);
        sillas.put("1 B", null);
        sillas.put("1 C", null);
        sillas.put("1 D", null);
        sillas.put("1 E", null);
        sillas.put("1 F", null);

        sillas.put("2 A", null);
        sillas.put("2 B", null);
        sillas.put("2 C", null);
        sillas.put("2 D", null);
        sillas.put("2 E", null);
        sillas.put("2 F", null);

        sillas.put("3 A", null);
        sillas.put("3 B", null);
        sillas.put("3 C", null);
        sillas.put("3 D", null);
        sillas.put("3 E", null);
        sillas.put("3 F", null);

        sillas.put("4 A", null);
        sillas.put("4 B", null);
        sillas.put("4 C", null);
        sillas.put("4 D", null);
        sillas.put("4 E", null);
        sillas.put("4 F", null);

        sillas.put("5 A", null);
        sillas.put("5 B", null);
        sillas.put("5 C", null);
        sillas.put("5 D", null);
        sillas.put("5 E", null);
        sillas.put("5 F", null);

        sillas.put("6 A", null);
        sillas.put("6 B", null);
        sillas.put("6 C", null);
        sillas.put("6 D", null);
        sillas.put("6 E", null);
        sillas.put("6 F", null);

        sillas.put("7 A", null);
        sillas.put("7 B", null);
        sillas.put("7 C", null);
        sillas.put("7 D", null);
        sillas.put("7 E", null);
        sillas.put("7 F", null);

        sillas.put("8 A",null);
        sillas.put("8 B", null);
        sillas.put("8 C", null);
        sillas.put("8 D", null);
        sillas.put("8 E", null);
        sillas.put("8 F", null);

       espectadores= new ArrayList();
       precio=100.0;
    }

    public HashMap<String, String> getSillas() {
        return sillas;
    }

    public void setSillas(HashMap<String, String> sillas) {
        this.sillas = sillas;
    }

   

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public List<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(List<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sala{" + "sillas=" + sillas + ", pelicula=" + pelicula + ", espectadores=" + espectadores + ", precio=" + precio + '}';
    }

    
    }

   
    

 


