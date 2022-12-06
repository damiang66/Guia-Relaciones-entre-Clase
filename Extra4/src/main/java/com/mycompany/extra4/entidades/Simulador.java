package com.mycompany.extra4.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Simulador {

    private List<Alumno> listaPersona = new ArrayList();
    public List<String> listaNombre = new ArrayList();
    public List<String> apellidos = new ArrayList();
    public List<String> Nombrecompleta = new ArrayList();
    public Random aleatorio = new Random();
    public List<Integer> listaDNI = new ArrayList();
    private List<Voto> listaVotos = new ArrayList();

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public List<String> listaNombres(int cantidad) {

        listaNombre.add("juan");

        listaNombre.add("Fernando");
        listaNombre.add("Sergio");
        listaNombre.add("Gustavo");
        listaNombre.add("Erica");
        listaNombre.add("Claria");
        apellidos.add("Perez");
        apellidos.add("Gomez");
        apellidos.add("Lopez");
        apellidos.add("Gonzalez");
        apellidos.add("Godoy");
        for (int i = 0; i < cantidad; i++) {
            int indice = aleatorio.nextInt(5);
            Nombrecompleta.add(listaNombre.get(indice) + " " + apellidos.get(indice));
        }
        return Nombrecompleta;
    }

    public List<Integer> listaDni(int cantidad) {
        int contador = 0;
        do {

            Integer numero = aleatorio.nextInt(99999999);

            if (numero.toString().length() == 8) {
                contador++;
                listaDNI.add(numero);

            }
        } while (contador < cantidad);
        return listaDNI;
    }

    public void generarAlumnos() {

        System.out.println("Ingrese la cantidad de alumnos que son en el instituto");
        int cantidad = leer.nextInt();
        this.listaNombres(cantidad);
        this.listaDni(cantidad);
        for (int i = 0; i < cantidad; i++) {
            Alumno a = new Alumno();
            a.setNombre(Nombrecompleta.get(i));

            a.setDni(listaDNI.get(i));
            listaPersona.add(a);
        }

    }

    public void mostrar() {
        System.out.println("los alumnos del institutos son: " + listaPersona.size());
        for (Alumno alumno : listaPersona) {
            System.out.println(alumno);
        }
    }

    public void votacion() {
        List<Alumno> alumnoVotado = new ArrayList();
        
        for (int i = 0; i < listaPersona.size(); i++) {
            List<String> meVotaron = new ArrayList();
            Voto voto = new Voto();

            voto.setAlumno(listaPersona.get(i));
           // listaPersona.get(i).setVotaron(meVotaron);
            System.out.println("esta persona " + listaPersona.get(i));
            for (int j = 0; j < 3; j++) {
                int indice = aleatorio.nextInt(listaPersona.size());
                if (indice == i) {
                    j--;
                } else {
                    alumnoVotado.add(listaPersona.get(indice));
                    
                    System.out.println("voto a " + listaPersona.get(indice));
                  //  meVotaron.add(voto.getAlumnovotados().get(indice).getNombre());
                   // listaPersona.get(indice).setVotaron(meVotaron);
                    listaPersona.get(indice).setCantidadVotos(listaPersona.get(indice).getCantidadVotos() + 1);
                }
            }
            voto.setAlumnovotados(alumnoVotado);
            listaVotos.add(voto);
        }

    }

    public void mostarListaVotos() {
        for (int i = 0; i < listaVotos.size(); i++) {
            System.out.println(listaVotos.get(i));
        }

}
    public Integer totalVotos(){
        Integer cantidadTotal=0;
        for (Alumno alumno : listaPersona) {
            cantidadTotal+=alumno.getCantidadVotos();
        }
        return cantidadTotal;
    }
    public void facilitador(){
        Collections.sort(listaPersona,new Alumno());
        System.out.println("facilitarores");
        for (int i = 0; i < listaPersona.size(); i++) {
            if(i<6){
            System.out.println(listaPersona.get(i));
            }
        }
        System.out.println("-------------------");
        System.out.println("Suplentes");
        for (int i = 5; i < listaPersona.size(); i++) {
            if (i<11){
            System.out.println(listaPersona.get(i));
            }
        }
    }
}