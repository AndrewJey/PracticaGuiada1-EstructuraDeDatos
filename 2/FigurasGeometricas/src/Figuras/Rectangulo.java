/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras; //paquetes de datos
/**
 *
 * @author Andrés
 * Created: 2015-11-12 JUEVES
 */
public class Rectangulo extends figurasgeometricas.ClaseFigurasGeometricas {
    public Rectangulo() {} //Método Constructor Vacío
    /**
     * Constructor de la clase Rectángulo que hereda atributos de la clase CFG
     * @param lal - heredada
     * @param lab - heredada
     * metodo "super" de herencias
     */
    public Rectangulo(int lal, int lab) {
        super(lal, lab);
    }
        /**
     * Método Perimetro para calcular el perímetro del rectángulo
     * @return (lal*2)+(lab*2)
     */
        public float Perimetro(){
        return ((this.lal*2)+(this.lab*2));
    }  
    /**
     * Area method to calculate the area of a rectangule shape
     * @return lal*lab
     */
    public float Area(){
        return this.lal*this.lab;
    }
     //Método toString:
    /**
     * toString method in order to establish the data of the class
     * @return M.Perimetro() + M.Area()
     */
    @Override 
    public String toString() {
        return "El Perímetro del Rectángulo es: " + this.Perimetro() + ", y el Área del Rectángulo es: " + this.Area() + '\n';      
    }
}