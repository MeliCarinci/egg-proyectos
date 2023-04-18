/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class CircunferenciaService {
    
    public Circunferencia crearCircunferencia(){
        
        Circunferencia cNueva = new Circunferencia();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        cNueva.setRadio(leer.nextDouble());
        
        return cNueva;
        
    }
    public void area(Circunferencia cNueva){
        
        double area = 0;
        area =  3.14 *(cNueva.getRadio()* cNueva.getRadio());
        System.out.println("El area de la Circunferencia con un radio de " + cNueva.getRadio() + " es de: " + area);
       
        
        
    }
    
    public void perimetro(Circunferencia cNueva){
        
        double perimetro = 0;
        perimetro = 2 * 3.14 * cNueva.getRadio();
        System.out.println("El perimetro de la Circunferencia con un radio de " + cNueva.getRadio() + " es de: " + perimetro);
                
        
    }
    
}
