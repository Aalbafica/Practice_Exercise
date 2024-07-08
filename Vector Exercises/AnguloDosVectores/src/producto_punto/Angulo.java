/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package producto_punto;

import java.util.Scanner;

/**
 *
 * @author willi
 */
public class Angulo {

    /**
     * @param args the command line arguments
     */
    
    // Ejercicio sobre el calculo del angulo entre dos vectores
    // Para ello se necesita el producto punto y sus magnitudes para satisfacer
    // La formula de como hallar el angulo entre dos vectores
    // Formula: cos(θ) = A*B/|A|*|B|
    public static void main(String[] args) {

        int resultado = 0;
        int u[] = {3, -1, 2};
        int v[] = {-4, 0, 2};

        // Producto punto de los dos vectores
        for (int i = 0; i < v.length; i++) {
            resultado += u[i] * v[i];
        }

        System.out.println("El resultado del producto punto es: "+resultado);
        
        // Magnitud del primer vector (U)
        double longitud = 0;
        for (int i = 0; i < u.length; i++) {
            longitud += u[i]*u[i];
        }
        double magnitud = Math.sqrt(longitud);
        System.out.println("La magnitud del vector u es: "+magnitud);
        
        // Magnitud del segundo vector (V)
        double longitud2 = 0;
        for (int i = 0; i < v.length; i++) {
            longitud2 += v[i]*v[i];
        }
        double magnitud2 = Math.sqrt(longitud2);
        System.out.println("La magnitud del vector v es: "+magnitud2);
        
        // Calculo del angulo entre dos vectores: cos(θ) = U * V/ |U|*|V|
        double CosTheta = resultado/(magnitud*magnitud2);
        double angulo = Math.acos(CosTheta)*(180/Math.PI); // Conversion de radianes a grados
        System.out.println("El angulo entre los dos vectores es: "+ angulo);
        // El resultado que va imprimir va a hacer en grados
    }

}
