/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Circunferencia;
import Servicio.CircunferenciaService;

/**
 *
 * @author andre
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircunferenciaService circ = new CircunferenciaService();
        Circunferencia cNueva = circ.crearCircunferencia();
        
        
        circ.area(cNueva);
        circ.perimetro(cNueva);
        
    }
    
}
