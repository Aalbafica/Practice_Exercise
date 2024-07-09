/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_number3;

import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class Exercise_Number3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Este programa se encarga de informarle al usuario cual fue la ciudad
        // con la tempertaturas mas baja y cual con la temperatura mas alta
        String ciudades[] = new String [5];
        double tempMax [] = new double [5];
        double tempMin [] = new double [5];
        String nombres;
        double tempMax1,tempMin1;
        
        // carga de los vectores
        for (int i = 0; i < ciudades.length; i++) {
            nombres = JOptionPane.showInputDialog("Digite los nombres de las ciudades");
            ciudades[i] = nombres;
            
            tempMax1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la temperatura maxima de la ciudad"));
            tempMax[i] = tempMax1;
            
            tempMin1 = Double.parseDouble(JOptionPane.showInputDialog("Digite la temperatura minima de la ciudad"));
            tempMin[i] = tempMin1;
            
            System.out.println(ciudades[i]);
            System.out.println("Temperatura Maxima: "+tempMax[i]);
            System.out.println("Temperatura Minima: "+tempMin[i]);
            
        }
        
        // Estas variables se declaran para hacer la busqueda de cual fue la
        // La temperatura mayor y cual fue la menor
        
        double mayor = tempMax[0];
        double menor = tempMin[0];
        
        
        String ciudadMayor = ciudades[0];
        String ciudadMenor = ciudades[0];
        
        // Rcorrido para evaluar cual fue la ciudad con la temperatura mas alta
        // Y cual fue la minima
        for (int i = 0; i < ciudades.length; i++) {
            if (tempMax[i]>mayor) {
                mayor = tempMax[i];
                ciudadMayor = ciudades[i];
            }
            if (tempMin[i] < menor) {
                menor = tempMin[i];
                ciudadMenor = ciudades[i];
            }
        }
        
        System.out.println("La ciudad de: " + ciudadMayor + " Tuvo una temperatura maxima de: "+ mayor);
        System.out.println("La ciudad de: " + ciudadMenor + " Tuvo una temperatura minima de: "+ menor);
        

    }
    
}
