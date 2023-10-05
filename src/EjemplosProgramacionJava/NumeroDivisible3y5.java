package EjemplosProgramacionJava;

import java.util.Scanner;

/**
 * Ejercicio de la divisibilidad de un numero entre 3 y 5
 */
public class NumeroDivisible3y5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = obj.nextInt();

        numeroDivisible(num);

    }

    public static void numeroDivisible(int num){

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("El numero es divisible entre 3 y 5");
        }else{
            System.out.println("El numero no es divisible entre 3 y 5");
        }
    }

}
