package EjemplosProgramacionJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgarrandoErrores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            System.out.println(num1/num2);
        }catch (ArithmeticException e){
            System.out.println("Error: division by zero");

        }catch (InputMismatchException e){
            System.out.println("Error: wrong value type");
        }


    }
}
