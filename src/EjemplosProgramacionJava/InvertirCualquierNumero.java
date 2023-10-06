package EjemplosProgramacionJava;

/**
 * Dado un numero entero este debe invertise Eje:
 * 4567
 * inverso  7654
 *
 */

import java.util.Scanner;
public class InvertirCualquierNumero {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite numero : ");
        int num = obj.nextInt();

        System.out.println("El numero queda invertido asi : " + invertir(num));
    }

    public static int invertir(int numero) {
        int suma = 0;
        while (numero > 0) {
            int aux = numero % 10;
            suma = (suma * 10) + aux;
            numero = numero / 10;
        }

        return suma;
    }
}
