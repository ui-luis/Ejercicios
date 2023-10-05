package EjemplosProgramacionJava;

import java.util.Scanner;

/**
 * CAlculo de la distancia de dos puntos datos P1 y P2
 */
public class CalcularDistacia {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double x1, y1, x2, y2;

        System.out.println("Ingrese el punto 1 X");
        x1 = obj.nextDouble();

        System.out.println("Ingrese el punto 1 Y");
        y1 = obj.nextDouble();

        System.out.println("Ingrese el punto 2 X");
        x2 = obj.nextDouble();

        System.out.println("Ingrese el punto 2 Y");
        y2 = obj.nextDouble();

        double resultado = distancia(x1, y1, x2, y2);
        System.out.println("La distancia entre los puntos es: " + resultado);

    }

    public static double distancia(double x1, double y1, double x2, double y2){
        double distancia = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
        return distancia;
    }
}
