/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class LibroService {

    public Libro altaLibro() {

        Libro libro1 = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número del ISBN");
        libro1.setIsbn(leer.nextInt());
        System.out.println("Ingrese el Titulo del libro");
        libro1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        libro1.setAutor(leer.next());
        System.out.println("Ingrese el numero de páginas");
        libro1.setNumPag(leer.nextInt());
        return libro1;

    }

    public void mostrarLibro(Libro libro1) {

        System.out.println("El número del ISBN es " + libro1.getIsbn());

        System.out.println("El Titulo es " + libro1.getTitulo());

        System.out.println("El autor es " + libro1.getAutor());

        System.out.println("Tiene un total de " + libro1.getNumPag() + "páginas.");

    }

}
