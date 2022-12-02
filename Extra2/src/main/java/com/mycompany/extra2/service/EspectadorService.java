
package com.mycompany.extra2.service;

import com.mycompany.extra2.entidades.Espectador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 private String nombre;
    private Integer edad;
    private Double dinero;
*/

public class EspectadorService {
   List<Espectador>listaEspectadores = new ArrayList();
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   public Espectador crear(){
       Espectador espectador = new Espectador();
       System.out.println("Ingrese nombre");
       espectador.setNombre(leer.next());
       System.out.println("ingrese edad");
       espectador.setEdad(leer.nextInt());
       System.out.println("ingrese dinero disponible");
       espectador.setDinero(leer.nextDouble());
       listaEspectadores.add(espectador);
       return espectador;
   }
   public List<Espectador> devolverLista(){
       return listaEspectadores;
   }
}
