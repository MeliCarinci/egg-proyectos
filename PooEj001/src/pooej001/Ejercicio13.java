/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Curso;
import Servicio.CursoService;

/**
 *
 * @author andre
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs = new CursoService();
        Curso c1 = cs.crearCurso();
        
        cs.calcularGananciaSemanal(c1);
    }
    
}
