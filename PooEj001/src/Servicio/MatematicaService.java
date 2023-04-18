/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author andre
 */
public class MatematicaService {
    
    
    
    public Matematica crearNums(){
       Matematica mate1 = new Matematica(); 
       
        mate1.setNumero1(Math.random());
        mate1.setNumero2(Math.random());
        System.out.println( "primer num " + mate1.getNumero1() + "segundo num " + mate1.getNumero2() );
        
        return mate1;
    }
    
    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
     public void devolverMayor(Matematica mate1){
         
         System.out.println(  " El número mayor es:  " + Math.max(mate1.getNumero1(), mate1.getNumero2()));
         
     }
    
    //b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.
     
     public void calcularPotencia(Matematica mate1){
         
         double num1 = Math.round(mate1.getNumero1());
         double num2 = Math.round(mate1.getNumero2());
         
         if (num1 > num2){
             System.out.println( " la potencia del mayor valor de la clase elevado al menor número " + Math.pow(num1, num2));
         } else {
             System.out.println( " la potencia del mayor valor de la clase elevado al menor número " + Math.pow(num2, num1));
         }
         
     }
    //c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
     
     public void calculaRaiz(Matematica mate1){
         
         double num1 = Math.abs(mate1.getNumero1());
         double num2 = Math.abs(mate1.getNumero2());
         
         if (num1 > num2){
             System.out.println( " la raíz cuadrada del menor de los dos valores. " + Math.sqrt(num2));
         } else {
             System.out.println( " la raíz cuadrada del menor de los dos valores. " + Math.sqrt(num1));
         }
         
     }

    
}
