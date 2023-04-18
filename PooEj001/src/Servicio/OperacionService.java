/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class OperacionService {

    public Operacion crearOperacion() {

        Operacion primerOp = new Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        primerOp.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo número");
        primerOp.setNumero2(leer.nextInt());
        return primerOp;

    }

    public void sumar(Operacion primerOp) {

        int suma;
        suma = primerOp.getNumero1() + primerOp.getNumero2();
        System.out.println(suma);

    }

    public void resta(Operacion primerOp) {

        int resta;
        resta = primerOp.getNumero1() - primerOp.getNumero2();
        System.out.println(resta);
    }

    public void multiplicacion(Operacion primerOp) {

      

        if (primerOp.getNumero1() == 0  || primerOp.getNumero2() == 0 ){
            
            System.out.println("Error: No se puede multiplicar por cero.");
            
        } else {
            int resultado = primerOp.getNumero1() * primerOp.getNumero2();
            
            

        }
        System.out.println();

    }
    
    public int division(Operacion primerOp){
        
        if (primerOp.getNumero1() == 0  || primerOp.getNumero2() == 0 ){
            
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } else {
            int resultado = primerOp.getNumero1() % primerOp.getNumero2();
            return resultado;
            

        }
        
        
        
    }

}
