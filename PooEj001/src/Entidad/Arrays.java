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
public class Arrays {

    private double[] arreglo1;
    private double[] arreglo2;

    public Arrays() {
    }

    public Arrays(double[] arreglo1, double[] arreglo2) {
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }

    public double[] getArreglo1() {
        return arreglo1;
    }

    public void setArreglo1(double[] arreglo1) {
        
        this.arreglo1 = arreglo1;
    }

    public double[] getArreglo2() {
        return arreglo2;
    }

    public void setArreglo2(double[] arreglo2) {
        
        this.arreglo2 = arreglo2;
    }

    @Override
    public String toString() {
        return "Arrays{" + "arreglo1=" + arreglo1 + ", arreglo2=" + arreglo2 + '}';
    }

}
