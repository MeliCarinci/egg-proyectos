/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class CadenaService {

    public Cadena crearCadena() {

        Cadena cadena1 = new Cadena();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase deseada");
        cadena1.setFrase(leer.nextLine().toLowerCase());
        cadena1.setLongitud(cadena1.getFrase().length());
        return cadena1;

    }

    public void mostrarVocales(Cadena cadena1) {

        int vocal = 0;

        for (int i = 0; i < cadena1.getLongitud(); i++) {

            char aux = cadena1.getFrase().charAt(i);

            switch (aux) {
                case 'a':
                    vocal = vocal + 1;
                    break;
                case 'e':
                    vocal = vocal + 1;
                    break;
                case 'i':
                    vocal = vocal + 1;
                    break;
                case 'o':
                    vocal = vocal + 1;
                case 'u':
                    vocal = vocal + 1;
                    break;

            }

        }

        System.out.println("La frase contiene " + vocal + " vocales");

    }
    // Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase(Cadena cadena1) {
        System.out.println("La frase invertida queda: ");

        for (int i = (cadena1.getLongitud() - 1); i >= 0; i--) {

            char aux = cadena1.getFrase().charAt(i);
            System.out.print(aux);

        }
        System.out.println(" ");
    }

    //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    //contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    // Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(Cadena cadena1) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra que desea contabilizar");
        char letra = leer.next().charAt(0);
        int cont = 0;

        for (int i = 0; i < cadena1.getLongitud(); i++) {

            char aux = cadena1.getFrase().charAt(i);
            if (aux == letra) {
                cont = cont + 1;

            }

        }

        System.out.println("Se encontraron  " + cont + " '" + letra + "'" + " en la palabra o frase");

    }

    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    //compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cadena1) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la segunda frase para comparar su longitud");
        String segundaFrase = leer.next();
        int segundaLong = segundaFrase.length();

        if (cadena1.getLongitud() == segundaLong) {

            System.out.println("La dos frases tienen una misma longitud");

        } else {
            System.out.println("No coincide la longitud entre frases");
            System.out.println("La primera es de " + cadena1.getLongitud());
            System.out.println("La segunda es de " + segundaLong);
        }

    }

    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena cadena1) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la segunda frase que desea agregar");
        String segundaFrase = leer.nextLine();

        System.out.println("el resultado de unir estas frases es: " + "'" + cadena1.getFrase().concat(segundaFrase) + "'");

    }
    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
//la frase resultante.

    public void reemplazar(Cadena cadena1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el caracter por el que quiere reemplazar la letra A");
        String caracter = leer.next().toLowerCase();

        String aux = cadena1.getFrase().replaceAll("a", caracter);
        System.out.println("La frase resultante es " + aux);

    }
    
    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public void contiene(Cadena cadena1){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra que desea contabilizar");
        String letra = leer.next().toLowerCase();
        
        System.out.println (cadena1.getFrase().contains(letra));
        
        
    }
}
