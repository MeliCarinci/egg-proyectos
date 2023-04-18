/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Persona2;
import Servicio.Persona2Service;



/**
 *
 * @author andre
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona2Service ps = new Persona2Service();
        Persona2 p1 = ps.crearPersona();
        
        ps.calcularEdad(p1);
        ps.menorQue(p1);
        ps.mostrarPersona(p1);
        
    }
    
}
