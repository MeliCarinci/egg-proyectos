/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
//Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
//deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
//se puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
        
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese una fecha (pasada)");
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        
        Date fecha1 = new Date(( anio - 1900 ), ( mes - 1 ), dia);
        System.out.println(fecha1.toString());
        
        System.out.println("Fecha actual");
        Date fecha2 = new Date();
        System.out.println(fecha2.toString());
        
        System.out.println("¿Cuantos años hay de diferencia?");
        
        if (fecha1.getMonth()>fecha2.getMonth()){
            System.out.println(fecha2.getYear()-fecha1.getYear()-1);
        }else{
            System.out.println(fecha2.getYear()-fecha1.getYear());
        }
    
        
    }
    
}
