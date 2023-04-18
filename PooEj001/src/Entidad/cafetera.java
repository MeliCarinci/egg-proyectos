/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author andre
 */
public class cafetera {
    public int capacidadMaxima;
    public int cantidadActual;

    public cafetera() {
    }

    public cafetera(int capacidadMaxima, int cantidadActual) {
        capacidadMaxima = 1500;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        capacidadMaxima = 1500;
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
       capacidadMaxima = 1500;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Caferera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
}
