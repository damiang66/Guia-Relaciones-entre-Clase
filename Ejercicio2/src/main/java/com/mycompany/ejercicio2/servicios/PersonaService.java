package com.mycompany.ejercicio2.servicios;

import com.mycompany.ejercicio2.entidades.Persona;
import com.mycompany.ejercicio2.entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaService {

    List<Persona> listaPersona = new ArrayList();
    Scanner leer = new Scanner(System.in);
    RevolverService revolverServicio = new RevolverService();

    int contador=0;
    public List<Persona> cargar() {
        Persona persona = new Persona();
        persona.setId(contador+1);
        persona.setNombre("Jugador"+" "+ persona.getId());
        persona.setMojado(false);
        listaPersona.add(persona);
        contador++;
        return listaPersona;
    }

    public boolean disparo(Revolver r,Persona p) {

        revolverServicio.SiguienteChorro(r);
        Boolean mojado= revolverServicio.mojar(r);
        if (mojado){
            
                p.setMojado(mojado);
            }
        
        
        return mojado;
    }
}
