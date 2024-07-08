/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Vectores2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Programa donde calcula el angulo entre dos vectores siguiendo la formula
        // cos(θ) = A*B/|A|*|B|. 
        // El A*B es el producto punto de los vectores
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del vector1"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del vector2"));
        int vector1 [] = new int [a];
        int vector2 [] = new int [b];
        
        llenarVector("Digite los elementos para el vector 1", vector1);
        llenarVector("Digite los elementos para el vector 2", vector2);
        
        // producto punto del vector
        double productoPunto = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoPunto += vector1[i]*vector2[i];
        }
        JOptionPane.showMessageDialog(null, "el producto punto de los dos vectores es: "+ productoPunto);
        
        if (productoPunto ==  0) {
            JOptionPane.showMessageDialog(null, "Los vectores son ortogonales ya que su producto punto es 0");
        }
        
        // magnitud del vector
        double longitud = longitudVector(vector1);;
        double longitud2 = longitudVector(vector2);
        JOptionPane.showMessageDialog(null, "La magnitud del vector 1 es: "+ longitud);
        JOptionPane.showMessageDialog(null, "La magnitud del vector 2 es: "+ longitud2);

        
        // Angulo del vector
        hallarAngulo(productoPunto, longitud, longitud2);
    }

    private static void llenarVector(String mensaje,  int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }
    }
    // magnitud del vector
    private static double longitudVector(int[] vector) {
        double suma = 0;
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i]*vector[i];
        }
        return Math.sqrt(suma);
    }
    // angulo del vector
    private static void hallarAngulo(double productoPunto, double longitud, double longitud2) {
        double cosTheta = productoPunto/(longitud*longitud2);
        double angulo = Math.acos(cosTheta)*(180/Math.PI);
        JOptionPane.showMessageDialog(null, "El calculo del angulo de los vectores es: "+ angulo);
    }

    

   

}
