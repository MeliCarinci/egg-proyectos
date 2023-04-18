/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaService;

/**
 *
 * @author andre
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancariaService cbu = new CuentaBancariaService();
        CuentaBancaria primerCu = cbu.crearCuenta();
        
        cbu.ingresar(primerCu);
        System.out.println("");
        cbu.retirar(primerCu);
        System.out.println(" ");
        cbu.extraccionRapida(primerCu);
        System.out.println(" ");
        cbu.consultarSaldo(primerCu);
        System.out.println(" ");
        cbu.consultarDatos(primerCu);
        
    }
    
}
