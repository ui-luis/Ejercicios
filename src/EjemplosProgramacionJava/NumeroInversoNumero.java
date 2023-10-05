package EjemplosProgramacionJava;

import java.util.Scanner;

/**
 * Leer un numero entero de 3 cifras y que devuelva su inverso
 */
public class NumeroInversoNumero {
    public static void main(String[] args) {
        int num;
        Scanner obj = new Scanner(System.in);
        System.out.println("Dijite el numero : ");
        num = obj.nextInt();
        System.out.println("El numero invertido es: " + inversoNumero(num));
    }
    public static int inversoNumero(int num){
       int a,b,c,inverso;
       c = num % 10;
       num = num / 10;
       b = num % 10;
       a = num / 10;
       inverso = c * 100 + b * 10 + a;
       return inverso;
    }


}
