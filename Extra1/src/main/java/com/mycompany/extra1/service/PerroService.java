package com.mycompany.extra1.service;

import com.mycompany.extra1.entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*+
 private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;
    private boolean adoptado;
 */
public class PerroService {

    List<Perro> listaPerro = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPeero() {
        Perro p = new Perro();
        System.out.println("-------------------------");
        System.out.println("ingrese Nombre del perro ");
        p.setNombre(leer.next());
        System.out.println("ingrese Edad del perro ");
        p.setEdad(leer.nextInt());
        System.out.println("ingrese Raza del perro ");
        p.setRaza(leer.next());
        System.out.println("ingrese Tamaño del perro ");
        p.setTamanio(leer.next());
        listaPerro.add(p);
    }
    public List<Perro> listarPerro(){
       return listaPerro;
    }
}
