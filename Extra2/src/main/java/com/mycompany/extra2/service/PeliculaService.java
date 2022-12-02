
package com.mycompany.extra2.service;

import com.mycompany.extra2.entidades.Pelicula;
import java.util.ArrayList;
import java.util.List;

public class PeliculaService {
  List<Pelicula>listaPeliculas = new ArrayList();
    public Pelicula crear(){
      Pelicula p1 = new Pelicula();
     
      p1.setTitulo("a");
      p1.setDuracion(2.20);
      p1.setEdad(16);
      p1.setDirector("Normal");
     
   
      return p1;
      
    }
}
