

package com.mycompany.extra2;

import com.mycompany.extra2.entidades.Espectador;
import com.mycompany.extra2.entidades.Pelicula;
import com.mycompany.extra2.entidades.Sala;
import com.mycompany.extra2.service.EspectadorService;
import com.mycompany.extra2.service.PeliculaService;
import com.mycompany.extra2.service.SalaService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Extra2 {

    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
     EspectadorService espectadorService = new EspectadorService();
     PeliculaService peliculaService = new PeliculaService();
     SalaService salaService = new SalaService();
    Pelicula p=peliculaService.crear();
        System.out.println("Ingrese la cantidad de espectadores");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Espectador e =espectadorService.crear();
            salaService.sentar(e);
        }
       List<Espectador> espectadores = new ArrayList();
      //  salaService.mostrar();
            
        }
    }
