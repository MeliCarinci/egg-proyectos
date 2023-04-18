/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class RectanguloService {

    public Rectangulo crearRectangulo() {

        Rectangulo primerRec = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Altura");
        primerRec.setAltura(leer.nextInt());
        System.out.println("Ingrese la Base");
        primerRec.setBase(leer.nextInt());
        
        return primerRec;

    }
    
    public void area (Rectangulo primerRec){
        
        int area = primerRec.getBase() * primerRec.getAltura();
        System.out.println("El area del rectangulo es de " + area);
    }
    
    public void perimetro (Rectangulo primerRec){
        
        int perimetro = (primerRec.getBase() + primerRec.getAltura())*2;
        System.out.println("El perimetro del rectangulo es de " + perimetro);
    }
    
    public void dibujar (Rectangulo primerRec){
        
        for (int i = 0; i < primerRec.getAltura() ; i++) {
            for (int j = 0; j < primerRec.getBase() ; j++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
            
        }
    }

}
