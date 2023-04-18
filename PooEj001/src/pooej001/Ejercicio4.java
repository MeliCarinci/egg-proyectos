/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Rectangulo;
import Servicio.RectanguloService;

/**
 *
 * @author andre
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        
        RectanguloService rec = new RectanguloService();
        Rectangulo primerRec = rec.crearRectangulo();
        
        rec.perimetro(primerRec);
        rec.area(primerRec);
        rec.dibujar(primerRec);
        
    }
    
}
