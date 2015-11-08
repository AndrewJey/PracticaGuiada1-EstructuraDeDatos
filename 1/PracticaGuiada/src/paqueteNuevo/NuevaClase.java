/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteNuevo; //Paquete paqueteNuevo, dónde está mi clase "NuevaClase"

/**
 *
 * @author Andrés J. Jiménez Leandro
 */
//NuevaClase hereda de la clase "Clase" del paquete "practicaguiada"
public class NuevaClase extends practicaguiada.Clase {
    //Método constructor de la clase "NuevaClase" que hereda de la clase "Clase"
    public NuevaClase(int x, String z) { //Utilizo las variables con el mismo tipo y nombre, de mi clase padre
        super(x, z); //Uso "super" para heredar las variables de la clase padre
    }
    
  }