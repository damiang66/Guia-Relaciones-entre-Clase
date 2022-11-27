
package com.mycompany.ejericicio1.servicio;

import com.mycompany.ejericicio1.entidad.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PerroService {
    private List<Perro>listaPerro = new ArrayList();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crear(){
        Perro perro = new Perro();
        System.out.println("Ingrese nombre del perro");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro");
        perro.setEdad(leer.nextInt());
        System.out.println("ingrese el tamaño del perro");
        perro.setTamanio(leer.next());
        listaPerro.add(perro);
    }
    public List<Perro> devolverLista(){
        return listaPerro;
    }
}
