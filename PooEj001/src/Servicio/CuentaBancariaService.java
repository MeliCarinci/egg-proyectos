/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class CuentaBancariaService {

    public CuentaBancaria crearCuenta() {

        CuentaBancaria primerCu = new CuentaBancaria();
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese número de cuenta");
        primerCu.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        primerCu.setDni(leer.nextInt());
        System.out.println("Ingrese el saldo actual");
        primerCu.setSaldoActual(leer.nextDouble());
        return primerCu;

    }
    
    public void ingresar(CuentaBancaria primerCu){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dinero que desea ingresar");
        primerCu.setIngreso(leer.nextDouble());
        
        double nuevoSaldo = primerCu.getSaldoActual() + primerCu.getIngreso();
        
        System.out.println("El total de su dinero es de " + nuevoSaldo);
        primerCu.setSaldoActual(nuevoSaldo);
        
    }
    
    public void retirar(CuentaBancaria primerCu){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dinero que desea retirar");
        primerCu.setRetiro(leer.nextDouble());
        
        if (primerCu.getRetiro() > primerCu.getSaldoActual()){
            
            System.out.println("No se puede retirar dicho monto, supera al saldo actual que es de " + primerCu.getSaldoActual());
            
        } else {
            
            double saldoMenos = primerCu.getSaldoActual() - primerCu.getRetiro();
            System.out.println("En su cuenta ahora le quedan " + saldoMenos);
            primerCu.setSaldoActual(saldoMenos);
        }
        
    }
    
    public void extraccionRapida(CuentaBancaria primerCu){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto que desea retirar de forma rapida");
        primerCu.setRetiro(leer.nextDouble());
        double limiteExtraccion = primerCu.getSaldoActual()* 0.2;
                
        if (primerCu.getRetiro() > limiteExtraccion){
            System.out.println("Error: No puedes sacar más del 20% de tu saldo.");
            
        } else {
           double saldoQueda = primerCu.getSaldoActual() - primerCu.getRetiro();
           System.out.println("Se han extraído $" + primerCu.getRetiro() + " de tu cuenta.");
           System.out.println("Quedan $ " + saldoQueda + " disponibles" ); 
           primerCu.setSaldoActual(saldoQueda);
        } 
        
    }
    
    public void consultarSaldo(CuentaBancaria primerCu){
        
        System.out.println("El saldo que queda disponible en su cuenta es " + primerCu.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria primerCu){
        System.out.println(primerCu.toString());
    }
    

}
