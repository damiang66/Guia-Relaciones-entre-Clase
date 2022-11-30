
package com.mycompany.extra1.service;

import com.mycompany.extra1.entidades.Perro;
import com.mycompany.extra1.entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
  private String nombre;
    private String apellido;
    private Integer edad;
    private Long dni;
    private Perro perro;
*/

public class PersonaService {
    List<Persona> listaPersona = new ArrayList();
      
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    PerroService perroServicio = new PerroService();
    public void CrearPersona(List<Perro> listaPerros){
      Persona p = new Persona();
        System.out.println("------------------");
        System.out.println("Ingrese el nombre de la persona");
        p.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona");
        p.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese el DNI de la persona");
        p.setDni(leer.nextLong());
       
    
        System.out.println("los Perros disponibles para adopar son");
        for (Perro perro : listaPerros) {
         
            if (perro.isAdoptado()==false){
                System.out.println(perro);
            }
        }
         System.out.println("Ingrese el nombre de la mascota para adoptar");
        String mascota = leer.next();
        for (Perro perro : listaPerros) {
            if(mascota.equalsIgnoreCase(perro.getNombre()) & perro.isAdoptado()==false){
                perro.setAdoptado(true);
                p.setPerro(perro);
            }
            
        }
        listaPersona.add(p);
        if (p.getPerro()==null){
            System.out.println("la mascota no exite o ya fue asignada");
        }
        System.out.println(p);
    }
   public List<Persona> listarPersona(){
       return listaPersona;
   }
    
}
