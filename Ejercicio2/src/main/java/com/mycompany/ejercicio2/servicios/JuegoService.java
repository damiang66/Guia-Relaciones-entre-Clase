
package com.mycompany.ejercicio2.servicios;

import com.mycompany.ejercicio2.entidades.Juego;
import com.mycompany.ejercicio2.entidades.Persona;
import com.mycompany.ejercicio2.entidades.Revolver;
import java.util.List;


public class JuegoService {
    Juego juego = new Juego();
    PersonaService servicioPersona = new PersonaService();
 
  public void llenarJuego(List<Persona> lista, Revolver r){
      juego.setPersona(lista);
      juego.setRevolver(r);
  }  
  public Persona ronda(){
      List<Persona> lista = juego.getPersona();
      Persona p = new Persona();
      for (Persona aux : lista) {
          p=aux;
          servicioPersona.disparo(juego.getRevolver(), p);
          if(aux.getMojado()){
               p= aux;
               break;
          }
          
      }
      return p;
  }
}
