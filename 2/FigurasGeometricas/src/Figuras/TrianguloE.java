/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras; // paquetes

/**
 *
 * @author Andrés Created: 2015-11-12 Jueves
 */
public class TrianguloE extends figurasgeometricas.ClaseFigurasGeometricas {
//CONSTRUCTOR
    public TrianguloE(int lal, int lab) {
        super(lal, lab);
    }
    public float Perimetro() {
        return this.lal * 3;
    }
    public float Area() {
        return lal*lab/2;
    }
    @Override 
    public String toString() {
        return "El Perímetro del Triángulo Equilátero es: " + this.Perimetro() + ", y el Área del Triángulo Equilátero es: " + this.Area() + '\n';      
    }
}