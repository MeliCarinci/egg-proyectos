/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona2;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Persona2Service {

    public Persona2 crearPersona() {
        Persona2 p1 = new Persona2();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());

        System.out.println("Ingrese la fecha de nacimiento");
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);
        p1.setNacimiento(fecha);

        return p1;
    }

    public void calcularEdad(Persona2 p1) {

        Date fechaActual = new Date();

        if (p1.getNacimiento().getMonth() > fechaActual.getMonth()) {
            System.out.println("La edad de " + p1.getNombre() + " es: " + (fechaActual.getYear() - p1.getNacimiento().getYear() - 1));
        } else {

            System.out.println("La edad de " + p1.getNombre() + " es: " + (fechaActual.getYear() - p1.getNacimiento().getYear()));
        }

    }

    //Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
//edad y retorna true en caso de que el receptor tenga menor edad que la persona que
//se recibe como parámetro, o false en caso contrario.
    public void menorQue(Persona2 p1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una nueva edad para comparar si la persona es mayor");
        int nuevaEdad = leer.nextInt();
        Date fechaActual = new Date();
        int edad;
        if (p1.getNacimiento().getMonth() > fechaActual.getMonth()) {
            
            edad = (fechaActual.getYear() - p1.getNacimiento().getYear() - 1);

        } else {

            
            edad = (fechaActual.getYear() - p1.getNacimiento().getYear());

        }
        if (edad > nuevaEdad){
            System.out.println("falso. La persona no es mayor");
        } else {
            System.out.println("verdadero. La persona es mayor que " + p1.getNombre());
        }

    }
    
    //Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
    public void mostrarPersona(Persona2 p1){
        System.out.println("--------");
        System.out.println("Datos Personales");
        System.out.println( "Nombre: " + p1.getNombre());
        System.out.println("Fecha nacimiento: " + p1.getNacimiento().getDate() + "/"+ (p1.getNacimiento().getMonth()+1) + "/" + p1.getNacimiento().getYear());
        
    }
}
