/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Libro;
import Servicio.LibroService;

/**
 *
 * @author andre
 */
public class PooEj001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroService ls = new LibroService();
        Libro lirbo1 = ls.altaLibro();
        
        ls.mostrarLibro(lirbo1);
        
    }
    
}
