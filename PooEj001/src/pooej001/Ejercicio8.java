/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Cadena;
import Servicio.CadenaService;

/**
 *
 * @author andre
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CadenaService cad = new CadenaService();
        Cadena cadena1 = cad.crearCadena();
        
        cad.mostrarVocales(cadena1);
        cad.invertirFrase(cadena1);
        cad.vecesRepetido(cadena1);
        cad.compararLongitud(cadena1);
        cad.unirFrases(cadena1);
        cad.reemplazar(cadena1);
        cad.contiene(cadena1);
        
    }
    
}
