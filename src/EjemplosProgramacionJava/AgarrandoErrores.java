package EjemplosProgramacionJava;

import java.util.Scanner;

public class AgarrandoErrores {
    public static void main(String[] args) {
        System.out.println(div(42, 0));

    }

    public static int div(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("No se puede divir por cero");
        else
            return a / b;

    }
}
