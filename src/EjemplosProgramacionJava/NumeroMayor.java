package EjemplosProgramacionJava;

import java.util.Scanner;

/**
 * Ingresando un 3 numero devuelve el mayor de los 3.
 */
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1, num2,num3;
        System.out.println("Ingrese el primer numero: ");
        num1 = obj.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = obj.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = obj.nextInt();

        System.out.println("El numero mayor es: " + mayor(num1, num2,num3));

    }
    public static int mayor(int num1, int num2,int num3){
        int mayor;
        if(num1 > num2 && num1 > num3){
            mayor = num1;
        }else if(num2 > num1 && num2 > num3){
            mayor = num2;
        }else{
            mayor = num3;
        }
        return mayor;

    }
}
