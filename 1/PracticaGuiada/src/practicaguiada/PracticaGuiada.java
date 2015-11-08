/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaguiada;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrés J. Jiménez Leandro Creación: 2015-11-05 JUEVES
 */
public class PracticaGuiada extends Object {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES
        int numero = 0; //Variable de tipo entero
        String letras = ""; //Variable de tipo String
        boolean booleana = true; //Variable booleana
        double numeroGigante = 00; //Variable doble de tamaño
        float numeroDecimal = 0; //Variable punto flotante
        char caracter = 'a'; //Variable de un caracter
        char[] Arreglo = new char[10]; //Arreglo de caracteres con 10 índices
        Object objeto = null; //Objeto de tipo Object
        //INSTANCIAS DE LAS CLASES
        //NombreClase nombreInstancia = new NombreClase(variables);
        Clase c1 = new Clase(numero, letras);
        //Instancia del constructor de la NuevaClase en el paquete diferente
        paqueteNuevo.NuevaClase nc = new paqueteNuevo.NuevaClase(numero, letras);
        Clase c2 = new Clase(); //Instancia de la Clase "Clase" con constructor vacío
        
        //Llamado de un método de la clase "Clase"
        c1.setX(numero);
        c1.getX();
        
        //SENTENCIAS DE IMPRESIÓN
        System.out.println("HOLA MUNDO"); //Impresión de Consola
        //SENTENCIAS DE TIPOS DE JOptionPane -Ventana de Mensaje Emergente-
        JOptionPane.showMessageDialog(null, "Error!", "ERROR", JOptionPane.ERROR_MESSAGE); //Mensaje de Tipo Error
        JOptionPane.showMessageDialog(null, "El mensaje", "INFORMACION", JOptionPane.INFORMATION_MESSAGE); //Mensaje de Tipo Informativo         
        JOptionPane.showMessageDialog(null, "Cuidado!", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE); //Mensaje de Tipo Advertencia
        JOptionPane.showMessageDialog(null, "Sin icono", "MENSAJE", JOptionPane.PLAIN_MESSAGE); //Mensaje de Tipo Plano -sin icono-
    }
}
