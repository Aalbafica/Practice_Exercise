/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_number1;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class Ejercicio_Number1 {

    /**
     * @param args the command line arguments
     */
    
    // Programa donde le dice al usuario cuantas veces se repitio un numero
    public static void main(String[] args) {
        // Inicializacion del vector
        int vector [] = new int [15];
        int contador = 0;
        Scanner teclado = new Scanner(System.in);
        
        // Carga del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite los elementos del vector: " + i);
            vector[i]= teclado.nextInt();
            
            
        }
        
        // Se imprime y se evaula cuamtas veces el numero '3' se repite
        for (int i = 0; i < vector.length; i++) {
            System.out.print("|"+vector[i]);
            
            if (vector[i] == 3) {
                contador++;
            }
            
        }
        System.out.println("");
        // Le dice al usuario cuantas veces se repitio el numero 3
        System.out.println("el numero 3 se repitio en el vector: " + contador);
        
        
        
    }
    
}
