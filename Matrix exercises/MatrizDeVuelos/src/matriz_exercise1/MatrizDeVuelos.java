/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz_exercise1;

import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class MatrizDeVuelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // El objetivo de este programa es realizar reserva de vuelos donde
        // Al usuario se le pide un numero de destino, numero de vuelo y cantidad de pasajes
        // Se cargo una matriz para los destinos y los pasajes que tendra disponible el usuario
        // La salida es que cada vez que el usuario reserva un destino, un vuelo
        // y la cantidad de pasajes, quedara registrado en la matriz y la cantidad
        // De pasajes se ira actualizando conforme a la cantidad de pasajes que se haya digitado
        
        int matrizVuelos[][] = new int[6][3];
        String op = "";
        
        // Llenado de la matriz
        cargarMatriz(matrizVuelos);
        // Impresion de la matriz
        imprimirMatriz(matrizVuelos);
        
        // Un bucle while ya que no se sabe cuantas reservas pedira el usuario
        // Se terminara el programa cuando el usuario lo indique
        while (!op.equalsIgnoreCase("finish")) {
            
            int numDestino = obtenerDestino();
            
            if (numDestino >= 0 && numDestino <= 5) {
                int numVuelo = obtenerVuelo();
                if (numVuelo == 0 || numVuelo == 1 || numVuelo == 2) {
                    int cantPasajes = obtenerPasajes();
                    if (cantPasajes > 0) {
                        numeroVuelo(numDestino, numVuelo, cantPasajes, matrizVuelos);
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor digite la cantidad de pasajes");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Digite un numero valido");
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Digite un numero valido");
            }
            
            op = JOptionPane.showInputDialog("Si quiere terminar el proceso escriba 'Finish', de lo contrario escriba cualquier tecla");
            imprimirMatriz(matrizVuelos);
        }
        
    }
    
    // metodo 1 del llenado de la matriz
    private static void cargarMatriz(int[][] matrizVuelos) {
        int vuelos;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                vuelos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de asientos para: " + i + " Horario: " + j));
                matrizVuelos[i][j] = vuelos;
            }
        }
    }
    
    // metodo 2 de la impresion de la matriz
    private static void imprimirMatriz(int[][] matrizVuelos) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + matrizVuelos[i][j]);
            }
            System.out.println("");
        }
    }
    
    // metodo 3 donde se le pedira al usuario que destino quiere ir
    private static int obtenerDestino() {
        String numDestino = JOptionPane.showInputDialog("Ingrese el numero de destino al que quiera dirigirse:\n"
                + "0. Rio de janeiro\n"
                + "1. Cancun\n"
                + "2. Madrid\n"
                + "3. Roma\n"
                + "4. Milan\n"
                + "5. Iguazu");
        if (!numDestino.isEmpty()) {
            return Integer.parseInt(numDestino);
            
        }
        return -1;
    }
    
    // Metodo 4: donde el usuario digita el numero de vuelo y dependiendo de su eleccion
    // se le mostrara la cantidad de pasajes por cada horario
    private static int obtenerVuelo() {
        String vuelo = JOptionPane.showInputDialog("Digite el numero de vuelo para partir\n"
                + "0. Mañana\n"
                + "1. Mediodia\n"
                + "2. Noche");
        if (!vuelo.isEmpty()) {
            return Integer.parseInt(vuelo);
            
        }
        return -1;
    }
    
    // Metodo 5: Se obtiene la cantidad de pasajes del usuario
    private static int obtenerPasajes() {
        String pasajes = JOptionPane.showInputDialog("Digite la cantidad de pasajes que necesita");
        if (!pasajes.isEmpty()) {
            return Integer.parseInt(pasajes);
            
        }
        return -1;
    }
    
    // Metodo 6: Segun la cantidad de pasajes digitados por el usuario
    // Este evaluara si hay disponible esa cantidad o no, en caso tal que haya
    // disponibilidad se actualizara la cantidad de pasajes que se digito en la matriz
    // si no, no actualizara nada
    private static void numeroVuelo(int numDestino, int numVuelo, int cantPasajes, int[][] matrizVuelos) {
        
        if (matrizVuelos[numDestino][numVuelo] >= cantPasajes) {
            JOptionPane.showMessageDialog(null, "Su reserva fue realizada con exito");
            matrizVuelos[numDestino][numVuelo] -= cantPasajes;
        } else {
            JOptionPane.showMessageDialog(null, "Disculpe, no se puedo completar su operacion dado que no hay asiento disponibles");
        }
        
    }
    
}
