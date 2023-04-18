/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.cafetera;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class CafeteraService {

    public cafetera llenarCafetera() {

        cafetera primerCafe = new cafetera();

        int llenar = primerCafe.getCapacidadMaxima();
        primerCafe.setCantidadActual(llenar);
        System.out.println("lleno:[" + primerCafe.getCapacidadMaxima() + "]");
        return primerCafe;

    }

    public void servirTaza(cafetera primerCafe) {
        Scanner leer = new Scanner(System.in);

        do {

            System.out.println("Ingrese el tamaño de la taza");
            int taza = leer.nextInt();
            int queda = primerCafe.getCantidadActual() - taza;
            primerCafe.setCantidadActual(queda);
            System.out.println(primerCafe.getCantidadActual());

        } while ( primerCafe.getCantidadActual() > 0 );

    }

    public void vaciarCafetera(cafetera primerCafe) {

        int vaciar = 0;
        primerCafe.setCantidadActual(vaciar);
        System.out.println("lleno:[" + primerCafe.getCantidadActual() + "]");

    }
    
    public void agregarCafe(cafetera primerCafe){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cafe que desea agregar");
        int agregar = leer.nextInt();
        
        if ((primerCafe.getCantidadActual()+ agregar) <= primerCafe.getCapacidadMaxima() ){
            int aux = primerCafe.getCantidadActual() + agregar;
            primerCafe.setCantidadActual(aux);
            System.out.println(primerCafe.getCantidadActual());
        } else {
            System.out.println("No se puede agregar porque supera la capacidad maxima");
        }
            
        
    }

}
