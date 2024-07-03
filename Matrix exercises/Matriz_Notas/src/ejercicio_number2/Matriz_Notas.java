/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_number2;

import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Matriz_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este programa llena la matriz con algunas notas de los estudiantes digitados
        // Por el usuario donde se calcula el promedio de notas de cada de estudiante
        // Esos promedios calculados se agregan a la columna faltante de la matriz
        
        
        // la matriz es de 4x4: 4 filas y 4 columnas
        double matrizNotas [][] = new double [4][4];
        
        // Aqui se llena la matriz donde se llena toda la filas, pero no se llenan
        // Todas las columnas, notese que el for que recorre la columna no llega hasta 
        // El indice 3 (0,1,2)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                double notas = Double.parseDouble(JOptionPane.showInputDialog("Digite las notas de los estudiantes en la fila "+ i + " y columna "+ j));
                matrizNotas[i][j] = notas;
                
                matrizNotas[i][3] += matrizNotas[i][j]; // i = 0 // j=2

                
            }
            matrizNotas[i][3] /=3;
        }
        
        
        
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                matrizNotas[i][3] += matrizNotas[i][j]; // i = 0 // j=2
//            }   
//            matrizNotas[i][3] /=3;
//        }
        

        // Imprimiendo la matriz
        for (int i = 0; i < 4; i++) {
            System.out.println("Las Notas del alumno Numero " + i+ " son: ");
            for (int j = 0; j < 4; j++) {
                System.out.print("|"+ matrizNotas[i][j]);
            }
            System.out.println("");
        }
        
    }
    
    
    
}
