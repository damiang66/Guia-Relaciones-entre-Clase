package com.mycompany.ejericicio1.servicio;

import com.mycompany.ejericicio1.entidad.Perro;
import com.mycompany.ejericicio1.entidad.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaService {

    List<Persona> listaPersona = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public List<Perro> crear(List<Perro> listaPerro) {
        List<Perro> lista=listaPerro;
        Persona persona = new Persona();
        System.out.println("ingrese el nombre de la persona");
        persona.setNombre(leer.next());
        System.out.println("ingrese el apellido de la persona");
        persona.setApellido(leer.next());
        System.out.println("ingrese la edad de la persona");
        persona.setEdad(leer.nextInt());
        System.out.println("ingrese el dni de la persona");
        persona.setDni(leer.nextLong());
        System.out.println("A continuacion le muestro los perro disponibles");
        for (Perro perro : listaPerro) {
            if(perro.isAdoptado()==false){
                 System.out.println(perro.getNombre());
            
            }
           
            
        }
        System.out.println("ingrese el nombre del perro para adoptar");
        String nombre=leer.next();
        for (Perro perro : listaPerro) {
            if(perro.getNombre().equals(nombre) && perro.isAdoptado()==false){
                perro.setAdoptado(true);
                persona.setPerro(perro);
            }
        }
        
        listaPersona.add(persona);
        return listaPerro;
    }
  
    public void mostrar(){
        for (Persona persona : listaPersona) {
            System.out.println(persona);
        }
   
    }
}
