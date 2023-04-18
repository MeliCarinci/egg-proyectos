/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej001;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author andre
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService person = new PersonaService();
        Persona persona1 = person.crearPersona();
        person.calcularIMC(persona1);
        person.esMayorDeEdad(persona1);
        System.out.println("---------");

        Persona persona2 = person.crearPersona();
        person.calcularIMC(persona2);
        person.esMayorDeEdad(persona2);
        System.out.println("---------");

        Persona persona3 = person.crearPersona();
        person.calcularIMC(persona3);
        person.esMayorDeEdad(persona3);
        System.out.println("---------");

        Persona persona4 = person.crearPersona();
        person.calcularIMC(persona4);
        person.esMayorDeEdad(persona4);

    }

}
