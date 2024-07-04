/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Este es el mismo ejercio de SumaDeVectores1 pero con metodos y mas
        // Organizado
        // Ejercicio de suma de dos vectores
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del vector1"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Digite la longitud del vector2"));
        // Inicializacion de los dos vectores
        int vector1[] = new int[n];
        int vector2[] = new int[m];
        // Inicializacion del vector resultante
        int sum[] = new int[n];

        if (n == m) {
            leerVector("Digite los numeros para el vector1", vector1);
            leerVector("Digite los numeros para el vector2", vector2);

            imprimirVector(vector1);
            imprimirVector(vector2);

            // Un bucle donde hace la suma de los dos vectores y se guarda en el
            // Vector resultante
            for (int i = 0; i < sum.length; i++) {
                sum[i] = vector1[i] + vector2[i];
            }
            System.out.println("Vector de la suma de los vectores");
            imprimirVector(sum);

        } else {
            System.out.println("La longitud no es la misma para los dos vectores");
        }

    }

    private static void leerVector(String mensaje, int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }
    }

    private static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("|" + vector[i]);
        }
        System.out.println("");
    }
}
