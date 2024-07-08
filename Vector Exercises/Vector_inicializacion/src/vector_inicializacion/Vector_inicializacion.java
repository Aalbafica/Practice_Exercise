/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector_inicializacion;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class Vector_inicializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inicializacion
        int vector[] = new int [4];
        // Asignacion por teclado
        Scanner teclado = new Scanner(System.in);
        // Carga del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el indice " + i);
            vector[i] = teclado.nextInt();
        }

        // Recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Estoy en el indice " + i);
            System.out.println("Tengo guardado un: " + vector[i]);
            System.out.println("----------------");
        }
    }

}
