/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.cafetera;
import Servicio.CafeteraService;

/**
 *
 * @author andre
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraService expresso = new CafeteraService();
        cafetera primerCafe = expresso.llenarCafetera();
        
        
        expresso.servirTaza(primerCafe);
        expresso.vaciarCafetera(primerCafe);
        expresso.agregarCafe(primerCafe);
        
    }
    
}
