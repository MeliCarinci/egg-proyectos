/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class CursoService {

    public String[] cargarAlumnos(){
       Scanner leer = new Scanner(System.in);
        System.out.println( "***Ingreso de alumnos***" );
        String [] arreglo;
        arreglo = new  String [ 5 ];
        for (int i = 0 ; i < 5 ; i ++) {
            System.out.println( "Ingrese el nombre del alumno #" + ( i + 1 ));
            arreglo [ i ] = leer.next();
        }
        return arreglo ; 
    }
    
    public Curso crearCurso() {
        Curso c1 = new Curso();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso");
        c1.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia");
        c1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias por semana");
        c1.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Inegrese el turno:\n " + "M - mañana \n" + " T - tarde \n");
        c1.setTurno(leer.next());
        
        
        while ((!"M".equals(c1.getTurno())) && (!"T".equals(c1.getTurno()))) {
            System.out.println("La opcion no es correcta, ingrese por favor el Turno");
            c1.setTurno(leer.next()); 
            

        }
        System.out.println("Ingrese el precio por hora");
        c1.setPrecioPorHora(leer.nextDouble());
        
        c1.setAlumnos(cargarAlumnos());
        
        return c1;
    }
        public void calcularGananciaSemanal(Curso c1){
            double resultado ;
            resultado = c1.getCantidadHorasPorDia()*c1.getPrecioPorHora()*c1.getCantidadDiasPorSemana()*c1.getAlumnos().length;
            System.out.println("Las ganancias semanales son: $ " + resultado);
        }
        
//Método calcularGananciaSemanal(): este método se encarga de calcular
//la ganancia en una semana por curso. Para ello, se deben multiplicar 
//la cantidad de horas por día, el precio por hora, la cantidad de 
//alumnos y la cantidad de días a la semana que se repite el encuentro.

    

    
}
