/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaguiada; //Paquete practicaguiada, dónde está mi clase "Clase"

/**
 *
 * @author Andrés J. Jiménez Leandro
 **/
public class Clase extends Object{
    //VARIABLES
    private int x; //Variable x de Número entero privada
    private String z; //Variable z de tipo String privada

    //Constructor Vacío
    public Clase() {
    }
    
    //Método Constructor de la clase
    public Clase(int x, String z) { //Constructor tiene la misma
      this.x = x; //
      this.z = z;
    }
 
    //TODO VOID NO TIENE RETORNO; porque es vacío. USA y ASIGNA la variable, pero NO la hace utilizable, ni imprimible, ni la devuelve.
    public void /*vacío*/ setX(int x) {
        this.x = x;
    }
    //El método GET siempre, siempre USA el mismo TIPO de la Variable por obtener
    public int getX(){
        return x; //
    }   
}