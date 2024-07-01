/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebatrainee;

import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class PruebaTrainee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String teatro[][] = new String[10][10];
        String op = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                teatro[i][j] = "L";
            }
        }

        imprimirMatriz(teatro);

        while (!op.equalsIgnoreCase("Finish")) {
            boolean ok = false;
            while (ok != true) {
                int fila = obtenerFila();
                if (fila >= 0 && fila <= 9) {
                    int columna = obtenerAsiento();
                    if (columna >= 0 && columna <= 9) {
                        ok = true;
                        reservaAsiento(fila, columna, teatro);
                    } else {
                        JOptionPane.showMessageDialog(null, "El asiento ingresado no es valido");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La fila ingresada no es valida");
                }
            }
            String pregunta = JOptionPane.showInputDialog("Desea ver el mapa de los asientos? Escriba Si o cualquier letra para el No");
            if (pregunta.equalsIgnoreCase("Si")) {
                System.out.println("-----------------");
                imprimirMatriz(teatro);
            }

            op = JOptionPane.showInputDialog("Si desea finalizar escriba finish, si no escriba cualquier otra letra");
        }

        // dado de un conjunto de enteros de un numero objetivo debes devolver el indice de los dos numeros
        // que suman al numero objetivo
    }

    // cuando se usa el static se comporte en toda la clase
    private static int obtenerFila() {
        String numFila = JOptionPane.showInputDialog("Digite la fila en la que desea sentarse");
        if (!numFila.isEmpty()) {
            return Integer.parseInt(numFila);
        }
        return -1;
    }

    private static int obtenerAsiento() {
        String numAsiento = JOptionPane.showInputDialog("Digite el asiento de esa fila donde desea sentarse");
        if (!numAsiento.isEmpty()) {
            return Integer.parseInt(numAsiento);
        }
        return -1;
    }

    private static void reservaAsiento(int fila, int columna, String[][] teatro) {
        if (teatro[fila][columna].equals("L")) {
            JOptionPane.showMessageDialog(null, "Su reserva fue realizada con exito");
            teatro[fila][columna] = "X";
        } else {
            JOptionPane.showMessageDialog(null, "El asiento ya esta ocupado por favor eliga otro");
        }
    }

    private static void imprimirMatriz(String[][] teatro) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            for (int j = 0; j < 10; j++) {
                System.out.print("|" + teatro[i][j]);
            }
            System.out.println("");

        }

    }

}
