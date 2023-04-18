/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Arrays;



/**
 *
 * @author andre
 */
public class ArraysService {
    
    public Arrays crear(){
       
        Arrays a1 = new Arrays();
        System.out.println("Generando el primer arreglo ...");
        for (int i = 0; i < 49; i++) {
            a1.getArreglo1()[i]= Math.random()*100;
            
        }
        for (int i = 0; i < 49; i++) {
            System.out.println("[" + a1.getArreglo1()[i]+ "]");
            
        }
        return a1;
        
        
       
        
    }
    
  
    
    
}
