/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaguiada; //Paquete practicaguiada, dónde está mi clase "Clase"

/**
 *
 * @author Andrés J. Jiménez Leandro
 */
public class OtraClase {

    //Variables

    int z1 = 0;
    String x1 = "";

    //Método Constructor Vacío
    public OtraClase() {
    }
    
    //Instancia para llamar y utilizar una clase en otra
    practicaguiada.Clase c1 = new Clase(z1, x1);
    
    //Método para utilizar los datos de la otra clase, por medio de la instancia
    public int numeros(int y){
       int resultado;
        c1.setX(y);
        resultado = c1.getX();       
        return(resultado);
    }
}