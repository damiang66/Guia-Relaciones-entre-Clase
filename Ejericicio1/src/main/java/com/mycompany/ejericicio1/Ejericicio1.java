package com.mycompany.ejericicio1;

import com.mycompany.ejericicio1.entidad.Perro;
import com.mycompany.ejericicio1.servicio.PerroService;
import com.mycompany.ejericicio1.servicio.PersonaService;
import java.util.List;

public class Ejericicio1 {

    public static void main(String[] args) {
        PersonaService personaService = new PersonaService();
        PerroService perroService = new PerroService();
        for (int i = 0; i < 2; i++) {
            perroService.crear();

        }
        List<Perro> lista=perroService.devolverLista();
       
        lista=personaService.crear(lista);
              lista=personaService.crear(lista);
           
            
     
        personaService.mostrar();
    }
}
