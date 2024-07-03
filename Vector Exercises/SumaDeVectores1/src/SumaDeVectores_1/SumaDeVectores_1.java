/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SumaDeVectores_1;

import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class SumaDeVectores_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Se le pide al usuario la longitud del vector
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del vector1"));
        int vector1[] = new int[n];

        int m = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del segundo vector"));
        int vector2[] = new int[m];
        
        // Se evalua si el vector es de igual longitud y si lo es se hara la suma
        // De los vectores y se imprimira el vector resultante
        if (n == m) {
            // Carga del vector 1
            for (int i = 0; i < vector1.length; i++) {
                int numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite los numeros para el vector 1"));
                vector1[i] = numeros;
            }
            
            // Impresion del vector 1
            System.out.println("Numero del vector 1");
            for (int i = 0; i < vector1.length; i++) {
                System.out.print("|" + vector1[i]);
            }
            
            // Carga del vector 2
            for (int i = 0; i < vector2.length; i++) {
                int numeros2 = Integer.parseInt(JOptionPane.showInputDialog("Digite los numeros para el vector 2"));
                vector2[i] = numeros2;
            }
            System.out.println("");
            System.out.println("Numeros del vector 2");
            for (int i = 0; i < vector2.length; i++) { // Impresion del vector 1
                System.out.print("|" + vector2[i]);
            }
            System.out.println("");

            // inicializacion del vector resultante
            int sum[] = new int[n];
            for (int i = 0; i < sum.length; i++) { // Se suma los dos vectores y se agrega al vector resultante
                sum[i] = vector1[i] + vector2[i];
            }
            
            System.out.println("Vector Resultante de la suma de dos vectores");
            for (int i = 0; i < sum.length; i++) { // Impresion del vector resultante
                System.out.print("|" + sum[i]);
            }
            System.out.println("");
        } else {
            System.out.println("La longitud de los dos vectores no son iguales");

        }
    }

}
