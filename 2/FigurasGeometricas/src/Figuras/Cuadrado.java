/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;
/**
 *
 * @author Andrés
 */
public class Cuadrado extends figurasgeometricas.ClaseFigurasGeometricas {
    /**
     * Constructor de la clase Cuadrado que hereda atributos de la clase CFG
     * @param lal - heredada
     * @param lab - heredada
     * metodo "super" de herencias
     */
    public Cuadrado(int lal, int lab) {
        super(lal, lab); //Las variables ya formadas en el constructor de la clase padre
    }
    //Métodos:
    /**
     * Método Perimetro para calcular el perímetro del cuadrado
     * @return lal*4
     */
        public float Perimetro(){
        return this.lal*4;
    }  
    /**
     * Area method to calculate the area of a square shape
     * @return lal*2
     */
    public float Area(){
        return lal*2;
    }
     //Método toString:
    /**
     * toString method in order to establish the data of the class
     * @return M.Perimetro() + M.Area()
     */
    @Override 
    public String toString() {
        return "El Perímetro del Cuadrado es: " + this.Perimetro() + ", y el Área del Cuadrado es: " + this.Area() + '\n';      
    }
}