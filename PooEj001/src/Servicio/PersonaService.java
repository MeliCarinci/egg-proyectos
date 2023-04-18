/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author andre
 */
public class PersonaService {

    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in);
        Persona persona1 = new Persona();

        System.out.println("Ingrese el nombre");
        persona1.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        persona1.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo \n" + "H - Hombre \n" + "M - Mujer \n" + "O - Otro");
        persona1.setSexo(leer.next());
        
        while (!"M".equals(persona1.getSexo()) && !"H".equals(persona1.getSexo()) && !"O".equals(persona1.getSexo()) && !"m".equals(persona1.getSexo()) && !"h".equals(persona1.getSexo()) && !"o".equals(persona1.getSexo()) ){
            System.out.println("La opcion no es correcta, ingrese el sexo");
            persona1.setSexo(leer.next());
        }
        System.out.println("Ingrese el peso");
        persona1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        persona1.setAltura(leer.nextDouble());
        
        return persona1;

    }
    
    public void calcularIMC(Persona persona1){
        
       double pesoIdeal = persona1.getPeso() / Math.pow(persona1.getAltura(), 2);
        System.out.println(pesoIdeal);
        System.out.println(persona1.getNombre());
       if (pesoIdeal < 20){
           System.out.println("Esta por debajo de su peso ideal (-1)");
       } else {
           if (pesoIdeal <= 25 && pesoIdeal > 20){
               System.out.println("Esta en su peso ideal (0)");
           } else {
               System.out.println("Esta en sobrepeso (1)");
           }
       }
        
    }
    
    public void esMayorDeEdad(Persona persona1){
       
        boolean aux = false;
        if (persona1.getEdad() >= 21){ 
            aux= true;
            System.out.println(persona1.getNombre());
            System.out.println("es mayor de edad");
            
        } else {
            System.out.println(persona1.getNombre());
            System.out.println("No es mayor de edad");
        }
           
      
        
        
        
    }

}
