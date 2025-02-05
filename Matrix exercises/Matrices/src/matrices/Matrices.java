/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Este programa lo que hace es el llenado de una matriz indicandole al
        // Usuario la fila y columna donde esta digitando, dejando de manera clara
        // las posiciones en las que se van a imprimir
        
        // Declaracion
        int matriz[][] = new int [3][3];
        
//        // Asignacion Manual
//        matriz[0][0] = 5;
//        matriz[0][1] = 13;
//        matriz[0][2] = 96;
//        matriz[1][0] = 35;
//        matriz[1][1] = 33;
//        matriz[1][2] = 71;
//        matriz[2][0] = 446;
//        matriz[2][1] = 228;
//        matriz[2][2] = 24;
        
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f<3; f++){
            for(int c = 0; c<3; c++){
                System.out.println("Ingrese el valor de la posicion f: "+ f + " c: " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }
        
        // Recorrido
        for (int f = 0; f<3; f++){
            for(int c = 0; c<3; c++){
                System.out.println("El valor de la posicion f: "+ f + " c: " + c);
                System.out.println("es de: "+ matriz[f][c]);
            }
        }
        
    }
    
}
