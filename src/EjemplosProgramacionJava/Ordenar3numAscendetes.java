package EjemplosProgramacionJava;

import java.util.Scanner;

/**
 * Dado 3 numeros se deben ordenar de forma ascendente.
 */
public class Ordenar3numAscendetes {
    public static void main(String[] args) {

        OrdenarNumero();
    }

    public static void OrdenarNumero() {

        Scanner obj = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese el primer numero: ");
        num1 = obj.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = obj.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = obj.nextInt();

        if (num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.println(num1 + " " + num2 + " " + num3);

        } else if (num1 < num2 && num1 < num3 && num3 < num2) {
            System.out.println(num1 + " " + num3 + " " + num2);

        } else if (num2 < num1 && num2 < num3 && num1 < num3) {
            System.out.println(num2 + " " + num1 + " " + num3);

        } else if (num2 < num1 && num2 < num3 && num3 < num1) {
            System.out.println(num2 + " " + num3 + " " + num1);

        } else if (num3 < num1 && num3 < num2 && num1 < num2) {
            System.out.println(num3 + " " + num1 + " " + num2);
        } else {
            System.out.println(num3 + " " + num2 + " " + num1);
        }


    }
}
