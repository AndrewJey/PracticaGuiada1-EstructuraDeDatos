/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PAQUETES DE DATOS:
package figurasgeometricas;
//IMPORTES ó IMPORTACIONES:

import javax.swing.*; //Llama a todos los métodos de la librería javax.swing
import Figuras.*; //Llama a todas las clases del paquete Figuras
import Figuras.Cuadrado;
import Figuras.Rectangulo;
import Figuras.TrianguloE;

/**
 *
 * @author Andrés J. Jiménez Leandro Created: 2015-11-12 Jueves
 */
public class FigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VARIABLES:
        int lal = Integer.parseInt(JOptionPane.showInputDialog("Digite su Lado-Alto-Largo: "));
        int bal = Integer.parseInt(JOptionPane.showInputDialog("Digite su Lado-Base-Ancho: "));
        //INSTANCIAS:
        //NombreDeLaClase nombreDeLaInstancia = new NombreDeLaClase(variables);
        ClaseFigurasGeometricas cfg = new ClaseFigurasGeometricas(lal, bal);
        Figuras.Cuadrado c1 = new Figuras.Cuadrado(lal, bal); //Se llama del paquete
        Rectangulo r1 = new Rectangulo(lal, bal); //No ocupo llamar al paquete, porque está importado en la sección correspondiente
        Rectangulo r2 = new Rectangulo();
        Figuras.TrianguloE t1 = new Figuras.TrianguloE(lal, bal);
        //USO DE SET Y GET:
        cfg.setLal(lal);
        cfg.getLal();
        cfg.setLab(bal);
        cfg.getLab();
        //IMPRESIONES:
        JOptionPane.showMessageDialog(null, cfg.toString(), "Figuras Geométricas", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, c1.toString(), "Cuadrado", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, r1.toString(), "Rectángulo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, t1.toString(), "Triángulo Equilátero", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, r2.toString(), "Rectángulo Vacío", JOptionPane.PLAIN_MESSAGE);
    }
}