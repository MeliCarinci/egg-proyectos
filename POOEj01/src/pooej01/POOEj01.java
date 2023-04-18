/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author andre
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona primeraPersona = new Persona();
        
        Persona segundaPersona = new Persona("Melani","Carinci",39453434);
        
        System.out.println(primeraPersona);
        
        System.out.println(segundaPersona.nombre + " " +segundaPersona.apellido + " " + segundaPersona.dni);
        
        System.out.println(segundaPersona.getApellido());
        
        segundaPersona.setNombre("Andres");
        
        System.out.println(segundaPersona.getNombre());
        
        
        
    }
    
}
