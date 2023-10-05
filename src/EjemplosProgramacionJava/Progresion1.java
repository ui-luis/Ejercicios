package EjemplosProgramacionJava;

import java.util.Scanner;

/**
 * Hallar cuantos terminos hay en la progresion aritmetica y las suma de todos los
 * terminos de la forma 5, 8, 11, 14, 17, 20, 23.....n
 */
public class Progresion1 {
    public static void main(String[] args) {
        generacion();
    }
    public static void generacion(){
        int suma = 0,con = 0;

        for (int i = 5; i <= 10000; i+=3) {
            suma +=i;
            con++;
        }
        System.out.println("La suma es : "+suma);
        System.out.println("La cantidad de numero en la serie es : "+con);
    }
}
