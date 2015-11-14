/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas;

/**
 *
 * @author Andrés
 */
public class ClaseFigurasGeometricas extends Object {
    //VARIABLES:
    public int lal; // lado-alto-largo
    public int lab; // lado-ancho-base
    //CONSTRUCTOR:
    /**
     * Método Constructor Vacío de la Clase CFG
     * 
     **/
    //public NombreDeLaClase(tipoVariable nombreVariable) { }
    public ClaseFigurasGeometricas() {
    }    
    /**
     * Método Constructor Lleno de la Clase CFG
     * @param lal
     * @param lab
     */
        public ClaseFigurasGeometricas(int lal, int lab){
        this.lal = lal;
        this.lab = lab;
    }
    //MÉTODOS SET Y GET:
    /**
     * Método set de LAL para asignar la variable
     * @param lal
     */
        public void setLal(int lal) {
        this.lal = lal;
    }
    /**
     * Método get de LAL para obtener la variable
     * @return lal
     */
    public int getLal() {
        return this.lal;
    }
    /**
     * Set method to make the setting of the lab variable
     * @param lab
     */
        public void setLab(int lab) {
        this.lab = lab;
    }
    /**
     * Get method to obtain the LAB variable
     * @return lab
     */
    public int getLab() {
        return this.lab;
    }    
    //Método toString:
    /**
     * Método toString para imprimir los datos de la clase
     * @return lal + lab
     */
    @Override //Sobreescritor de Elemento
    public String toString() {
        return "La Figura Geométrica tiene de Lado-Ancho-Largo: " + lal + ", y de Lado-Alto-Base: " + lab + '\n';    
    //Sentencia de escape '\n', equivale a un "enter".
    }
}