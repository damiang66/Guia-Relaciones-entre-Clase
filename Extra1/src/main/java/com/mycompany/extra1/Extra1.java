
package com.mycompany.extra1;


import com.mycompany.extra1.service.PerroService;
import com.mycompany.extra1.service.PersonaService;
import java.util.Scanner;


public class Extra1 {

    public static void main(String[] args) {
      
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de Perros");
        PerroService perroService = new PerroService();
        PersonaService personaService = new PersonaService();
        int cantidadPerro= leer.nextInt();
        for (int i = 0; i < cantidadPerro; i++) {
            perroService.crearPeero();
        }
        System.out.println("Ingrese la cantidad de Personas");
        int cantidadPersonas = leer.nextInt();
        for (int i = 0; i < cantidadPersonas; i++) {
            personaService.CrearPersona(perroService.listarPerro());
            
        }
        System.out.println(personaService.listarPersona()); 

    }

}
