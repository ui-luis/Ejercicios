package EjemplosProgramacionJava;

/**
 * Programa que que evalua la e^(numero) con una tolerancia de error = 0.00001
 * e = 1 + x + (x^2)/2! + (x^3)/3! +(x^4)/4! + .......+ (x^n)/n!
 */

public class Exponencial {
    public static void main(String[] args) {
        int exp = 2;
        int iteraciones = 18;
        exponente(exp, iteraciones);
    }

    static void exponente(int exp, int iterar) {

        double ants1 = 0,
                ants2 = 0,
                suma = 1.0,
                error;
        for (int nu = 1; nu < iterar; nu++) {

            double fac = 1.0;
            for (int j = 1; j <= nu; j++)
                fac *= j;
            suma += ((Math.pow(exp, nu)) / fac);
            if (nu % 2 == 0) {
                ants2 = suma;
                error = suma - ants1;
            } else {
                ants1 = suma;
                error = suma - ants2;
            }
            System.out.println(String.format("%.7f", error));

        }
        System.out.println("e^(" + exp + ") = " + String.format("%.7f", suma));
    }
}
