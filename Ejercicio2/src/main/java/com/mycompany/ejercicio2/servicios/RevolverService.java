
package com.mycompany.ejercicio2.servicios;

import com.mycompany.ejercicio2.entidades.Revolver;
import java.util.Random;


public class RevolverService {
 
    
    public Revolver llenarRevolver(){
           Revolver r = new Revolver();
        Random aleatorio = new Random();

           int l=0;
       while(l==0){
        r.setPosicionAgua(aleatorio.nextInt(6));
        int actual = aleatorio.nextInt(6);
        if(actual>=r.getPosicionAgua()){
          actual = aleatorio.nextInt(6);   
        }else{
            r.setPosicionActual(actual);
            l=1;
        }
         }
     
    // r.setPosicionActual(aleatorio.nextInt(6));
    // r.setPosicionAgua(aleatorio.nextInt(6));
      
      
        
        return r;
    }
    public Boolean mojar(Revolver r){
        Boolean validar=false;
     
        if(r.getPosicionActual()==r.getPosicionAgua()){
            validar=true;
        }
        return validar;
    }
    public void SiguienteChorro(Revolver r){
      //  if(r.getPosicionActual()==6){
          //  r.setPosicionActual(1);
      //  }
            r.setPosicionActual(r.getPosicionActual()+1);
        }
        
    }
   
    

