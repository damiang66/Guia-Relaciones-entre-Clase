package com.mycompany.extra4;

import com.mycompany.extra4.entidades.Simulador;
import java.util.ArrayList;
import java.util.List;

public class Extra4 {

    public static void main(String[] args) {
        Simulador simulador = new Simulador();
       simulador.generarAlumnos();
        System.out.println("----------------------------");
       simulador.mostrar();
        System.out.println("---------------------------");
       simulador.votacion();
        System.out.println("-------------------------------");
       simulador.mostarListaVotos();
        System.out.println("-----------------------------------");
        System.out.println("la cantidad de votos son:" + simulador.totalVotos());
        System.out.println("-----------------------------------");
        simulador.facilitador();
    }
}
