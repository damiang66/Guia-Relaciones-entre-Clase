

package com.mycompany.ejercicio2;

import com.mycompany.ejercicio2.entidades.Persona;
import com.mycompany.ejercicio2.entidades.Revolver;
import com.mycompany.ejercicio2.servicios.JuegoService;
import com.mycompany.ejercicio2.servicios.PersonaService;
import com.mycompany.ejercicio2.servicios.RevolverService;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;






public class Ejercicio2 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    List<Persona> listaPersona = new ArrayList();
        JuegoService juegoServicio = new JuegoService();
        RevolverService revolverService= new RevolverService();
        PersonaService personaServicio = new PersonaService();
        System.out.println("ingrese la cantidad de jugadores");
        int jugadores = leer.nextInt();
        if(jugadores>6){
            for (int i = 0; i < 6; i++) {
                listaPersona=personaServicio.cargar();
            }
                    
                    
        }else{
              for (int i = 0; i < jugadores; i++) {
               listaPersona= personaServicio.cargar();
            }
        }
        System.out.println("Los jugadores que estan participando son los siguientes");
        for (Persona persona : listaPersona) {
            System.out.println(persona);
        }
        System.out.println("--------------------");
        Revolver r=revolverService.llenarRevolver();
        System.out.println("la posicion del agua que tiene el revolver es" + r);
        juegoServicio.llenarJuego(listaPersona,r);
         Persona p =juegoServicio.ronda();
        System.out.println("--------------------------");
         
         System.out.println("El jugador que se mojo fue el "+ p);
        }
}
