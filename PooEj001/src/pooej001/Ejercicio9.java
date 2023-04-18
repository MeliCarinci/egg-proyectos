/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Matematica;
import Servicio.MatematicaService;

/**
 *
 * @author andre
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:
     MatematicaService mat = new MatematicaService();
     Matematica mate1 = mat.crearNums();
     
     mat.devolverMayor(mate1);
     mat.calcularPotencia(mate1);
     mat.calculaRaiz(mate1);
     
     
    }
    
}
