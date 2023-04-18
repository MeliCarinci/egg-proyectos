/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Operacion;
import Servicio.OperacionService;

/**
 *
 * @author andre
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here CircunferenciaService circ = new CircunferenciaService();
        //Circunferencia cNueva = circ.crearCircunferencia();
        
        
        //circ.area(cNueva);
        //circ.perimetro(cNueva);
        OperacionService uno = new OperacionService();
        Operacion primerOp = uno.crearOperacion();
        
        uno.sumar(primerOp);
        uno.resta(primerOp);
        
        
        
    }
    
}
