/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PAQUETES:
package arreglos;
//IMPORTES:
import javax.swing.JOptionPane;
/**
 *
 * @author Andrés
 */
public class Arreglos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES:
        int p = 4; //Variable entera p
        //tipoDeVariable[] nombreDelArray = new tipoDeVariable[número de índices];                
        String[] arregloString = new String[4]; // Indexación directa
        String[] arregloString2 = new String[p]; // Indexación indirecta (con variable)
        //Siempre los arreglos comienzan en el índice "0" (cero)
        arregloString[0] = "Hola"; //Primer índice
        arregloString[1] = "Mi"; //2do índice
        arregloString[2] = "Mundo"; //3er índice
        arregloString[3] = "Perfecto"; //4to índice                      
        //IMPRESIONES:
        System.out.println("Elemento en índice 0: " + arregloString[0]);
        System.out.println("Elemento en índice 1: " + arregloString[1]);
        System.out.println("Elemento en índice 2: " + arregloString[2]);
        System.out.println("Elemento en índice 3: " + arregloString[3]);
        //Impresión Concatenada, uno por uno....
        JOptionPane.showMessageDialog(null, arregloString[0]
                +" "+arregloString[1]+'\n'+arregloString[2]
                +" "+arregloString[3], "ARREGLO", 
                JOptionPane.ERROR_MESSAGE);        
        //OTRAS FORMAS DE DEFINIR UN ARREGLO:
        //Un arreglo con 3 índices
        int[] myIntArray1 = new int[3];
        String[] myStringArray = new String[3];
        //Un arreglo con 3 índices llenos del 1/a al 3/c
        int[] myIntArray2 = {1,2,3}; //Inserción directa de datos
/*VARIABLES*/int a = 1; int b = 2; int c = 3;
        int[] myIntArray21 = {a,b,c}; //Inserción indirecta de datos (por medio de variables)
        String[] myStringArray2 = {"ab","cde","f"};
        //Lo otros dos ejemplos en uno:
        int[] myIntArray3 = new int[] {1,2,3};     
        int[] myIntArray31 = new int[] {a,b,c};
        String[] myStringArray3 = new String[]{"a","b","c"};
        //CICLO FOR:        
        //Crear mi arreglo con 5 índices
        for(int x = 0; x==5; x++){
            String[] arregloFor1 = new String[x];
        }
        //Crear Arreglo por fuera del for, primero:
        /*String[] arregloFor2 = null;*/
        //Llenar los índices de mi arreglo
        for(int x = 0; x>5; x++){
            String r = JOptionPane.showInputDialog("Escriba el Dato: ");
            String[] arregloFor2 = new String[x];
            arregloFor2[x] = r;
            System.out.println(arregloFor2[x]);
        }
        //JOptionPane.showMessageDialog(null, arregloFor2[0], "ARREGLOFOR2", JOptionPane.WARNING_MESSAGE);                
    }   
}